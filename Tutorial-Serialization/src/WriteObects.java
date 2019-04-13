import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObects {

	public static void main(String[] args) {
		System.out.println("writing objects...");
		Person p1 = new Person("satya", 1);
		Person p2 = new Person("Praveen", 2);
				
		Person[] people = { new Person("satya", 1), new Person("Praveen", 2) };
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		try( FileOutputStream fo = new FileOutputStream("objects_state.byte") ){
			ObjectOutputStream os = new ObjectOutputStream(fo);
		
			//writing objects into ObjectOutputStream object
			int n = 4; //number of objects
			os.writeInt(n);
			os.writeObject(p1);
			os.writeObject(p2);
			os.writeObject(new Person("Trinadh",3));
			os.writeObject(new Person("Shiva",4));
			
			//serializing Array
			os.writeObject(people);
			//serializing ArrayList
			os.writeObject(peopleList);
				
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
