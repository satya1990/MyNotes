import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


class Person implements Comparable<Person> {
	Integer id;
	String name;	
	
	public Person(String name, int id) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "{ id: "+id+" name: "+name+" }";
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
	public int compareTo(Person p) {
		//return (name.compareTo(p.getName()));
		return (id.compareTo(p.getId()));
	}
}

public class Customs {

	public static void main(String[] args) {
	Set<Person>	s1 = new TreeSet<Person>();
	Map<Person, Integer> map = new HashMap<Person,Integer>();
	
	Person[] p = { new Person("three",3), new Person("two",2), new Person("one",1), new Person("three",3)}; 
	
	/*
	Person p1 = new Person(3,"three");
	Person p2 = new Person(2,"two");
	Person p3 = new Person(1,"one");
	Person p4 = new Person(3,"three");
	*/
	for(Person p1: p){
		s1.add(p1);
		map.put(p1, p1.id);
	}

	printSet(s1);
    printMap(map);
	}
	
	public static void printSet(Set<Person> s){
		for(Person p : s){
			System.out.println(p.id+" : "+p.name);
		}
	}
	public static void printMap(Map<Person,Integer> map){
		for(Person key: map.keySet()){
			System.out.println("[ key: "+key+" val: "+map.get(key)+" ]");
		}
	}

}
