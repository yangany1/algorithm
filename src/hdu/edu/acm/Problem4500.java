package hdu.edu.acm;

import java.util.Scanner;

public class Problem4500 {

	/**
	 * author : luoyang
	 * 2013-3-27
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int a,b;
		a=input.nextInt();
		b=input.nextInt();
		while(a!=0||b!=0)
		{
			int m[][]=new int[a+1][b+1];
			int score[][]=new int[a+1][b+1]; 
			for(int i=1;i<a+1;i++){
				for(int j=1;j<b+1;j++){
					m[i][j]=input.nextInt();
				}
			}
			for(int i=1;i<a+1;i++){
				for(int j=1;j<b+1;j++){
					score[i][j]=getValue(m,i,j,a,b);
				}
			}
			
			int max=Integer.MIN_VALUE;
			int row=0;
			int col=0;
			for(int i=1;i<a+1;i++){
				for(int j=1;j<b+1;j++){
					//System.out.print(i+","+j+","+score[i][j]+" ");
					if(score[i][j]>max){
						max=score[i][j];
						row=i;
						col=j;
					}
				}
			}
			System.out.printf("%d %d %d",row,col,max);
			System.out.println();
			a=input.nextInt();
			b=input.nextInt();
		}
	}

	public static int getValue(int[][] a,int i,int j,int n,int m)
	{
		int sum=0;
		int array[][]={{-1,0},{1,0},{0,-1},{0,1}};
		for(int k=0;k<4;k++){
			if((i+array[k][0]>0)&&(i+array[k][0]<=n)&&(j+array[k][1]>0)&&(j+array[k][1]<=m)){
			   boolean same=a[i][j]*a[i+array[k][0]][j+array[k][1]]>0?true:false;
			   if(same)
				   sum-=Math.abs(a[i+array[k][0]][j+array[k][1]]);
			   else
				   sum+=Math.abs(a[i+array[k][0]][j+array[k][1]]);
			}
		}
		
		return sum;
	}
}
