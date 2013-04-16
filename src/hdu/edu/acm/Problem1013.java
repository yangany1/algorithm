package hdu.edu.acm;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1013 {

	/**
	 * author : luoyang 2013-4-12
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BigInteger n;
		while(!(n=input.nextBigInteger()).equals(0))
		{
			
			System.out.println(getRoot(n));
		}
	}

	public static int getRoot(BigInteger n) 
	{
		if(n.compareTo(BigInteger.valueOf(10))<0)
			return n.intValue();
		else
		{
			BigInteger sum=BigInteger.valueOf(0);
			
			while(n.compareTo(BigInteger.valueOf(0))>0)
			{
				
				BigInteger temp=n.mod(BigInteger.valueOf(10));
				sum=sum.add(temp);
				n=n.divide(BigInteger.valueOf(10));
			}
			return getRoot(sum);
		}
		
	}
}
