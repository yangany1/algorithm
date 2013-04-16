package hdu.edu.acm;

import java.util.Scanner;

public class Problem1094 {

	/**
	 * author : luoyang 2013-4-11
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int sum = 0;
		while (input.hasNext()) {
			sum = input.nextInt() + input.nextInt();
			System.out.println(sum);
			System.out.println();
		}
	}

}
