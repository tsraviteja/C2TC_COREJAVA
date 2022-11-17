package com.cg.fundamentals;

public class Stack {
	final int size=4;
	int top;
	int stack[]=new int[size];
	Stack(){
		top=-1;
	}
	
	void push(int data)
	{
		if(top==size-1)
			System.out.println("stack overflow");
		else
			stack[++top]=data;
	}
	
	void pop()
	{
		int temp;
		if(top==-1)
		     System.out.println("stack underflow");
		else
		{
			temp=stack[top];
			top--;
			System.out.println("poped data from stack is "+temp);
		}
	}
	void display()
	{
		int i;
		if(top==-1)
			System.out.println("stack is empty");
		else
		{
			for(i=top;i>=0;i--)
				System.out.print(stack[i]+" ");
		}
		
	}

}

