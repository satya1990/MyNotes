import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.regex.Pattern;

//: typeinfo/ShowMethods.java 
// Using reflection to show all athe methods fo a class.
// even if the methods ae defined in the base class.
// {Args: ShowMethods}

class Vechile {
	static String category = "vechile";

	public void start() {
		System.out.println("Vechile Starting...");
	}
}

class Bike extends Vechile {
	static int no_wheels = 2;
	String name;
	int cc;

	@Override
	public void start() {
		System.out.println("bike Starting..");
	}

	/**
	 * @param name
	 * @param cc
	 */
	public Bike(String name, int cc) {
		this.name = name;
		this.cc = cc;
	}

}

public class ShowMethods {

	private static String usage = "usage: \n" + "ShowMethods qualified.class.name \n"
			+ "To Serach for methods involving 'word'";

	private static Pattern p = Pattern.compile("\\w+\\.");

	public static void getLines() {
		return;
	}

	public static void main(String[] args) {
		Bike b1 = new Bike("yamaha-Fazer", 150);
		if (args.length < 1) {
			System.out.println(usage);
			System.exit(0);
		}
		
		int lines = 0;

		if (args.length >= 1)
			for (int i = 0; i < args.length; i++) {
				try {
					Class<?> c = Class.forName(args[i]);
					Method[] methods = c.getMethods();

					Constructor[] ctors = c.getConstructors();
					System.out.println("args.legth: " + args.length);

					for (Method method : methods) {
						System.out.println("Actual " + method.toString());
						for (Constructor ctor : ctors)
							System.out.println("ctor: " + p.matcher(ctor.toString()).replaceAll(""));
						
						// System.out.println(p.matcher(method.toString()).replaceAll(""));
					}

					lines = methods.length + ctors.length;
				} catch (ClassNotFoundException e) {
					System.out.println(e);
				}
				
			}
	}

}