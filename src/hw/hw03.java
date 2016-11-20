package hw;

import java.util.Scanner;

/*
 * Date: 2016/11/14



 * Author: 105021059 ¤ý«T÷g
 */
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scn = new Scanner(System.in);
		   int m=scn.nextInt();
		  int n=scn.nextInt();
		 
		  System.out.print(fun(m)/(fun(n)*fun(m-n)));
			}
		  public static int fun(int x){
			  if(x==1){
				  return 1;
			  }else{
				  return x*fun(x-1);
			  }
			  
		  }
		  
			}