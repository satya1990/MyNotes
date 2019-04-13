import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {

	public static void main(String[] args) {
		//HashCode Map vs 
		// HashMap is obselte use ConcurrentHashMap<K, V>
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		
		// TreeMap, LinkedHashMap
		LinkedHashMap<Integer, String> LHMap = new LinkedHashMap<Integer, String>( );
		//sorted
		TreeMap<Integer, String> TMap = new TreeMap<Integer, String>();
		
		System.out.println("HashMap");
		testMap(HM);
		System.out.println("LinkedHashMap");
		testMap(LHMap);
		System.out.println("TreeMap");
		testMap(TMap);
	}
	public static void testMap(Map<Integer,String> map){
		
		map.put(3, "three");
		map.put(11, "Eleven");
		map.put(2, "two");
		map.put(1, "one");
		map.put(12, "twelve");
		map.put(0, "zero");
		
		printMap(map);
	}	
	public static void printMap(Map<Integer, String> map){
		//iterate through map as follows
		//Method 1: 
		for(Integer key: map.keySet()){
			System.out.println(key+" : "+map.get(key));
		}
		/*
		//Method 2:
		for( Map.Entry<Integer, String> it:map.entrySet()){
			System.out.println("key: "+it.getKey()+" value: "+it.getValue());
		}
		*/			
	}
	
}

