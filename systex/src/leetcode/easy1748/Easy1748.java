package leetcode.easy1748;

//You are given an integer array nums. 
//The unique elements of an array are the elements that appear exactly once in the array.
//
//Return the sum of all the unique elements of nums.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,2]
//Output: 4
//Explanation: The unique elements are [1,3], and the sum is 4.



public class Easy1748 {
	public static void main(String[] args)
	{
		int[] nums= new int[5];
		for(int i=0;i<5;i++)
		{
			nums[i]=(int)(Math.random()*10);
			System.out.println(nums[i]);
		}
		System.out.println(sumOfUnique(nums));
	}
	public static int sumOfUnique(int[] nums) {
	       	int sum=0;
	        int[] record = new int[101];        
	        for(int i=0 ; i<nums.length ; i++)
	        {
	            if(record[nums[i]] != 0 ) 
	            {			
					
	                if(record[nums[i]] == 1 )	
	                {
	                    sum-=nums[i];
	                    record[nums[i]] = 2;
	                }                
	            }
	            else
	            {
	                sum+=nums[i];
	                record[nums[i]]=1;
	            }
	        }
	        return sum;
	    }
}
