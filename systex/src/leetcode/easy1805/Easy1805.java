//Number of Different Integers in a String
//You are given a string word that consists of digits and lowercase English letters.
//
//You will replace every non-digit character with a space. For example, "a123bc34d8ef34" will become " 123  34 8  34". Notice that you are left with some integers that are separated by at least one space: "123", "34", "8", and "34".
//
//Return the number of different integers after performing the replacement operations on word.
//
//Two integers are considered different if their decimal representations without any leading zeros are different.
package leetcode.easy1805;


import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
public class Easy1805 {
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(numDifferentIntegers(s));
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	 public static int numDifferentIntegers(String word) {
	        StringBuilder sb = new StringBuilder();
	        HashSet<BigInteger> hSet = new HashSet<BigInteger>();
	        for(int i = 0; i < word.length(); i++) {
	            if(Character.isDigit(word.charAt(i))) {
	                 sb.append(word.charAt(i));
	            } else {
	                if(sb.length() > 0) {
	                    hSet.add(new BigInteger(sb.toString()));
	                    sb.setLength(0);
	                }
	            }
	        }
	        if(sb.length() > 0) {
	                    hSet.add(new BigInteger(sb.toString()));
	                    sb.setLength(0);
	        }
	        return hSet.size();
	    }
}
