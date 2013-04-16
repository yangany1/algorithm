package hdu.edu.acm;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Problem4503 {

	/**
	 * author : luoyang
	 * 2013-3-29
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(new BufferedInputStream( System.in));
		int n=input.nextInt();
		int a[]=new int [1010];
		while((n--)!=0)
		{
			int k=input.nextInt();
			for(int i=0;i<k;i++)
			{
				a[i]=input.nextInt();
			}
			int sum=0;
			for(int i=0;i<k;i++)
			{
				sum+=(a[i]*(k-1-a[i]));
			}
			sum=sum/2;
			int all=k*(k-1)*(k-2)/6;
			double r=1-1.0*sum/all;
			System.out.printf("%.3f",r);
			System.out.println();
		}
	}

}
