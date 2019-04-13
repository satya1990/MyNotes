import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Comples_DS  {

	public static String[] vechile = { "Ambulance", "Helicopter", "Lifeboat" }; 
	
	public static String[][] driver ={	{ "surya", "satya", "santosh" }, 
			{ "john", "maxwell", "Gauss" },
			{ "Tesla", "Marconi", "Farday"} };
	
	public static void main(String[] args) {
		Map<String, Set<String>> info = new TreeMap<>();

		for(int i=0; i<vechile.length; i++){
			Set<String> s = new HashSet<>();
			for(int j=0; j<driver[i].length; j++){
				s.add(driver[i][j]);
			}
			info.put(vechile[i], s);
		}
		for(String i : info.keySet()){
			System.out.println(i);
		}
		
		for(Map.Entry<String, Set<String>> it : info.entrySet()){
			System.out.println("{ key: "+it.getKey()+ " value: "+it.getValue()+" }");
		}
	}
	 
}
