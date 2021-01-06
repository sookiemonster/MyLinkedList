public class Driver {
  public static void main(String args[]) {
    // Node a = new Node("1", null, null);
    // System.out.println(a.getData());
    // a.setData("2");
    // System.out.println(a.getData());
    // Node b = new Node("3", null, a);
    // System.out.println("ab");
    // System.out.println("Data: " + b.getData());
    // System.out.println("Next: " + b.getNext());
    // System.out.println("Previous: " + b.getPrev());
    // b.setData("4");
    // b.setNext(a);
    // b.setPrev(null);
    // System.out.println("ba");
    // System.out.println("Data: " + b.getData());
    // System.out.println("Next: " + b.getNext());
    // System.out.println("Previous: " + b.getPrev());

    // LINKED LIST TESTING
    MyLinkedList a = new MyLinkedList();
    System.out.println(a);
    System.out.println(a.reverseToString());
    a.add("1");
    System.out.println(a);
    System.out.println(a.reverseToString());
    a.add("2");
    System.out.println(a);
    System.out.println(a.reverseToString());
    a.add("3");
    System.out.println(a);
    System.out.println(a.reverseToString());
  }
}
