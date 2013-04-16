package hdu.edu.acm;

import java.util.Scanner;

public class Problem1091 {

	/**
	 * author : luoyang
	 * 2013-3-23
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
	    int a,b=0;
	    a=input.nextInt();
	    b=input.nextInt();
		while (a!=0||b!=0)
		{
			System.out.println(a+b);
			a=input.nextInt();
		    b=input.nextInt();
		}
	}

}
