package leetcode.easy876;


//Given a non-empty, singly linked list with head node head, return a middle node of linked list.
//
//If there are two middle nodes, return the second middle node.
//
// 
//
//Example 1:
//
//Input: [1,2,3,4,5]
//Output: Node 3 from this list (Serialization: [3,4,5])
//The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
//Note that we returned a ListNode object ans, such that:
//ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.

public class Easy876 {
	public static void main (String[] args)
	{
		//[1,2,3,4,5]
		ListNode f= new ListNode(6);
		ListNode e= new ListNode(5,f);
		ListNode d= new ListNode(4,e);
		ListNode c= new ListNode(3,d);
		ListNode b= new ListNode(2,c);
		ListNode a= new ListNode(1,b);
		middleNode(a);
	}
	
    static void middleNode(ListNode head) {
     ListNode slow=head,fast=head,temp=head;
        int c=0;
//        if(head.next==null)
//            return head;
        while(temp!=null){
            c++;
            temp=temp.next;   
        }
//         System.out.println(cnt);
        int res=(int)(c/2);
//         System.out.println(res);
        int cntr=1;
        //get middle position
        while(cntr<res){
            slow=slow.next;
            cntr++;
        }
        //print value
        while(slow.next!=null)
        	{
        	System.out.print(slow.next.val);
        	slow=slow.next;
        	}
    }
}
