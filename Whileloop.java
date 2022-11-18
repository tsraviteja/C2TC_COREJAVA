package com.cg.fudamentals;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.println("enter two number for summation between them");
        int num=input.nextInt();
        int num1=input.nextInt();
        int sum=0;
        while(num!=num1+1)
        {
        	sum+=num;
        	num++;
        }
        System.out.println("summation = "+sum);
        input.close();
	}

}
