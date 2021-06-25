//Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.
//
//After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.

//Input: n = 34, k = 6
//Output: 9
//Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.

package leetcode.easy1837;

import java.util.Scanner;

public class Easy1837 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		System.out.println(sumBase(n,k));
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	public static int sumBase(int n, int k) {
        int sum = 0;
        while (n != 0){
            sum += n % k;
            n = n / k;
        }
        return sum;
    }
}
