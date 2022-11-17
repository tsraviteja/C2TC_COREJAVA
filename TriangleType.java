package com.cg.fundamentals;

import java.util.Scanner;

class Triangle{
	int a,b,c;
    Triangle(int a,int b,int c)
	 {
		this.a=a;
		this.b=b;
		this.c=c;
	 }
    void check()
    {
    	if(a==0||b==0||c==0)
    		System.out.println("not a triangle");
    	else
    	{
    		if(a==b&&a==c)
    			System.out.println("equilateral triangle");
    		else if(a==b||a==c||b==c)
    			System.out.println("isosceles triangle");
    		else
    			System.out.println("scalene triangle");
    	}
    }
	
}

public class TriangleType {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the values for sides of trinagle");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		Triangle ob=new Triangle(a,b,c);
		ob.check();
		input.close();
	}
}
