package hdu.edu.acm;

import java.util.Scanner;

public class Problem4519 {

	/**
	 * author : luoyang
	 * 2013-4-11
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		int k,m,n;
		int answer;
		while((t--)!=0)
		{
			 n=input.nextInt();
			 k=input.nextInt();
			 m=input.nextInt();
			 if(m>=n)
				 answer=k;
			 else
			 {
				 if(n*k%m==0)
				 {
					 answer=n*k/m;
				 }
				 else
				 {
					 answer=(int)(n*k/m)+1;
				 }
			 }
			 System.out.println(answer);
		}
	}

}
