package hw;
/*
 * Date: 2016/11/14




 * Author: 105021059 ¤ý«T÷g
 */
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	 int m=0;
		System.out.print(x(n,m));
	}
	public static int x(int c,int m ) {
		if(c!=0){
			m++;
			  return x(c/10,m);
		  }else{
			 
			
			 return m;
		  }
		
		
		
	}
	
}

