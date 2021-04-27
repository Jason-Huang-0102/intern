package leetcode.medium1669;


//You are given two linked lists: list1 and list2 of sizes n and m respectively.
//
//Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
//
//The blue edges and nodes in the following figure incidate the result:

public class Medium1669 {

	public static void main(String[] args) {
		
//		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//	    System.out.println("Add String ");
//	    String userName = myObj.nextLine(); 
	    
		ListNode  a =new ListNode(0);
		ListNode a_temp=a;
		for(int i=0;i<5;i++)
		{
			ListNode temp=new ListNode(i+1);
			a_temp.next=temp;
			a_temp=a_temp.next;
		}
		ListNode  b =new ListNode(1000000);
		ListNode b_temp=b;
		for(int i=0;i<5;i++)
		{
			ListNode temp=new ListNode(i+1000001);
			b_temp.next=temp;
			b_temp=b_temp.next;
		}

		mergeInBetween(a,3,4,b);
	}
	
    public static void mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = new ListNode();
        curr.next = list1;
        ListNode start = null;
        ListNode end = null;
        int count = 0;
        while( curr.next != null ) {
            if ( count == a )    start = curr;
            if ( count == b ) {
                end   = curr.next.next;
                break;
            } 
            curr = curr.next;
            count++;
        }
//        System.out.print(curr.val);
        start.next = list2;
        while( list2 != null && list2.next != null ) {
            list2 = list2.next;
        }
        list2.next = end;
//        System.out.print(list1);
        System.out.println(list1.val);
        while(list1.next!=null)
        	{System.out.println(list1.next.val);
        	list1=list1.next;
        	}
    }
	
}
