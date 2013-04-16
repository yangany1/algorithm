package hdu.edu.acm;

import java.util.Scanner;

public class Problem1018 {

	/**
	 * author : luoyang
	 * 2013-4-13
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		double s;
		int a;
		while((n--)!=0)
		{
			s=0;
			a=input.nextInt();
			for(int i=a;i>0;i--)
			{
				s+=Math.log10(i);
				
			}
			System.out.println((int)s+1);
		}
		
	}

}
