package hdu.edu.acm;

import java.util.Scanner;

public class Problem1092 {

	/**
	 * author : luoyang
	 * 2013-4-11
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n;
		int sum=0;
		while((n=input.nextInt())!=0)
		{
			sum=0;
			while((n--)!=0)
			{
				sum+=input.nextInt();
			}
			
			System.out.println(sum);
		}
	}

}
