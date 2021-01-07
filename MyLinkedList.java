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
    if (index > this.size()) {
      throw new IndexOutOfBoundsException("Received: " + index);
    }
    Node element = new Node(value, null, null);
    if ((index == 0 && this.size() == 0) || (index == this.size())) {
      this.add(value);
    } else if (index == 0){
      element.setNext(toIndex(index));
      element.getNext().setPrev(element);
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

  public String get(int index) {
    return toIndex(index).toString();
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
