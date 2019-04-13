

public class Machine implements Info {
	
	public void start(){
		System.out.println(" Machine Starts.");
	}
	public void stop(){
		System.out.println(" Machine Stops!!");
	}
	@Override
	public void getInfo() {
		System.out.println("Machine Info ");
		
	}
	
	
}
