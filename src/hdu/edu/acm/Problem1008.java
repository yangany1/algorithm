package hdu.edu.acm;

import java.util.Scanner;

public class Problem1008 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int first;
		int second;
		int n;
		while((n=input.nextInt())!=0){
			//int n=input.nextInt();
			first=0;
			int sum=0;
			for(int i=0;i<n;i++){
				second=input.nextInt();
				sum+=cal(first,second);
				first=second;
			}
			System.out.println(sum);
		}
	}

	public static int cal(int first,int second)
	{
		if(first==second)
		{
			return 5;
		}
		else if(first>second)
		{
			return 5+4*(first-second);
		}
		else
			return 5+6*(second-first);
	}
}
