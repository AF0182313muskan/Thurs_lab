package practicals;

import java.io.*;
class Hii
{
          public static void main(String[] args) throws IOException
                  {
                                  FileInputStream fin=new FileInputStream("C:\\Users\\Rajneesh\\Desktop\\ranjeet.txt");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Rajneesh\\Desktop\\ranjeet1.txt");
		int r1;
		while((r1=fin.read())!=-1)
		{
		   fout.write(r1);	
		}
		fout.close();
		fin.close();
	}
}