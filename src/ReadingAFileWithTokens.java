//Justin Himmighoefer
//This program uses a tokenizer to read a file and separate each word onto
//it's own line and print it for the user to see.

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingAFileWithTokens
{
	public static void main(String[] args)
	{
	String tokenRead;
	int count = 0;
	Scanner inputStream = null;
	
	try
	{
		inputStream = new Scanner(new FileInputStream("getty.txt"));
	}//end try
	
	catch(FileNotFoundException e)
	{
		System.out.println("File cound not be opened, program will close");
		System.exit(0);
	}//end catch
	
	while(inputStream.hasNext())
	{
		tokenRead = inputStream.next();
		System.out.println(tokenRead);
		++count;
	}//end while
	inputStream.close();
	System.out.println("Number of tokens was: " + count);
	}//end main
}//end class