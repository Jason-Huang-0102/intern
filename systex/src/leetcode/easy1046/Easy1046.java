//
//We have a collection of stones, each stone has a positive integer weight.
//
//Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
//
//If x == y, both stones are totally destroyed;
//If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
//At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
//
// 

//Input: [2,7,4,1,8,1]
//Output: 1
//Explanation: 
//We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
//we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
//we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
//we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.

package leetcode.easy1046;
import java.util.Comparator;
import java.util.PriorityQueue;  
import java.util.Scanner;

public class Easy1046 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		
		int[] a= new int[30];
		int c=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter m : ");
		try {
		
			Integer m= scanner.nextInt();
			while(m!=-1) {
				a[c++]=m;
				m= scanner.nextInt();
			}
			System.out.println(lastStoneWeight(a));
		
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
	public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((Comparator<? super Integer>) new Comparator<Integer>() {
            public int compare(Integer lhs, Integer rhs) {
                if (lhs < rhs) return +1;
                if (lhs.equals(rhs)) return 0;
                    return -1;
            }
        });
        for (int i=0;i<stones.length;i++)
            pq.add(stones[i]);
        while(!pq.isEmpty())
        {
            // System.out.println(pq.poll());
            if(pq.size()==1)
            {
                int x=pq.peek();
                return x;
            }
            int x=pq.poll();
            int y=pq.poll();
            if(x-y>0){
                pq.add(x-y);
                
            }
            
        }
        return 0;
    }
}
