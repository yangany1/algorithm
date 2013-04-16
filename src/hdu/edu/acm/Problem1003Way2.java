package hdu.edu.acm;

import java.util.Scanner;

public class Problem1003Way2 {

	/**
	 * author : luoyang
	 * 2013-4-1
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		int temp,pos1,pos2,max,now,x;
		for(int k=1;k<=n;k++)
		{
			int m=input.nextInt();
			temp=input.nextInt();
			max=now=temp;
			pos1=pos2=x=1;
			
			
			for(int j=2;j<=m;j++)
			{
				temp=input.nextInt();
				if(now+temp<temp)
				{
					now=temp;
					x=j;
				}
				else
					now+=temp;
				if(now>max)
				{
					max=now;
					pos1=x;
					pos2=j;
				}
					
			}
			
			System.out.printf("Case %d:",k);
			System.out.println();
			
			System.out.printf("%d %d %d",max,pos1,pos2);
			System.out.println();
			if(k!=n)
				System.out.println();
			
			
		}
	}

}
