//Input: lo = 12, hi = 15, k = 2
//Output: 13
//Explanation: The power of 12 is 9 (12 --> 6 --> 3 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1)
//The power of 13 is 9
//The power of 14 is 17
//The power of 15 is 17
//The interval sorted by the power value [12,13,14,15]. For k = 2 answer is the second element which is 13.
//Notice that 12 and 13 have the same power value and we sorted them in ascending order. Same for 14 and 15.

//The power of an integer x is defined as the number of steps needed to transform x into 1 using the following steps:
//
//if x is even then x = x / 2
//if x is odd then x = 3 * x + 1
package leetcode.medium1387;

import java.util.*;

public class Medium1387 {
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		Integer a = scanner.nextInt();
		Integer b = scanner.nextInt();
		Integer c = scanner.nextInt();
		System.out.println(getKth(a,b,c));
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	public static int getKth(int low, int high, int k) {
        List<Power> list = new ArrayList<>();
        while (low <= high) {
            int value = low;
            int power = 0;
            while (value != 1) {
                if (value % 2 == 0)
                    value /= 2;
                else
                    value = value * 3 + 1;
                power += 1;
            }
            list.add(new Power(low, power));
            low += 1;
        }
        Collections.sort(list, (a, b) -> a.power - b.power);
        return list.get(k-1).number;
    }
}
