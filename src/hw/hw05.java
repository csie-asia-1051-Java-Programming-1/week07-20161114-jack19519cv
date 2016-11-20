package hw;

import java.util.Scanner;
/*
 * Date: 2016/11/14



 * Author: 105021059 ¤ý«T÷g
 */
public class hw05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 String num = scn.next();
		    String reverse = reverse(num, num.length()-1);
		    System.out.println(reverse);
		}

	public static String reverse(String str, int index){
		    if(index == 0){
		        return str.charAt(0) + "";
		    }

		    char letter = str.charAt(index);
		    return letter + reverse(str, index-1);
		}}