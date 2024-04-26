package linkedlist.medium;

public class FindMiddleElement {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node middleNode = findNode(head);
        System.out.println(middleNode);

    }

    public static Node findNode(Node head){
        Node fast = head.next, slow = head;

        while (fast != null && fast.next != null) {
            System.out.println("Fast:" + fast);
            slow = slow.next;
            fast = fast.next.next;
           
        }
        System.out.println("Fast:" + fast);
        return slow;
    }
}
