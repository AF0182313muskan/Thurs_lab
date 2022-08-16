package practicals;

import java.util.Scanner;

public class Thursday_lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name1,name2,name3;
		char name4,name5;
		System.out.println("Enter your first name");
		name1=sc.next();
		System.out.println("Enter your second name");
		name2=sc.next();
		System.out.println("Enter your last name");
		name3=sc.next();
		//System.out.println(name1+" "+name2+ " " +name3);
		name4=name1.charAt(0);
		name5=name2.charAt(0);
		System.out.println(name4+" "+name5+ " "+name3 );

	}

}
