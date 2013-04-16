package hdu.edu.acm;

import java.util.Scanner;

public class Problem1096 {

	/**
	 * author : luoyang 2013-4-11
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			int m = input.nextInt();
			while ((m--) != 0) {
				sum += input.nextInt();
			}
			System.out.println(sum);
			if (i != n - 1)
				System.out.println();
		}

	}

}
