package exception;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;

public class App {

	public static void main(String[] args) {

		try{
		readFile();
		}
		catch(IOException e){
			System.out.println("catched exception: "+e.toString());
		}
		catch(ParseException P){
			System.out.println("catched ParseException: "+P.toString());
		}
		
		System.out.println("continue.. ");
	}

	public static void readFile() throws IOException, ParseException {
		
		/*
		File file = new File("test.txt");

		FileReader fr = new FileReader(file);
	    */
		throw new IOException();
		//throw ParseException("Error in CommandList ",3);
		
	}

}
