package hdu.edu.acm;

import java.util.Scanner;

public class Problem1003 {

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
		int a[]=new int[1000001];
		for(int k=1;k<=n;k++)
		{
			int m=input.nextInt();
			a[0]=0;
			for(int i=1;i<=m;i++)
			{
				a[i]=a[i-1]+input.nextInt();
				//System.out.println(a[i]);
			}
			int start=0;int end=1;int min=0;int v=a[1];
			
			for(int j=2;j<=m;j++)
			{
				if(a[j-1]<a[min])
					min=j-1;
				if(a[j]-a[min]>v)
				{
					v=a[j]-a[min];
					start=min;
					end=j;
				}
					
			}
			
			System.out.printf("Case %d:",k);
			System.out.println();
			
			System.out.printf("%d %d %d",v,start+1,end);
			System.out.println();
			if(k!=n)
				System.out.println();
			
			
		}
	}

}
