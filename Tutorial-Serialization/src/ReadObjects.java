import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading Objects...");	
		/*
		try( FileInputStream fi = new FileInputStream("objects_state.byte")){
			ObjectInputStream os = new ObjectInputStream(fi);
		*/	
			try(ObjectInputStream os = new ObjectInputStream( new FileInputStream("objects_state.byte"))){	
			System.out.println("available: "+os.available());
					
			//Reading all objects in ObjectInputStream
			/*
			Person p = (Person) os.readObject();
			while(true){
				try{
				System.out.println(p);
				p = (Person) os.readObject();}
				catch(EOFException e){
					System.out.println(" done with reading all objects!!");
					break;
				}
			}
			*/
			
			int n = os.readInt(); // n = os.available()
			while(n > 0){
				Person p = (Person) os.readObject();
				System.out.println(p);
				n--;
			}
			
			//read Array
			Person[] people = (Person[]) os.readObject();
			//read ArrayList
			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>) os.readObject();
			//ArrayList<Person> peopleList = readObject;
			
			System.out.println("Reading Array... ");
			for(Person q : people)
				System.out.println(q);
			System.out.println("Reading ArrayList ");
			for(Person q : peopleList)
				System.out.println(q);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
