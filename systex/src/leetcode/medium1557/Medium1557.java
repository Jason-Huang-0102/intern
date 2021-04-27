package leetcode.medium1557;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medium1557 {
	public static void main(String[] args) {
		
//		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//	    System.out.println("Add String ");
//	    String userName = myObj.nextLine(); 
		List<List<Integer>>  a=new ArrayList<List<Integer>>();
		a.add((List<Integer>)Arrays.asList(0,1));
		a.add((List<Integer>)Arrays.asList(0,2));
		a.add((List<Integer>)Arrays.asList(2,5));
		a.add((List<Integer>)Arrays.asList(3,4));
		a.add((List<Integer>)Arrays.asList(4,2));
		findSmallestSetOfVertices(6,a);
	}
	
    public static void findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] canBeReached = new boolean[n];
        
        for(int i = 0; i < edges.size(); i++){
            canBeReached[edges.get(i).get(1)] = true;
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(canBeReached[i] == false){
                ans.add(i);
            }
        }
        System.out.print(ans);
    }

	
}
