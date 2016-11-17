package ex;
/*
 * Date: 2016/11/14


 * Author: 105021059 ¤ý«T÷g
 */
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
	public static float std(int[] data,float n){
		
		float sum=0,a=0,b=0,c=0;		
		for(int v=0;v<n;v++){
    		
    		b+=Math.pow(data[v]-var(data, n), 2)/n;
    		c=(float)Math.sqrt(b);
    	}
		
		
		
		
		return c;
	}
		 public static float var(int []data,float n) {
		    	Scanner scn = new Scanner(System.in);
		    	float sum=0,a=0,b=0;
		    	for(int i=0;i<n;i++){
					
					
		    		sum+=data[i];
					
					
		    	}
		    	a=sum/n;
		    	
		    	
		    	
		    	
		    	
		    	return a;
	}

}
