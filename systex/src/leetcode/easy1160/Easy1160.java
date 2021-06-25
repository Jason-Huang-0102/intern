
//You are given an array of strings words and a string chars.
//
//A string is good if it can be formed by characters from chars (each character can only be used once).
//
//Return the sum of lengths of all good strings in words.
//
// 
//Input: words = ["cat","bt","hat","tree"], chars = "atach"
//Output: 6
//Explanation: 
//The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.


package leetcode.easy1160;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Easy1160 {
	
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter words");
		String s= scanner.nextLine();
		List<String> l = new ArrayList<>();
		while(s!="") {
			l.add(s);
			s= scanner.nextLine();
		}
		System.out.println("Enter chars");
		String chars=scanner.nextLine();
		System.out.println(countCharacters(l, chars));
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	 public static int countCharacters(List<String> words, String chars) {
	        if (chars == null || chars.isEmpty() || words == null || words.size() == 0)
	            return 0;
	        
	        int[] counts = new int[26];
	        for (char ch : chars.toCharArray()) {
	            ++counts[ch - 'a'];    
	        }
	        
	        int res = 0;
	        for (String w : words) {
	            int[] wordCounts = new int[26];
	            boolean possible = true;
	            for (char ch : w.toCharArray()) {
	                int idx = ch - 'a';
	                ++wordCounts[idx];
	                if (wordCounts[idx] > counts[idx]) {
	                    possible = false;
	                    break;
	                }
	            }
	    
	            if (!possible)
	                continue;
	            
	            res+=w.length();
	        }
	        return res;
	    }
}
