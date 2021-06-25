//You are given the logs for users' actions on LeetCode, and an integer k. The logs are represented by a 2D integer array logs where each logs[i] = [IDi, timei] indicates that the user with IDi performed an action at the minute timei.
//
//Multiple users can perform actions simultaneously, and a single user can perform multiple actions in the same minute.
//
//The user active minutes (UAM) for a given user is defined as the number of unique minutes in which the user performed an action on LeetCode. A minute can only be counted once, even if multiple actions occur during it.
//
//You are to calculate a 1-indexed array answer of size k such that, for each j (1 <= j <= k), answer[j] is the number of users whose UAM equals j.
//
//Return the array answer as described above.

//Input: logs = [[0,5],[1,2],[0,2],[0,5],[1,3]], k = 5
//Output: [0,2,0,0,0]
//Explanation:
//The user with ID=0 performed actions at minutes 5, 2, and 5 again. Hence, they have a UAM of 2 (minute 5 is only counted once).
//The user with ID=1 performed actions at minutes 2 and 3. Hence, they have a UAM of 2.
//Since both users have a UAM of 2, answer[2] is 2, and the remaining answer[j] values are 0.

package leetcode.medium1817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Medium1817 {
	public static void main(String[] args)
	{

		long t1 = System.currentTimeMillis();
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter logs : ");
			int p= scanner.nextInt();
			int[][] logs= new int[p][2];
			for(int i=0;i<p;i++)
			{
				int n = scanner.nextInt();
				int k = scanner.nextInt();
				logs[i][0]=n;
				logs[i][1]=k;
			}
			System.out.println("Enter k : ");
			int t= scanner.nextInt();
			findingUsersActiveMinutes(logs,t);
		
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
	public static void findingUsersActiveMinutes(int[][] logs, int k) {
        int[] result=new int[k];
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        
        for(int[] log:logs){
            int id=log[0];
            int t=log[1];
            if(!map.containsKey(id))
            	map.put(id,new HashSet<>());
            map.get(id).add(t);
        }
        
        for(int id:map.keySet()){
             int UAM=map.get(id).size();
             result[UAM-1]++;  
        }
        for (int i=0 ;i<k;i++) {
        	System.out.print(result[i]);
        	System.out.print(' ');
        }
        System.out.println();
    }
}
