
class Machine{
	
	public void start(){
		System.out.println("machine starting...");
	}
}

interface Plant{
	public void grow();
}

public class App {

	public static void main(String[] args) {
		Machine m = new Machine(){
		@Override public void start(){
			System.out.println("overriding by anonymus class");
		}
		};
		
		//will call start from anonymous child class
		m.start();
		
		Plant p = new Plant(){
			@Override public void grow(){
			System.out.println("interface anonymously overirded here..");	
			}
		};
		
		p.grow();			
	}
}

