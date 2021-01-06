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
