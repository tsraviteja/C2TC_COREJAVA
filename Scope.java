package com.cg.fudamentals;

public class Scope {

	public static void main(String[] args) {
		int outer=0;
		  int length=10;
		  int key=5;
	      out:{
	    	  for(int i=0;i<length;i++)
	    	  {
	    		  for(int j=0;j<length;j++)
	    		  {
	    			  if(i==key)
	    				  break out;
	    			  outer+=1;
	    		  }
	    	  }
	      }
	      System.out.println(outer);
	}

}
