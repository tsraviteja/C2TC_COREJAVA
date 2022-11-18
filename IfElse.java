package com.cg.fudamentals;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] ags) {
		Scanner ob=new Scanner(System.in);
		System.out.print("enter your age :");
		int age=ob.nextInt();
		if(age>=18)
			System.out.println("your eligible for votting");
		else
           System.out.println("your not eligible for votting"); 
		ob.close();
	}
	

}
