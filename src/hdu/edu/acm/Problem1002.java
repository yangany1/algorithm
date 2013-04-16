package hdu.edu.acm;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1002 {

	/**
	 * author : luoyang
	 * 2013-4-3
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		BigInteger a,b;
		for(int i=1;i<=n;i++)
		{
			a=input.nextBigInteger();
			b=input.nextBigInteger();
			System.out.printf("Case %d:",i);
			System.out.println();
			System.out.printf("%d + %d = ",a,b);
			System.out.println(a.add(b));
			if(i!=n)
				System.out.println();
		}

	}

}
