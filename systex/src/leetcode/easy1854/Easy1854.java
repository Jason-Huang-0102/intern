//You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
//
//The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.
//
//Return the earliest year with the maximum population.

//
//Input: logs = [[1993,1999],[2000,2010]]
//Output: 1993
//Explanation: The maximum population is 1, and 1993 is the earliest year with this population.

package leetcode.easy1854;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Easy1854 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		
		Scanner scanner = new Scanner(System.in);
		int p= scanner.nextInt();
		int[][] logs= new int[p][2];
		for(int i=0;i<p;i++)
		{
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			logs[i][0]=n;
			logs[i][1]=k;
		}
		maximumPopulation(logs);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	public static void maximumPopulation(int[][] logs) {
        Integer[] a=new Integer[2051];
        Arrays.fill(a, 0);
        for (int i=0;i<logs.length;i++)
        {
            for(int s=logs[i][0];s<logs[i][1];s++)
            {
                a[s]+=1;
            }
                
        }
        int ans=0;
        int m = Collections.max(Arrays.asList(a));
        for (int i=0;i<2051;i++)
            if(a[i]==m){
                ans=i;
                break;
            }
        System.out.println (ans);
        // List b = Arrays.asList(a);
        // System.out.println(Collections.max(Arrays.asList(b)));
        // System.out.println(m);
        // return m;
    }
}
