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
      this.end = temp;
      this.end.setNext(temp);
    }
    size++;
    return true;
  }
}
