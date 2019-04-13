import java.io.Serializable;


public class Person implements Serializable {

	//private static final long serialVersionUID = 7209486673655458836L;
	String name;
	private transient int id;
	int no;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		//return "Person [ ID: "+id+" name: "+name+" no: "+no+" ]";		 
		//the following will format the output in aligned fashion
		return(String.format("[ ID: %-3d name: %-8s]", id,name));
			
	}
	
		
}
