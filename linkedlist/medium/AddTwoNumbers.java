package linkedlist.medium;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Node head = null;
    head=insertNode(head,1);
    head=insertNode(head,3);
    head=insertNode(head,1);
    head=insertNode(head,2);
    head=insertNode(head,4);
    Node head1 = head;
    head = head.next.next.next;
    Node headSec = null;
    headSec=insertNode(headSec,3);
    Node head2 = headSec;
    headSec.next = head;
    //printing of the lists
    System.out.print("List1: "); printList(head1);
    System.out.print("List2: "); printList(head2);
    //checking if intersection is present
    Node answerNode = intersectionPresent(head1,head2);
    if(answerNode == null)  
    System.out.println("No intersection\n");
    else
    System.out.println("The intersection point is "+answerNode.data);
    }

    private static Node intersectionPresent(Node head1, Node head2) {
        Node d1 = head1;
        Node d2 = head2;

        while (d1 != d2) {
            d1 = d1==null ? head2: d1.next;
            d2 = d2==null ? head1: d2.next;
            
        }
        return d1;
    }

    private static void printList(Node head) {
        while(head.next != null) {
            System.out.print(head.data+"->");
                head = head.next;
            }
            System.out.println(head.data);
        
    }

    private static Node insertNode(Node head, int i) {
        Node newNode = new Node(i);
    
        if(head == null) {
            head = newNode;
            return head;
        }
        
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        
        temp.next = newNode;
        return head;
    }
}
