
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
//
//A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
//
//For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
//Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
//
//Input: s = "is2 sentence4 This1 a3"
//Output: "This is a sentence"
//Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

package leetcode.easy1859;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Easy1859 { //¿À¨dinput ¨Oß_ exception°C
	public static void main(String[] args)
	{
		long t1 = System.currentTimeMillis();
		
		Scanner scanner = new Scanner(System.in);
		String s= scanner.nextLine();
		sortSentence(s);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	 public static void sortSentence(String s) {
	        String[] ss=s.split("\\s+");
	        List<String> l = new ArrayList<>();

	        // System.out.println(ss.length);
	         String[] ans= new String [ss.length+1];
	        // return ss[0];
	        for (int i=0;i<ss.length;i++)
	        {
	            char a =ss[i].charAt(ss[i].length() - 1);
	            // System.out.println(a);
	            ans[ Character.getNumericValue(a)]=ss[i].substring(0,ss[i].length() - 1);
	            // System.out.println(ans[ String. valueOf(a)]);
	        }
	        for(int i=1;i<ans.length;i++)
	            l.add(ans[i]);
	        String j = String.join(" ",l);
	        System.out.println( j);
	    }
}
