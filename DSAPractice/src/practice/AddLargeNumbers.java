package practice;


class ListNode{
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class AddLargeNumbers {

/*
num1=999
num2=1;
 */
    public static ListNode addLinkedList(ListNode head1 ,ListNode head2){
        ListNode reversedHead2= reverseLinkedList(head1);
        ListNode reversedHead1= reverseLinkedList(head2);
        ListNode reversedResultHead = new ListNode();
        ListNode answer= reversedResultHead;
        int carry=0;
        while(reversedHead1!=null && reversedHead2!=null){

            int digitSum= reversedHead1.val+reversedHead2.val+carry; //10
            carry=0;
            if(digitSum>9)// true
            {
                carry = 1;
                digitSum=digitSum%10;
            }
            reversedResultHead.next=new ListNode(digitSum,null); // 0
           // System.out.println(digitSum +" inside first while");
            reversedResultHead=reversedResultHead.next;
            reversedHead1=reversedHead1.next;
            reversedHead2=reversedHead2.next;

        }
        // this handle if head2 is longer linkedList
        if(reversedHead1==null){
         while( reversedHead2!=null) {
             int digit = reversedHead2.val + carry;
             carry = 0;
             if (digit > 9) {
                 carry = 1;
                 digit = digit % 10;
             }

             reversedResultHead.next = new ListNode(digit, null);
            // System.out.println(digit +" inside second while");
             reversedResultHead = reversedResultHead.next;
             reversedHead2 = reversedHead2.next;
         }
        }



        // this handle if head1 is longer linkedList
        if(reversedHead2==null){
            while(reversedHead1!=null) {  // 9 9
            int digit = reversedHead1.val + carry;
            carry = 0;
            if (digit > 9) {
                carry = 1;
                digit = digit % 10;
            }

            reversedResultHead.next = new ListNode(digit, null); //0 0 0
                // System.out.println(digit +" inside second while");
            reversedResultHead = reversedResultHead.next;
            reversedHead1 = reversedHead1.next;
        }
        }

        if(carry==1){
            reversedResultHead.next=new ListNode(1, null);

        }
        // 0 0 0 1
         ListNode sumLinkedListHead=  reverseLinkedList(reversedResultHead);
        // 1 0 0 0
        return  answer;
    }

    private static ListNode reverseLinkedList(ListNode head) {

        ListNode prev = null;
        ListNode current = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
       return head;

    }

    public static void main(String[] args) {

      ListNode head1 = new ListNode(9,new ListNode(9, new ListNode(9,null)));
      ListNode head2= new ListNode(1,null);




        ListNode headResult=addLinkedList(head1,head1).next;
      while(headResult!=null){
    System.out.print(headResult.val);
    headResult=headResult.next;
}
    }
}
