//Maximum Subarray
//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
package leetcode.easy53;



public class Easy53 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		int[] nums= new int[10];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=10-(int)(Math.random()*20);
			System.out.print(nums[i]);
			System.out.print(' ');
		}
		System.out.println();
		maxSubArray(nums);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	 public static void maxSubArray(int[] nums) {
			
        int max_sum = Integer.MIN_VALUE;
        int curr_sum=0;
		
        for(int i=0;i<nums.length;i++){
            curr_sum +=nums[i];
			
		   if(max_sum<curr_sum){
			   max_sum=curr_sum;
			}   
			if(curr_sum<0){
				curr_sum=0;
			}
        }
		System.out.println(max_sum) ;
	        
	 }
}
