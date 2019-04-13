//simple program of applet  

import java.applet.Applet;  
import java.awt.Graphics;  

public class First extends Applet{  

  public void paint(Graphics g){g.drawString("Welcome to Applet",50, 50);
  g.draw3DRect(100, 190, 100, 30, true);
  
  Integer x = new Integer(40);
  System.out.println(x.valueOf(x));
  
  
  }  
  
}  