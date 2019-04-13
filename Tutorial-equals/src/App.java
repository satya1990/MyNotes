class Person{
	int id;
	String name;
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person: id="+ id + " name="+ name ;
	}
	
	
	
}
public class App {

	public static void main(String[] args) {
		
		int i = 5;
		int j = 5;
		System.out.println(i == j);
		double d1 = 8.56;
		double d2 = 8.56;
		System.out.println(d1 == d2);
		
		String s1 = "Hello";
		String s2 = "Helloexpert";
		System.out.println(s1.equals(s2.substring(0, 5)));
		
		Person p1 = new Person(3, "satya");
		Person p2 = new Person(3, "satya");
		System.out.println(p1.equals(p2));
		System.out.println(p1);
		
	}

}
