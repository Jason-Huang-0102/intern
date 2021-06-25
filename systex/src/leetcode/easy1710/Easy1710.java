//You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:
//
//numberOfBoxesi is the number of boxes of type i.
//numberOfUnitsPerBoxi is the number of units in each box of the type i.
//You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.
//
//Return the maximum total number of units that can be put on the truck.

//Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
//Output: 8
//Explanation: There are:
//- 1 box of the first type that contains 3 units.
//- 2 boxes of the second type that contain 2 units each.
//- 3 boxes of the third type that contain 1 unit each.
//You can take all the boxes of the first and second types, and one box of the third type.
//The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
package leetcode.easy1710;

import java.util.Scanner;

public class Easy1710 {
	
	public static void main(String[] args)
	{

		long t1 = System.currentTimeMillis();
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter boxTypes : ");
			int[][] logs= new int[100][2];
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int c=0;
			while(n!=-1&&k!=-1){
				logs[c][0]=n;
				logs[c][1]=k;
				c+=1;
				n = scanner.nextInt();
				k = scanner.nextInt();
				
			}
			System.out.println("Enter truckSize : ");
			int t= scanner.nextInt();
			System.out.println(maximumUnits(logs,c,t));
		
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
	 public static int maximumUnits(int[][] boxTypes,int c, int truckSize) 
	    {
	        int [] unitCount = new int[1001];
	        
	        for (int [] boxType : boxTypes)
	        {
	            unitCount[boxType[1]] += boxType[0];
	        }
	        
	        int count = 0;
	        
	        for (int i = unitCount.length-1; i >= 0; i--)
	        {
	            if (unitCount[i] == 0) continue;
	            
	            int num = Math.min(unitCount[i], truckSize);
	            count += num * i;
	            truckSize -= num;
	            if (truckSize == 0) break;
	        }
	        
	        return count;
	    }
}
