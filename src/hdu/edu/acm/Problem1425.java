package hdu.edu.acm;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1425 {

	/**
	 * author : luoyang 2013-4-15
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a[] = new int[10000001];
		int n, m;
		while (input.hasNext()) {
			n = input.nextInt();
			m = input.nextInt();
			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			Arrays.sort(a, 0, n);

			for (int i = n - 1; i >= n - m; i--) {
				System.out.print(a[i]);
				if (i != n - m)
					System.out.printf(" ");

			}
			System.out.println();
		}
	}
}
