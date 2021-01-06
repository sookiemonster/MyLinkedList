public class Node {
  private String data;
  private Node next, prev;

  public Node(String value, Node n, Node p) {
    this.data = value;
    this.next = n;
    this.prev = p;
  }

  public String getData() {
    return this.data;
  }

  public String setData(String value) {
    String oldValue = this.data;
    this.data = value;
    return oldValue;
  }

  public Node getNext() {
    return this.next;
  }

  public Node setNext(Node value) {
    Node temp = this.next;
    this.next = value;
    return temp;
  }

  public Node getPrev() {
    return this.prev;
  }

  public Node setPrev(Node value) {
    Node temp = this.prev;
    this.prev = value;
    return temp;
  }

  public String toString() {
    return "" + this.getData();
  }
}
