//You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.
//
//In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may be more than one ball in some boxes.
//
//Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.
//
//Each answer[i] is calculated considering the initial state of the boxes.

//Input: boxes = "110"
//Output: [1,1,3]
//Explanation: The answer for each box is as follows:
//1) First box: you will have to move one ball from the second box to the first box in one operation.
//2) Second box: you will have to move one ball from the first box to the second box in one operation.
//3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation.

package leetcode.medium1769;

import java.util.Scanner;

public class Medium1769 {
	
	public static void main(String[] args)
	{

		long t1 = System.currentTimeMillis();
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			String p= scanner.nextLine();
//			if(isNumeric(p)==false)
//				System.out.println("Error!");
//			else
			minOperations(p);
			
		}
		catch (Exception e) {
            System.out.println("Error!");
            scanner.reset();
        }
				
		
//		System.out.println(m);
//		ArrayList<Integer>[][] a = new ArrayList[m][n];
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	public static void minOperations(String boxes) {
        int l =boxes.length();
		int[] a=new int[l];
		int leftcount, leftcost, rightcount, rightcost;
		leftcount=leftcost=rightcount=rightcost=0;
		for (int i=1 ;i<l;i++ ) {
           if (boxes.charAt(i-1)=='1')
                leftcount+=1;
           leftcost+=leftcount;
           a[i]=leftcost;
		}
        for (int i=l-2 ;i>=0;i-- ) {
            if (boxes.charAt(i+1)=='1')
                rightcount+=1;
            rightcost+=rightcount;
            a[i]+=rightcost;
        }
        for(int i=0;i<a.length;i++){
        	System.out.print(a[i]);
        	System.out.print(' ');
        }
    }
	public static boolean isNumeric(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{	
//			System.out.println(str.charAt(i));
			if (!Character.isDigit(str.charAt(i)))
				return false;
			if(str.charAt(i)!='0'||str.charAt(i)!='1')
				return false;
		}
		return true;
	}
}
