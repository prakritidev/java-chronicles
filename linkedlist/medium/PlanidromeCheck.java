package linkedlist.medium;

public class PlanidromeCheck {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(3);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true; // Empty or single-node list is a palindrome

        // Find the middle of the linked list
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        Node secondHalf = reverse(slow.next);
        slow.next = null; // Break the list into two halves

        // Compare the first half with the reversed second half
        Node p1 = head;
        Node p2 = secondHalf;
        while (p1 != null && p2 != null) {
            if (p1.data != p2.data)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        // Reconstruct the original list (if necessary)
        slow.next = reverse(secondHalf);

        return true;
    }

    private static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node reversed = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
