class Simple{
	public static void foo(){
		System.out.println(System.currentTimeMillis());
	}
}

interface iface {
	abstract void foo();
}
public class Test {
	static final int MAX = 100;
	static void printNameClass(Object obj){
		Class c = obj.getClass();
		System.out.println(c.isArray());
		System.out.println(c.isInstance(obj));
	
		System.out.println(c.getName());
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Test t = new Test();
		
		printNameClass(t);
		
		Class c = Integer.class;
		System.out.println(c.getName());
		
		String runtime_obj="Simple";
		Class c2=Class.forName(runtime_obj); 
		Simple obj2 = (Simple) c2.newInstance();
		obj2.foo();
		
		int i = '3'; 
		switch (i) {
		case '1':
			System.out.println(1);
			break;
		case '1'+'2':
			System.out.println(2);
			break;
		case '3':
			System.out.println(3);		
		default:
			break;
		}
		System.out.println(392880%31);
	}
	
}
