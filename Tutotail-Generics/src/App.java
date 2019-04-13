import java.util.ArrayList;

class Animal{
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	public void getName(){
		System.out.println(name);
	}
	
	@Override
	public String toString() {
		return "I'm Animal";
	}
			
}
class Rodents extends Animal{
	
	
	public Rodents() {
		super("");
	}


	@Override
	public String toString() {
		return "I'm a Rodent";
	}
	public String foo(){
		return "foo";
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Orange");
		list.add("Bangana");
		
		/*
		for(String s: list){
			System.out.println(s);
		}	
		*/
		
		String str = list.get(1);
		System.out.println(str);
		
		
		//HashMap<Integer, String> HM = new HashMap<Integer, String>();
		
		ArrayList<Animal> A = new ArrayList<>();
		
		Animal a = new Animal("Lion");
		//System.out.println(Integer.toHexString(a.hashCode())+a.toString());
		
		A.add(a);
		A.add(new Animal("Tiger"));
		A.add(new Animal("Elephant"));
		A.add(new Animal("Beer"));
	
		System.out.println(A.size());
		showList(A);
		//showList1(list);
		ArrayList<Rodents> R = new ArrayList<Rodents>();
		R.add(new Rodents());
		R.add(new Rodents());
		R.add(new Rodents());
		
		showList1(R);
	}
	
	//generics and wildcards
	public static void showList(ArrayList<? extends Animal> list){
		//super class object (?)
		for(Animal value: list){
			System.out.println(value);
			//value.getName();
		}
	}
	
	
	public static <T> void showList1(ArrayList< T > list) {
		for (T value : list) {
		System.out.println(value);
		}
		}

}
