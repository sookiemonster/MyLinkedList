public class MyLinkedList {
  private int size;
  private Node start, end;

  public MyLinkedList() {
    this.size = 0;
    this.start = null;
    this.end = null;
  }

  public int size() {
    return this.size;
  }

  public boolean add(String value) {
    if (this.size() == 0) {
      Node temp = new Node(value, null, null);
      this.start = temp;
      this.end = temp;
    } else {
      Node temp = new Node(value, null, this.end);
      this.end.setNext(temp);
      this.end = temp;
    }
    size++;
    return true;
  }

  public void add(int index, String value) {
    if (index > this.size() || index < 0) {
      throw new IndexOutOfBoundsException("Received " + index + " " +
        "when size is " + this.size());
    }
    Node element = new Node(value, null, null);
    if ((index == 0 && this.size() == 0) || (index == this.size())) {
      this.add(value);
    } else if (index == 0){
      element.setNext(toIndex(index));
      element.getNext().setPrev(element);
      start = element;
      size++;
    } else {
      Node temp = toIndex(index);
      element.setNext(temp);
      Node temp2 = temp.getPrev();
      temp.setPrev(element);

      element.setPrev(temp2);
      temp2.setNext(element);
      size++;
    }
  }

  public String remove(int index) {
    if (index >= this.size() || index < 0) {
      throw new IndexOutOfBoundsException("Received " + index + " " +
        "when size is " + this.size());
    }

    if (index == 0 && this.size() == 1) {
      String temp = this.start.toString();
      this.start = null;
      this.end = null;
      size--;
      return temp;

    } else if (index == 0 && this.size() > 1) {
      Node temp = this.start;
      this.start = temp.getNext();
      this.start.setPrev(null);
      temp.setNext(null);
      size--;
      return temp.toString();

    } else if (index == this.size()-1 && this.size() > 1) {
      Node temp = this.end;
      this.end = temp.getPrev();
      this.end.setNext(null);
      temp.setPrev(null);
      size--;
      return temp.toString();

    } else {
      Node temp = toIndex(index);
      Node tempNext = temp.getNext();
      Node tempPrev = temp.getPrev();

      tempNext.setPrev(tempPrev);
      tempPrev.setNext(tempNext);
      temp.setNext(null);
      temp.setPrev(null);
      size--;
      return temp.toString();
    }
  }

  public void extend(MyLinkedList other) {
    this.end.setNext(other.start);
    other.start.setPrev(this.end);

    this.size += other.size();
    other.size = 0;
    other.start = null;
    other.end = null;
  }

  public String get(int index) {
    return toIndex(index).toString();
  }

  public String set (int index, String value) {
    if (index >= this.size() || index < 0) {
      throw new IndexOutOfBoundsException("Received " + index + " " +
        "when size is " + this.size());
    }

    String original = get(index);
    if (index == 0) {
      Node element = new Node(value, start.getNext(), null);
      start.getNext().setPrev(element);
      start = element;
    } else if (index == this.size()-1) {
      Node element = new Node(value, null, end.getPrev());
      end.getPrev().setNext(element);
      end = element;
    } else {
      Node temp = toIndex(index);
      Node element = new Node(value, temp.getNext(), temp.getPrev());
      temp.getNext().setPrev(element);
      temp.getPrev().setNext(element);
    }
    return original;
  }

  private Node toIndex(int n) {
    Node current = start;
    int counter = 0;
    while (current != null && counter < n) {
      current = current.getNext();
      counter++;
    }
    return current;
  }

  public String toString() {
    Node current = start;
    String result = "{";
    while (current != null) {
      result += current.toString();
      if (current.getNext() != null) {
        result += ", ";
      }
      current = current.getNext();
    }
    return result +"}";
  }

  public String reverseToString() {
    Node current = end;
    String result = "{";
    while (current != null) {
      result += current.toString();
      if (current.getPrev() != null) {
        result += ", ";
      }
      current = current.getPrev();
    }
    return result +"}";
  }
}
