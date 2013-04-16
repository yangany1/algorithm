package hdu.edu.acm;

import java.util.Scanner;

public class Problem2035 {

	/**
	 * author : luoyang
	 * 2013-4-15
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b=0;
		int sum=1;
		a=input.nextInt();
		b=input.nextInt();
		while((a!=0)||(b!=0))
		{
			sum=1;
			for(int i=0;i<b;i++)
			{
				sum*=a;
				sum%=1000;
			}
			System.out.println(sum);
			a=input.nextInt();
			b=input.nextInt();
		}
	}

}
