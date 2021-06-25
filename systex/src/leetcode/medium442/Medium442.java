
//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
//
//You must write an algorithm that runs in O(n) time and uses only constant extra space.
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
package leetcode.medium442;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medium442 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		
		List<Integer> a = new ArrayList<Integer>();
		int c=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array : ");
		try {
		
			Integer m= scanner.nextInt();
			while(m!=-1) {
				a.add(m);
				m= scanner.nextInt();
			}
			Integer[] array = a.toArray(new Integer[0]);
			List<Integer> list = new ArrayList<>();
			list=findDuplicates(array);
			for (int i : list) {
				System.out.print(i);
				System.out.print(' ');
			}
			System.out.println();
		}
		catch (Exception e) {
            System.out.println("Error!");
            scanner.reset();
        }
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	public static List<Integer> findDuplicates(Integer[] nums) {
		List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num = Math.abs(nums[i]); // get the original number by removing - sign if visited
            if(nums[num-1] > 0) 
            	nums[num-1] = -nums[num-1]; //sign change to negative (visit)
            else 
            	list.add(num); //if sign has been already changed(visited) then current number is duplicate
        }
        return list;
    }
}
