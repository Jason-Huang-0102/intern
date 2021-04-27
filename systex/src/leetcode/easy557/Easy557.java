package leetcode.easy557;
import java.util.Scanner;
public class Easy557 {

	
	//©R¦W¤p¼g
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(reverseWords(scanner.nextLine()));
	}
	 static public String reverseWords(String s) {
	        String[] str = s.split(" ");
	        StringBuilder sb = new StringBuilder();
	        for(int S = 0; S < str.length; S++) {
	            char[] word = str[S].toCharArray();
	            int i = 0;
	            int j = str[S].length() - 1;
	            while(i < j){
	                char temp = word[i];
	                word[i++] = word[j];
	                word[j--] = temp;
	            }
	            String newS = String.valueOf(word); //char to string
	            sb.append(newS + " ");
	        }
	        String res = sb.toString();
	        return res.substring(0, res.length() - 1);
	    }
}
