//You are given two integer arrays nums1 and nums2 both of ""unique"" elements, where nums1 is a subset of nums2.
//
//Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
//
//The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, return -1 for this number.
//
// 
package leetcode.easy496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Easy496 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		int[] nums2= new int[10];
		
		for(int i=0;i<nums2.length;i++)
		{
			nums2[i]=60-(int)(Math.random()*30);
			System.out.print(nums2[i]);
			System.out.print(' ');
		}

		System.out.println();
		int[] nums1= new int[5];
		
		for(int i=0;i<nums1.length;i++)
		{
			nums1[i]=nums2[i+1];
			System.out.print(nums1[i]);
			System.out.print(' ');
		}
		System.out.println();
		nextGreaterElement(nums1, nums2);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
    public static  void nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums2){            
            while(!stack.isEmpty() && num > stack.peek())
                map.put(stack.pop(), num);
            stack.push(num);            
        }
        
        int i=0;        
        for(int num : nums1) {
            result[i] = map.getOrDefault(num, -1);
            System.out.print(result[i]);
			System.out.print(' ');
			i++;
        }
        System.out.println();
    }

}
