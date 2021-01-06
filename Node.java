public class Node {
  private String data;
  private Node next, prev;

  public Node(String value) {
    data = value;
  }

  public String getData() {
    return this.data;
  }

  public String setData(String value) {
    String oldValue = this.data;
    this.data = value;
    return oldValue;
  }
}
