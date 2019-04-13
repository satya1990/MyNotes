
public class App {

	enum Animal{
		//these are actually objects
		CAT("jerry"), DOG("tommy"), FOX("Fredo");
		
		private String name;
		Animal(String name){
			this.name= name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
	}
	enum Vechile{
		BIKE(2),AUTO(3),RICKSHAW(3),CAR(4),BUS(6);
		private int no_tyres;
		Vechile(int t){
			this.no_tyres = t;
		}
		public int getNo_tyres() {
			return no_tyres;
		}
		 
		
		
	}
	
	
	public static void main(String[] args) {
		
		Animal a = Animal.CAT;
		//other way of passing enum value
		Animal b = Animal.valueOf("FOX");
		
		System.out.println(b);
		
		switch(a){
		case CAT:
			System.out.println("CAT");
			break;
		case DOG:
			System.out.println("DOG");
			break;
		case FOX:
			System.out.println("FOX");
			break;
		default:
			break;

		}
		
		System.out.println("cat: "+Animal.CAT);
		System.out.println("class: "+Animal.CAT.getClass() );
		System.out.println(Animal.CAT instanceof Animal);
		
		System.out.println(Animal.CAT.getName());
		//we can set name's of enum as follows
		Animal.CAT.setName("satya");
		Animal.DOG.setName("satya2");
		Animal.FOX.setName("satya3");
		Animal.CAT.setName("satya1");
		
		System.out.println(Animal.CAT.getName());
		System.out.println(Animal.DOG.getName());
		System.out.println(Animal.FOX.getName());
		
		
		
		Vechile v = Vechile.BUS;
		//passing enum constant
		Vechile v2 = Vechile.valueOf("BIKE");
		
		System.out.println(v.getNo_tyres());
		System.out.println(v.getClass());
		//enum to String
		System.out.println("enum constant "+v2.name());
	}

}
