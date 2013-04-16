package hdu.edu.acm;

import java.util.Scanner;

public class Problem4540 {

	/**
	 * author : luoyang
	 * 2013-4-3
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int a[][]=new int[21][11];
		int dp[][]=new int[21][11];
		while(input.hasNext())
		{
			int n=input.nextInt();
			int k=input.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=k;j++)
				{
					a[i][j]=input.nextInt();
				}
			}
			for(int i=1;i<=k;i++)
			{
				dp[1][i]=0;
			}
			for(int i=2;i<=n;i++)
			{
				for(int j=1;j<=k;j++)
				{
					int min=Integer.MAX_VALUE;
					for(int m=1;m<=k;m++)
					{
						int temp=dp[i-1][m]+Math.abs(a[i-1][m]-a[i][j]);
						if(temp<min)
						{
							min=temp;
						}
					}
					dp[i][j]=min;
				}
			}
			int result=Integer.MAX_VALUE;
			for(int j=1;j<=k;j++)
			{
				if(result>dp[n][j])
					result=dp[n][j];
			}
			System.out.println(result);
		}
	}

}
