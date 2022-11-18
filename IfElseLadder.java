package com.cg.fudamentals;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.print("enter your age :");
        int age=input.nextInt();
       if(age>=0&&age<=16)
    	   System.out.println("child");
       else if(age>=17&&age<=30)
    	   System.out.println("young adult");
       else if(age>=31&&age<=45)
    	    System.out.println("middle-20age adult");
       else
    	   System.out.println("old-age adult");
       input.close();
	}

}
