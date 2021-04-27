package leetcode.medium1641;
//
//Given an integer n,
//return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.
//
//A string s is lexicographically sorted if for all valid i,
//s[i] is the same as or comes before s[i+1] in the alphabet.

//Input: n = 2
//Output: 15
//Explanation: The 15 sorted strings that consist of vowels only are
//["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
//Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.

//[u,o,i,e,a]
//[1,1,1,1,1], n==1
//[1,2,3,4,5], n==2
//[1,3,6,10,15], n==3 
//


public class Medium1641 {
	

	public static void main(String[] args) {
		System.out.println(countVowelStrings(3));
	}
	
	public static int countVowelStrings(int n) {
	      int init[]=new int[5];
	      init[0]=init[1]=init[2]=init[3]=init[4]=1;
	      for(int i=0;i<n-1;i++)
	            for(int j=0;j<4;j++)
	                init[j+1]+=init[j];
	      return init[0]+init[1]+init[2]+init[3]+init[4] ;
	    }
	
	
	
}
