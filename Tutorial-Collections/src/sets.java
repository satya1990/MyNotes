import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javafx.util.Pair;

public class sets {

	public static void main(String[] args) {
	
		Integer[] Arr = { 5, 2, 0, 6, 1};
		Set<Integer> s = new HashSet<>();
		Set<Integer> Ls = new LinkedHashSet<>();
		Set<Integer> Ts = new TreeSet<>();
		
		testSet(s);
		testSet(Ls);
		testSet(Ts);
		
		Integer[] A = s.toArray(new Integer[0]);
		
		System.out.println("length: "+A.length);
		
		/********** Search/find in Set ********/
		System.out.println(s.contains(3));
		System.out.println(Ls.containsAll(s));
		
		/********* InterSecontions ************/
		Set<Integer> interSectionsSet = new HashSet<Integer>(Arrays.asList(Arr));
		System.out.println(interSectionsSet);
		interSectionsSet.retainAll(Ls);
		System.out.println("interSection: "+ interSectionsSet);
		
		/********* Differences ************/
		Set<Integer> differneceSet = new HashSet<Integer>(Arrays.asList(Arr));
		System.out.println(differneceSet);
		differneceSet.removeAll(Ls); // removes Set Ls from differenceSet
		System.out.println("differenceSet: "+differneceSet);
		
		/********* Union of Sets ************/
		Set<Integer> unionSet = new HashSet<Integer>(Arrays.asList(Arr));
		unionSet.addAll(s);
		System.out.println("union: "+unionSet);
		
		//set of pairs
		Set< Pair<Integer, Integer> > AllPairs = new HashSet<>();
	
		
	}

	public static void testSet(Set<Integer> s){
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(0);
		System.out.println(s.add(3));
		
		printSet(s);	
	}
	
	public static void printSet(Set<Integer> s){
		System.out.println("Printing Set: ");
		for(Integer i : s){
			System.out.println(i);
		}
			
	}
}

