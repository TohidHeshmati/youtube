class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LeetCode02 {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(4, a1);
        ListNode a3 = new ListNode(2, a2);

        ListNode b1 = new ListNode(4);
        ListNode b2 = new ListNode(6, b1);
        ListNode b3 = new ListNode(5, b2);


        ListNode ans = addTwoNumbers(a3, b3);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null;
        int carry = 0;
        ListNode pointer = null;
        while (l1 != null || l2 !=null) {
            int sum = carry + (l1 != null? l1.val : 0) + (l2 != null? l2.val : 0);
            carry = sum/10;
            ListNode temp = new ListNode(sum % 10);

            if (ans == null)
                ans = temp;
            else
                pointer.next = temp;

            pointer = temp;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry > 0)
            pointer.next = new ListNode(carry);

        return ans;
    }
}
