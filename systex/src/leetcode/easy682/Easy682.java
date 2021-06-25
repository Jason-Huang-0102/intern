//
//You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.
//
//At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:
//
//An integer x - Record a new score of x.
//"+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
//"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
//"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
//Return the sum of all the scores on the record.


//Input: ops = ["5","2","C","D","+"]
//Output: 30
//Explanation:
//"5" - Add 5 to the record, record is now [5].
//"2" - Add 2 to the record, record is now [5, 2].
//"C" - Invalidate and remove the previous score, record is now [5].
//"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
//"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
//The total sum is 5 + 10 + 15 = 30.

package leetcode.easy682;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Easy682 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		
//		String[] a= new String[30];
		ArrayList<String> a =new ArrayList<>();
//		int c=0;
		Scanner scanner = new Scanner(System.in);
		try {
		
			String s = scanner.next();
//			System.out.print(s.equals("e"));
			while(!s.equals("e")) {
				a.add(s);
//				System.out.print(a[c-1]);
				s = scanner.next(); 
			}
			System.out.println(calPoints(a));
		
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
	public static int calPoints(ArrayList<String> ops) {
//		System.out.println(ops.size());
        Stack<Integer> s =new Stack<Integer>();
        for(String i : ops)
        {
            //System.out.println(ops[i]=="C");
            if(i.equals("C") && !s.empty())
                s.pop();
            else if(i.equals("D") && !s.empty())
            {
                int t=s.peek();
                s.push(t*2);
            }
            else if(i.equals("+") && s.size()>=2)
            {
                int x=s.peek();
                s.pop();
                
                int y=s.peek();
                s.pop();
                s.push(y);
                s.push(x);
                s.push(x+y);
            }
            else
                s.push(Integer.parseInt(i));
            
        }
        int ans=0;
            while(!s.empty())
            {
                ans+=s.peek();
                s.pop();
            }
            return ans;
    }
}
