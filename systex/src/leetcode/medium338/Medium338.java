//Given an integer num, 
//return an array of the number of 1's in the binary representation of every number in the range [0, num].

//Input: num = 2
//Output: [0,1,1]
//Explanation:
//0 --> 0
//1 --> 1
//2 --> 10

// another solution 1 : An easy recurrence for this problem is f[i] = f[i / 2] + i % 2.
//for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);

// another solution 2 : 利用1、2、4、8...(二的倍數)當作基底，ex:9=8+1  12=8+4  .....
//int[] ret = new int[num+1];
//    ret[0] = 0;
//    int pow = 1;
//    for(int i = 1, t = 0; i <= num; i++, t++) {
//        if(i == pow) {
//            pow *= 2;
//            t = 0;
//        }
//        ret[i] = ret[t] + 1;
//    }
//    return ret;


package leetcode.medium338;



public class Medium338 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		int nums;
		nums=(int)(Math.random()*10);
		System.out.println(nums);
		countBits(nums);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	public static void countBits(int num) {
        int[] dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 1;
        
        int currPow2 = 1;
        for (int i=2; i<=num; i++) {
            if (currPow2 * 2 == i) {
                dp[i] = 1;
                currPow2 *= 2;
            }
            else dp[i] = dp[currPow2] + dp[i - currPow2];

        }
        for(int i=0;i<=num;i++) {
        	System.out.print(dp[i]);
        	System.out.print(' ');
        }
        System.out.print('\n');
    }
}
