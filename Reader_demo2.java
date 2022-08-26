package practicals;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import reader.*;
public class Writer_demo extends  Reader_demo
{
public void writer() throws IOException

{
	File file=new File("D:\\Rohit\\Data.txt");
	if(file.createNewFile())
	{
		System.out.println("File are create successfully");
	}
	else
	{
		System.out.println("File are not create");
	}
	Writer w=new FileWriter("D:\\Rohit\\Data.txt");
	String s="Hello rohit singh";
	w.write(s);
	w.close();
}

	public static void main(String[] args) throws IOException 
	{

		 Writer_demo obj=new  Writer_demo();
		 obj.writer();
		 obj.read(); 
	}

}