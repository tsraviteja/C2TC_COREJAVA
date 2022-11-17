package com.cg.fundamentals;

import java.util.Scanner;

public class BinarySearch {
	
void sort(int arr[])
{
	int n=arr.length;
	for(int i=0;i<n-1;i++)
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
}
int search(int arr[],int key)
{
	int n=arr.length;
	int low=0;
	int high=n-1;
	while(true)
	{
		int mid=(low+high)/2;
		if(low>high)
			return 0;
		else
		{
			if(arr[mid]==key)
				return 1;
			else if(key>arr[mid])
				  low=mid+1;
			else
				high=mid-1;
		}
	}
}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		BinarySearch ob=new BinarySearch();
        int arr[]= {1,5,6,8,3,2,23};
        System.out.println("enter the key element to be find");
        int key=input.nextInt(); 
        ob.sort(arr);
        int result=ob.search(arr,key);
        if(result==1)
        	System.out.println("key "+key+" found");
        else
        	System.out.println("key "+key+" not found");
        input.close();
	}

}
