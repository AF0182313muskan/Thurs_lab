package practicals;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Reader_demo
{
public void read() throws IOException
{
	Reader r=new FileReader("D:\\Muskan\\Data.txt");
	   int i;	
	   while((i=r.read())!=-1)    
	          System.out.print((char)i);    
	          r.close();    
}
public static  void main(String[] args) throws IOException
{
	Reader_demo obj=new Reader_demo();
	obj.read();
			
}
}