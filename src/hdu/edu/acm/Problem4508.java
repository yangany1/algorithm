package hdu.edu.acm;

import java.util.Scanner;

public class Problem4508 {

	/**
	 * author : luoyang
	 * 2013-4-11
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n;
		int a[]=new int[101];
		int b[]=new int[101];
		int m;
		int dp[]=new int[100001];
		while(input.hasNext())
		{
			n=input.nextInt();
			for(int i=1;i<=n;i++)
			{
				a[i]=input.nextInt();
				b[i]=input.nextInt();
			}
			m=input.nextInt();
			for(int i=0;i<=m;i++)
				dp[i]=0;
			for(int i=1;i<=m;i++)
			{
				int max=dp[i];
				for(int j=1;j<=n;j++)
				{
					if(b[j]<=i)
					{
						int temp=dp[i-b[j]]+a[j];
						if(max<temp)
						{
							max=temp;	
						}
					}
				}
				dp[i]=max;
			}
			System.out.println(dp[m]);
		}
	}

}
