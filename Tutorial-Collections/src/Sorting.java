import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class stringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		if(len1 > len2)
			return 1;
		else if(len1 < len2)
			return -1;
		
		return 0;
	}
}

class lexoGraphicComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2); //just add negative sign here to reverse sorting order
	}
	
}

public class Sorting {

	public static void main(String[] args) {
		
		String[] SArr = { "one", "two", "three", "four", "five", "satya", "ok","1","12","3" };
		Integer[] IArr = { 3, 2,5, 1, 0, 6 };
		List<String> list = new ArrayList<String>(Arrays.asList(SArr));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(IArr));
		
		
		/*********** Sorting Strings ******************/
		Collections.sort(list); //deafult
		System.out.println("default: "+list);
		Collections.sort(list, new lexoGraphicComparator()); //custom sort
		System.out.println("lexoGraphic :"+list);
		Collections.sort(list, new stringLengthComparator()); //custom sort
		System.out.println(list);
		
		/************* sort numerics ****************/
		Collections.sort(list2); //dafault
		System.out.println(list2);
		//inline comparator 
		Collections.sort(list2, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {	
				//return o1>o2 ? -1 : 1;
				return -o1.compareTo(o2);
			}
			
		});
		System.out.println(list2);
		
		/************** sorting Map with custom objects ***************/
		Person[] p = { new Person("three",3), new Person("two",2), new Person("one",1), new Person("three",3)}; 
		Set<Person>	s1 = new HashSet<Person>();
		Map<Person, Integer> map1 = new HashMap<Person,Integer>();
		List<Person> list3 = new LinkedList<Person>(Arrays.asList(p));
		
		for(Person i: p){
			s1.add(i);
			map1.put(i, i.id);
		}
		
		//comparator is a anonymous class here
		Collections.sort(list3, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				//sort on name
				return p1.getName().compareTo(p2.getName());
				//sort on Id
				//return(p1.getId().compareTo(p2.getId()));
			}
			
		});
		System.out.println("list3:"+list3);
		
	
		Integer x = 5;
		Integer y = 40;
		System.out.println(y.compareTo(x));
	}

}
