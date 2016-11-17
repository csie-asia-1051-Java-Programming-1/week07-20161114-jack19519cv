package ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int data[][]=new int[n][n];
		float sum=0,a=0,b=0;
    	for(int j=0;j<n;j++){
    		data[j][j]=scn.nextInt();
    	}
    	System.out.println(var2(data, n));
		 System.out.println(std2(data, n));
	}
public static float std2(int[][] data,float n){
		float sum=0,a=0,b=0,c=0;
		for(int i=0;i<n;i++){
    		sum+=data[i][i];
    	}
    	a=sum/n;	 	
		for(int v=0;v<n;v++){
    		b+=Math.pow(data[v][v]-a, 2)/n;
    		c=(float)Math.sqrt(b);
    	}
		return c;
	     }
		 public static float var2(int [][]data,float n) {
		    	Scanner scn = new Scanner(System.in);
		    	float sum=0,a=0,b=0;
		    	for(int i=0;i<n;i++){
		    		sum+=data[i][i];
		    	}
		    	a=sum/n;	
		    	for(int v=0;v<n;v++){
		    		
		    		b+=Math.pow(data[v][v]-a, 2)/n;
		    	}
		    	return b;
	}
	}


