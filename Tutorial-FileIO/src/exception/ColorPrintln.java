package exception;

public class ColorPrintln {

	public static void main(String[] args) {
		
		ColoredPrinter cp = new ColoredPrinter.Builder(1, false)
                .foreground(FColor.WHITE).background(BColor.BLUE)   //setting format
                .build();

//printing according to that format
cp.println(cp);
cp.setAttribute(Attribute.REVERSE);
cp.println("This is a normal message (with format reversed).");

//resetting the terminal to its default colors
cp.clear();
cp.print(cp.getDateFormatted(), Attribute.NONE, FColor.CYAN, BColor.BLACK);
cp.debugPrintln(" This debug message is always printed.");
cp.clear();
cp.print("This example used JCDP 1.25   ");

//temporarily overriding that format
cp.print("\tMADE ", Attribute.BOLD, FColor.YELLOW, BColor.GREEN);
cp.print("IN PORTUGAL\t\n", Attribute.BOLD, FColor.YELLOW, BColor.RED);
cp.println("I hope you find it useful ;)");

cp.clear(); //don't forget to clear the terminal's format before exiting
	}

}
