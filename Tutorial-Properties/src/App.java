	import java.util.*;  
	import java.io.*;  
	public class App {  
	public static void main(String[] args)throws Exception{  
	    FileReader reader=new FileReader("/Users/satya/Documents/git_configuraion.txt");  
	      
	    Properties p1=new Properties();  
	    p1.load(reader);  
	      
	    System.out.println(p1.getProperty("git"));  
	    System.out.println(p1.getProperty("email"));  
	    
	    Properties p=System.getProperties();  
	    Set set=p.entrySet();  
	      
	    
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	    Map.Entry entry=(Map.Entry)itr.next();  
	    //System.out.println(entry.getKey()+" = "+entry.getValue());  
	    }  
	    
	    //create a properties class
	    Properties p3=new Properties();  
	    p3.setProperty("name","Sonoo Jaiswal");  
	    p3.setProperty("email","sonoojaiswal@javatpoint.com");  
	      
	    p3.store(new FileWriter("info.properties"),"Javatpoint Properties Example");  
	}  
	}  
            