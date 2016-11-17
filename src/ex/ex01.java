package ex;
/*
 * Date: 2016/11/14


 * Author: 105021059 ¤ý«T÷g
 */

import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		
		 System.out.print(var(n));
	}
	 public static float var(int n) {
	    	Scanner scn = new Scanner(System.in);
	    	int data[]=new int[n];
	    	float sum=0,a=0,b=0;
	    	for(int j=0;j<n;j++){
	    		data[j]=scn.nextInt();
	    	}
	    	for(int i=0;i<n;i++){
				
				
	    		sum+=data[i];
				
				
	    	}
	    	a=sum/n;
	    	for(int v=0;v<n;v++){
	    		
	    		b+=Math.pow(data[v]-a, 2)/n;
	    	}
	    	
	    	
	    	
	    	
	    	return b;
}
}