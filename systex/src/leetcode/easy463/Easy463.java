//You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
//
//Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
//
//The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
//
// 

//Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
//Output: 16
//Explanation: The perimeter is the 16 yellow stripes in the image above.

package leetcode.easy463;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Easy463 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter m,n");
		try {
		Integer m= scanner.nextInt();
		Integer n= scanner.nextInt();
		int[][] a=new int[m][];
		for(int i=0;i<m;i++) {
			a[i]=new int [n];
		}
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++) {
				a[i][j]= scanner.nextInt();
			}
				
		
		System.out.println(islandPerimeter(a));
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
	public static int islandPerimeter(int [][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    if(j==0||grid[i][j-1]==0)
                        ans++;
                    if(j==n-1||grid[i][j+1]==0)
                        ans++;
                    if(i==0||grid[i-1][j]==0)
                        ans++;
                    if(i==m-1||grid[i+1][j]==0)
                        ans++;
                    
                }
            }
        return ans;
    }
}
