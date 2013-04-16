package hdu.edu.acm;

import java.util.Scanner;

public class Problem4535 {

	/**
	 * author : luoyang
	 * 2013-4-3
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		long  f[]=new long[102];
		f[1]=0;
		f[2]=1;
		for(int i=3;i<=100;i++)
		{
			f[i]=((i-1)*(f[i-1]+f[i-2]))%1000000007;
		}
		while((n--)!=0)
		{
			int a=input.nextInt();
		
			System.out.println(f[a]);
		}
		
	}


}
