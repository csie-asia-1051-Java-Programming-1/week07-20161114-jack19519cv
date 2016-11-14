package ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n=scn.nextInt();
			int data[]=new int[n];
			float sum=0,a=0,b=0;
	    	for(int j=0;j<n;j++){
	    		data[j]=scn.nextInt();
	    		
	    	}
			 System.out.print(std(data, n));
		}
	public static float std(float []data,float n){
		
		double sum=0,a=0,b=0,c=0;
		
		for(int v=0;v<n;v++){
    		
    		b+=Math.pow((float)data[v]-(float)var(n), 2)/n;
    		c=Math.sqrt(b);
    	}
		
		
		
		
		return 0;
	}
		 public static float var(float []data,float n) {
		    	Scanner scn = new Scanner(System.in);
		    	float sum=0,a=0,b=0;
		    	for(int i=0;i<n;i++){
					
					
		    		sum+=data[i];
					
					
		    	}
		    	a=sum/n;
		    	
		    	
		    	
		    	
		    	
		    	return a;
	}

}
