import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			System.out.println(line);
		}
		
		
			
	}

}
