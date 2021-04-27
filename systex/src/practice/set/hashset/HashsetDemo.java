package practice.set.hashset;
import java.util.*;
public class HashsetDemo {
	 public static void main(String[] args)
	    {
	        HashSet<String> h = new HashSet<String>();
	  
	        // Adding elements into HashSet usind add()
	        h.add("India");
	        h.clear();
	        System.out.println("Is the set empty: " + h.isEmpty());
	        h.add("Australia");
	        System.out.println("Does the Set contains 'India'? " + h.contains("India"));
	        h.add("South Africa");
	        h.add("India"); // adding duplicate elements
	  
	        // Displaying the HashSet
	        System.out.println(h);
	        System.out.println("List contains India or not:"
	                           + h.contains("India"));
	  
	        // Removing items from HashSet using remove()
	        h.remove("Australia");
	        System.out.println("List after removing Australia:"
	                           + h);
	  
	        // Iterating over hash set items
	        System.out.println("Iterating over list:");
	        Iterator<String> i = h.iterator();
	        while (i.hasNext())
	            System.out.println(i.next());
	        
	        HashSet cloned_set = new HashSet();
	        cloned_set = (HashSet)h.clone();
	        cloned_set.add("North Africa");
	        System.out.println("The new set: " + cloned_set);
	    }
}
