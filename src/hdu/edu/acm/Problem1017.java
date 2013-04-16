package hdu.edu.acm;

import java.util.Scanner;

public class Problem1017 {

	/**
	 * author : luoyang
	 * 2013-4-13
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int a,b=0;
		while((n--)!=0)
		{
		
			int number=0;
			a=input.nextInt();b=input.nextInt();
			while(a!=0||b!=0)//while((a=input.nextInt())!=0||(b=input.nextInt())!=0)
			{
				number++;
				int sum=0;
				for(int i=1;i<a;i++)
				{
					for(int j=i+1;j<a;j++)
					{
						if((i*i+j*j+b)%(i*j)==0)
							sum++;
					}
				}
				System.out.printf("Case %d: %d",number,sum);
				System.out.println();
				a=input.nextInt();b=input.nextInt();
			}
			if(n!=0)
				System.out.println();
		}
	}

}
