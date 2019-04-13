
class Base{
	
	public void getInfo(){
	System.out.println("In Base ...");
	}
}

class Derived1 extends Base{
	public void getInfo(){
		System.out.println("In Derived1 ...");
		}
	public void show(){
		System.out.println("show Derived1. ");
		}
	
	
}
class Derived2 extends Derived1{
	public void getInfo(){
		System.out.println("In Derived2 ...");
		}
	
	
}


public class app {
	
	public static void main(String[] args){
		
		Base b1 = new Base();
		//Derived1 d1 = new Derived1();
		Derived2 d2 = new Derived2();
		
		//down casting. Going down stack of inheritance heirarchy towards base class
		Base b2 = d2;
		b2.getInfo();
			
		//upcasting
		
		//Base b3 = new Derived1();
		//Derived2 d3 = (Derived2) b3;
		//this won't work,
		//d3.getInfo();
		
			
		Derived1 d4 = (Derived1) b1;
		//this upcast also wont'work
		d4.getInfo();
		
		
			
	}	
	
}
