package practicals;

import java.util.Scanner;
public class LabSession3
			{
				public static void main(String args[])
				{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the String:");
				String s=sc.next();
				System.out.println("Enter the character you want to count:");
				String so=sc.next();
				int count1=s.length();
				int count2=s.replace(so,"").length();
				int count=count1-count2;
				System.out.println("The number of occurance of:" +so+ " is" +count);
				}
			}