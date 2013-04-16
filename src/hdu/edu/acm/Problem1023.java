package hdu.edu.acm;

import java.math.BigDecimal;
import java.util.Scanner;

public class Problem1023 {

	/**
	 * author : luoyang
	 * 2013-3-23
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		BigDecimal[] a=new BigDecimal[103];
		a[0]=new BigDecimal(1);
		a[1]=new BigDecimal(1);
		for(int i=2;i<103;i++){
			a[i]=new BigDecimal(0);
			for(int j=0;j<i;j++){
				a[i]=a[i].add(a[j].multiply(a[i-j-1]));
			}
		}
		while (input.hasNext())
		{
			int n=input.nextInt();
			System.out.println(a[n]);
			
		}
	}

}
