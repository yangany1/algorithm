package hdu.edu.acm;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Problem4509 {

	/**
	 * author : luoyang 2013-4-11
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[1441];
		Scanner input = new Scanner(new BufferedInputStream(System.in));
		int n;
		String s1, s2;
		int min, max;
		int result;
		while (input.hasNext()) {
			for (int i = 0; i < 1440; i++)
				a[i] = 0;
			result = 0;
			n = input.nextInt();
			while ((n--) != 0) {
				s1 = input.next();
				s2 = input.next();
				min = Integer.parseInt(s1.substring(0, 2)) * 60
						+ Integer.parseInt(s1.substring(3, 5));
				max = Integer.parseInt(s2.substring(0, 2)) * 60
						+ Integer.parseInt(s2.substring(3, 5));
				for (int j = min; j < max; j++) {
					if (a[j] != 1) {
						a[j] = 1;
					}
				}
			}
			for (int i = 0; i < 1440; i++) {
				if (a[i] == 0)
					result++;
			}
			System.out.println(result);
		}
	}

}
