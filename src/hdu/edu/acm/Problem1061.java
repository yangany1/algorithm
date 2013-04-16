package hdu.edu.acm;

import java.util.Scanner;

public class Problem1061 {

	/**
	 * author : luoyang
	 * 2013-4-15
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		int t=input.nextInt();
		int a;
		while((t--)!=0)
		{
			a=input.nextInt();
			int b=a%10;
			int result=1;
			if(a>4)
				a=a%4;
			for(int i=1;i<=a;i++)
			{
				result*=b;
				result%=10;
			}
			System.out.println(result);
		}
		
	}

}
