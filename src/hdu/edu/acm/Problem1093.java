package hdu.edu.acm;

import java.util.Scanner;

public class Problem1093 {

	/**
	 * author : luoyang
	 * 2013-4-11
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int sum=0;
		while((n--)!=0)
		{
			sum=0;
			int a=input.nextInt();
			while((a--)!=0)
			{
				sum+=input.nextInt();
			}
			
			System.out.println(sum);
		}
	}

}
