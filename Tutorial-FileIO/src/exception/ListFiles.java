package exception;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

/**
 * A class that implements the Java FileFilter interface.
 */
class MyFileFilter implements FileFilter
{
  private final String[] okFileExtensions = new String[] {"txt", "pdf", "doc", "html"};

  public boolean accept(File file)
  {
    for (String extension : okFileExtensions)
    {
      if (file.getName().toLowerCase().endsWith(extension))
      {
        return true;
      }
    }
    return true;
  }
}


public class ListFiles {
//		TODO i need to fix this 
public static void name() {
	
}

	public static void main(String[] args) {
		
		File dir = new File("/Users/satya/Documents/MyCoding-Practice");
		
		//File[] fileList = dir.listFiles();
		File[] fileList = dir.listFiles(new MyFileFilter());
		
		
		System.out.println(dir);
		
		for(File f : fileList){
			if(f.isDirectory())
				System.err.println(f+" is a directory!!");
			else
			System.out.println(f.getName());
			
		}		
	}
	
}
