package hdu.edu.acm;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1013Way2 {

	/**
	 * author : luoyang
	 * 2013-4-12
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String s=null;
		while(input.hasNext())
		{
			s=input.nextLine();
			int sum=0;
			if(s.length()==1)
			{
				if(Integer.parseInt(s)==0)
				{
					break;
				}
				
			}
			int l=s.length();
			while(l-->0)
			{
				sum+=Integer.parseInt(s.substring(l, l+1));
			}
			System.out.println(getRoot(sum));
		}
	}
	
	public static int getRoot(int n) 
	{
		if(n<10)
			return n;
		else
		{
			int sum=0;
			
			while(n>0)
			{
				
				int temp=n%10;;
				sum+=temp;
				n=n/10;
			}
			return getRoot(sum);
		}
		
	}

}
