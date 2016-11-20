package hw;
import java.util.Scanner;
/*
 * Date: 2016/11/14



 * Author: 105021059 ¤ý«T÷g
 */
public class hw04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
	
		 System.out.println(gcd(a,b));
		
	}
	public static int gcd(int a, int b)
	{
	  if(a == 0 || b == 0) return a+b; // base case
	  	  return gcd(b,a%b);
	}
	
}
