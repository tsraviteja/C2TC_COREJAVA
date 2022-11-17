package com.cg.fundamentals;
import java.util.*;

public class Stack_Main {

	public static void main(String[] args) {
		Stack ob=new Stack();
        Scanner input=new Scanner(System.in);
        while(true)
        {
        	System.out.println("enter your choice");
        	System.out.print("1.insert\n2.delete\n3.display\n4.exit\n");
        	int ch=input.nextInt();
            switch(ch)
            {
            case 1:System.out.println("enter a data for insertion");
                   int data=input.nextInt();
                   ob.push(data);
                   break;
            case 2:ob.pop();
                   break;
            case 3:ob.display();
                   break;
            case 4:System.out.println("end of the program");
                   System.exit(0);
            default:System.out.println("invalid choice try again");
                    break;
            }
        }
	}
}
