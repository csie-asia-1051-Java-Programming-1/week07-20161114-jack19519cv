package hw;

import java.util.Scanner;

/*
 * Date: 2016/11/14



 * Author: 105021059 ¤ý«T÷g
 */
public class hw01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c= scn.nextInt();
		
		int lcm = lcmF(lcmF(a, b), c);
		System.out.println(lcm);
	
	}
	 public static int lcmF(int i, int y) {
		 int n, x, s = 1, t = 1;
	        for (n = 1;; n++) {
	            s = i * n;
	            for (x = 1; t < s; x++) {
	                t = y * x;
	            }
	            if (s == t)
	                break;
	        }
	        return (s);
	    }
}
