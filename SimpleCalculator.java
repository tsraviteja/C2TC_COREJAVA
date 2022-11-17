package com.cg.fudamentals;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter two integer numbers for calculator :");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("enter u r choice of operation\n1.addtion\n2.subtraction\n3.multiplication"
				+ "\n4.division");
		int ch=input.nextInt();
		switch(ch)
		{
		case 1:int sum=num1+num2;
		       System.out.println(sum);
		       break;
		case 2:int sub=num1-num2;
		       System.out.println(sub);
		       break;
		case 3:int mul=num1*num2;
		      System.out.println(mul);
		       break;
		case 4:if(num2==0)
			      System.out.println("division by zero not possible");
		       else
		       {
		    	   double div=num1/num2;
		    	   System.out.println(div);
		       }
		       break;
		default:System.out.println("invalid choice");
		}
		input.close();
	}

}
