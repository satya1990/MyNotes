
public class App {
	
	public static void main(String[] args){
		Plant p1 = new Plant();
		Tree t1 = new Tree();
		
		Plant p2 = new Tree();
		
		p1.grow();
		//variableType vs ObjectType
		//value/type of object a variable holds will call method from that object
		p2.grow();
		//type of varialbe/object will decides what & methods it can call
		//p2.breeze(); //this wont' work
		t1.breeze();
		
		doGrow(t1);
	}
	public static void doGrow(Plant p){
		p.grow();
		//p.breeze();
	}

}
