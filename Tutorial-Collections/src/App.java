import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//Array
		Integer A[] = {3,1,2,9,5,0};
	
		//initializing from Array
		ArrayList<Integer> Alist = new ArrayList<Integer>(Arrays.asList(A));
		
		/**** ArrayList manages Arrays internally
		 * [0],[1],[2],.....etc
		 * 
		 * Random access, when goes out of memory, it doubles the Array capacity to copy  
		 */
		
		LinkedList<Integer> llist = new LinkedList<Integer>(Arrays.asList(A));
		/*** Linked List
		 * [0]<==>[1]<==>[2]
		 * Accessing is sequential, slower than ArrayList
		 * Adding any where in between list is faster than ArrayList
		 */
		// show("ArrayList",Alist);
		// show("LinkedList",llist);
		
		//sort Array List
		Collections.sort(Alist);
		Alist.sort(null);
		printList(Alist);
		//sort LinkedList
		llist.sort(null);
		printList(llist);	
	}
	
	public static void printList(List<?> list){
		for(Object i : list)
			
			System.out.print(i+", ");
		System.out.println();
	}
	public static void show(String type, List<Integer> list){
	
		/*
		for(int i=0; i<1E5; i++){
			list.add(i);
		}
		*/
		long start = System.currentTimeMillis();
		//adding items
		for(int i=0; i<1E5; i++){
			
			list.add(list.size(),i); //end of list
			//list.add(0,i); //begin of list
		}
				
		
		long end = System.currentTimeMillis();
		System.out.println(type+": Tiem taken: "+ (end - start));
		
	}

}
