import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//String fileName = "/Users/satya/Documents/MyCoding-Practice/Java_Programs/java_notes";
		 String fileName = "sample_fileIO.txt"; //to read file from project
		// itself
		 /*
		File textFile = new File(fileName);

		Scanner in = new Scanner(textFile);

		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
		}

		in.close();
		*/
		 String line;
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		}catch ( FileNotFoundException e) {
			System.out.println("file not found!! ");
		}catch (IOException e) {
			System.out.println("caught exception: "+e.toString());
		}
		
		//write a new file
		File newFile = new File("new.txt");
		
		try( BufferedWriter bw = new BufferedWriter(new FileWriter(newFile)) ){
			bw.write(" this is line one");
			bw.newLine();
			bw.write(" this is line two");
			bw.newLine();
			bw.write(" this is line three");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
}
