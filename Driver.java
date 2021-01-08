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
    System.out.println("Size: " + a.size());
    System.out.println(a.reverseToString());
    System.out.println();
    a.add(0, "0");
    a.add("1");
    System.out.println("Size: " + a.size());
    System.out.println(a);
    System.out.println(a.reverseToString());
    System.out.println();
    a.add("2");
    System.out.println("Size: " + a.size());
    System.out.println(a);
    System.out.println(a.reverseToString());
    System.out.println();
    a.add("3");
    a.add(4, "bb");
    a.add(4, "4");
    System.out.println("Size: " + a.size());
    System.out.println(a);
    System.out.println(a.reverseToString());
    System.out.println();
    for (int i = 0; i < a.size(); i++) {
      System.out.println(a.get(i));
    }
    System.out.println();
    System.out.println(a.set(0, "start"));
    System.out.println("Size: " + a.size());
    System.out.println(a);
    System.out.println(a.reverseToString());
    System.out.println();

    System.out.println(a.set(a.size()-1, "end"));
    System.out.println("Size: " + a.size());
    System.out.println(a);
    System.out.println(a.reverseToString());
    System.out.println();

    System.out.println(a.set(1, "mid"));
    System.out.println("Size: " + a.size());
    System.out.println(a);
    System.out.println(a.reverseToString());
    System.out.println();

    System.out.println(a.remove(1));
    System.out.println("Size: " + a.size());
    System.out.println(a);
    System.out.println(a.reverseToString());
    System.out.println();

    a.add(1, "owo");
    System.out.println("Size: " + a.size());
    System.out.println(a);
    System.out.println(a.reverseToString());
    System.out.println();

    System.out.println(a.remove(0));
    System.out.println("Size: " + a.size());
    System.out.println(a);
    System.out.println(a.reverseToString());
    System.out.println();

    System.out.println(a.remove(a.size() - 1));
    System.out.println("Size: " + a.size());
    System.out.println(a);
    System.out.println(a.reverseToString());
    System.out.println();

    MyLinkedList b = new MyLinkedList();
    b.add("new");
    System.out.println("Size: " + b.size());
    System.out.println(b);
    System.out.println(b.reverseToString());
    System.out.println(b.remove(0));
    System.out.println(b);
    System.out.println(b.reverseToString());
    System.out.println();
    b.add("again"); b.add("anotherone");
    System.out.println(b);
    System.out.println(b.reverseToString());
    System.out.println();

    // a.set(-1, "nope"); ERRORS
    // a.set(a.size(), "no"); ERRORS
  }
}
