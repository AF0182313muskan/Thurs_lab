package practicals;

import java.util.Scanner;
class LabSession
		{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		String name1,name2,name3;
		char name4,name5;
		System.out.println("Enter your first name:");
		name1=sc.next();
		System.out.println("Enter the middle name:");
		name2=sc.next();
		System.out.println("Enter the last naem:");
		name3=sc.next();
		System.out.println(name1+ " " +name2+ " " +name3);
		name4=name1.charAt(0);
		name5=name2.charAt(0);
		System.out.println(name4+ "."+name5+ "." +name3);
		}
	}

