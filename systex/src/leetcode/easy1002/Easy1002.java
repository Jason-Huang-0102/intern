package leetcode.easy1002;

import java.util.ArrayList;
import java.util.List;


//Given an array A of strings made only from lowercase letters, 
//return a list of all characters that show up in all strings within the list (including duplicates).  
//For example, if a character occurs 3 times in all strings but not 4 times, 
//you need to include that character three times in the final answer.
//
//You may return the answer in any order.
//
//
//
//Example 1:
//
//Input: ["bella","label","roller"]
//Output: ["e","l","l"]





public class Easy1002 {
	
	public static void main(String[] args) {
		
		long t1 = System.currentTimeMillis();
		//input
//		String A[]= {"bella","label","roller"};
		String A[]= {"bella","label","roller", "letter", "enter"};
		commonChars(A);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	
    public static void commonChars(String[] A) {
        List<String> ans=new ArrayList<String>();
        //get element count
        int[] times=count(A[0]);
        for (int i=1;i<A.length;i++)
        {
            times=compare(times, count(A[i]));
        }
        for(int i=0;i<26;i++)
        {
            if(times[i]>0)
            {
                char a='a';
                a+=i;
                String s=Character.toString(a);
                while(times[i]>0)
                {
                    ans.add(s);
                    times[i]--;
                }
            }
            
        }
        System.out.println(ans);
    }
    
    static int[] count(String s)
    {
        int[] times=new int [26];
        for(char c:s.toCharArray())
        {
            times[c-'a']+=1;
        }
        return times;
    }
    static int[] compare(int[] A, int[] B)
    {
        int[] times=new int [26];
        for(int i=0;i<26;i++)
        {
            times[i]=Math.min(A[i], B[i]);
        }
        return times;
    }
}
