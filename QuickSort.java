package com.cg.fundamentals;

import java.util.Scanner;

public class QuickSort
{
static void quickSort(int arr[],int low,int high)
	{
		int i;
		int pivot;
		int j;
		i=pivot=low;
		j=high;
		if(i<j)
		{
			while(i<j)
			{
				while(arr[i]<=arr[pivot]&&i<=high)
					   i++;
				while(arr[j]>arr[pivot]&&j>=low)
					   j--;
				if(i<j)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			int temp=arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
			quickSort(arr,low,j-1);
			quickSort(arr,j+1,high);
			
		}
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter the size of the array:");
	int n=input.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the array elements ");
	for(int i=0;i<n;i++)
		 arr[i]=input.nextInt();
	System.out.println("before sorting array elements");
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	quickSort(arr,0,n-1);
	System.out.println("");
	System.out.println("ofter sorting array elements");
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	input.close();
  }
}
   
