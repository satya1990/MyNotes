 import java.util.ArrayList;
import java.util.List;

class Person{
	String fname, lname;

	/**
	 * @param fname
	 * @param lname
	 */
	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	
}
 public class PerformanceTest {
     private static final long MEGABYTE = 1024L * 1024L;

     public static long bytesToMegabytes(long bytes) {
         return bytes / MEGABYTE;
     }

     public static void main(String[] args) {
    	// Get the Java runtime
         Runtime runtime = Runtime.getRuntime();
         
    	 System.out.println("total : "+runtime.totalMemory()+"  free : "+runtime.freeMemory()+" max memory: "+runtime.maxMemory());
    	 
         System.out.println(runtime.availableProcessors()+" available processors");
    	 
         List < Person > list = new ArrayList < Person > ();
         for (int i = 0; i <= 100000; i++) {
             list.add(new Person("Jim", "Knopf"));
         }
         System.out.println("total : "+runtime.totalMemory()+"  free : "+runtime.freeMemory());
         
         // Run the garbage collector
         runtime.gc();
         // Calculate the used memory
         long memory = runtime.totalMemory() - runtime.freeMemory();
         System.out.println("total : "+runtime.totalMemory()+"  free : "+runtime.freeMemory());
         System.out.println("Used memory is bytes: " + memory);
         System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
     }
 }