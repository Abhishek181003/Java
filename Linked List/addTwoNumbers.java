class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp=dummy;
        int carry = 0;
        while(l1!=null || l2!=null){
            int val1 =0 , val2 = 0;
            if(l1!=null) val1 = l1.val; // This indicate that l1 list is not empty
            if(l2!=null) val2 = l2.val; // This indicate that l3 list is not empty
            int ans = val1 + val2 + carry; // Total sum after using carry
            if(ans<=9) carry = 0; // number is not of two digit
            else carry = 1; // number is of two digit
            ListNode node = new ListNode(ans%10); // filling the last digit of the number
            temp.next = node;
            temp=temp.next;
            if(l1!=null)  l1 =l1.next; // move to next node iff pointer is not at null 
            if(l2!=null)  l2 =l2.next;
        }
        if(carry!=0){ // This means carry remaining and extra node is required
            ListNode node = new ListNode(1);
            temp.next = node;
            temp=temp.next;
        }
        return dummy.next;
    }
}
