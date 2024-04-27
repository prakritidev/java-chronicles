package linkedlist.medium;

public class StartingPointOfALoop {
  public static void main(String[] args) {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    node1.next = node2;
    Node node3 = new Node(3);
    node2.next = node3;
    Node node4 = new Node(4);
    node3.next = node4;
    Node node5 = new Node(5);
    node4.next = node5;
    node5.next = node4;

    Node head = node1;

    Node loopNode = getLoopNode(head);

    System.out.println(loopNode.toString());

  }

  private static Node getLoopNode(Node head) {

    Node slow = head, fast = head;
    Integer loopLength = 0;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        slow = head;
        while (slow != fast) {
          slow = slow.next;
          fast = fast.next;
          loopLength++;
        }
        System.out.println("Total Length is: " + loopLength);
        return slow;
      }
    }

   
    return null;
  }
}
