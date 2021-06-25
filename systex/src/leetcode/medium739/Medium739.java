
//Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.
//
//For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].
//

package leetcode.medium739;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
// list structure 
public class Medium739 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		int[] nums= new int[10];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=60-(int)(Math.random()*30);
			System.out.print(nums[i]);
			System.out.print(' ');
		}
		System.out.println();
		dailyTemperatures(nums);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	public static  void dailyTemperatures(int[] T) {
//        int n = T.length;
//        int[] res = new int[n];
//        Stack<Integer> st = new Stack<>();
//        for(int i = 0;i < n;i++) {
//
//            while(!st.isEmpty() && T[st.peek()] < T[i]) {
//                int x = st.pop();
//                res[x] = i - x;
//            }
//            st.push(i);
//        }
//		for (int i=0; i<res.length;i++) {
//        	System.out.print(res[i]);
//        	System.out.print(' ');
//        }
		int n=T.length;
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<n;i++){
//			int c=0;
			for(int j=i+1;j<n;j++)
				if(T[i]<T[j]) {
					l.add(j-i);
					break;
				}
				else if(T[i]>=T[j] && j==n-1)
				{
					l.add(0);
				}
			}
		l.add(0);
		for (int i :l) {
        	System.out.print(i);
        	System.out.print(' ');
        }
        System.out.println();
    }
}
