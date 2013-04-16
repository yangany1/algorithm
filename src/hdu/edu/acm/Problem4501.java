package hdu.edu.acm;

import java.util.Scanner;

public class Problem4501 {

	/**
	 * author : luoyang 2013-3-28
	 * 
	 * @param args
	 */

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n, v1, v2, k;
		int dp[][][] = new int[110][110][10];
		while (input.hasNext()) {
			n = input.nextInt();
			v1 = input.nextInt();
			v2 = input.nextInt();
			k = input.nextInt();
			int a[][] = new int[n][3];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 3; j++) {
					a[i][j] = input.nextInt();
				}
			}
			for (int t = 0; t < n; t++) {
				for (int i = 0; i <= v1; i++) {
					for (int j = 0; j <= v2; j++) {
						for (int s = 0; s <= k; s++) {
							// 如果钱够用且积分够用
							if (a[t][0] <= i && a[t][1] <= j) {
								dp[i][j][s] = max(
										max(dp[i - a[t][0]][j][s] + a[t][2],
												dp[i][j - a[t][1]][s] + a[t][2]),
										dp[i][j][s]);
								if (s >= 1) {
									dp[i][j][s] = max(dp[i][j][s],
											dp[i][j][s - 1] + a[t][2]);
								}
							}
							// 钱积分都不够
							else if (a[t][0] > i && a[t][1] > j) {
								if (s >= 1) {
									dp[i][j][s] = max(dp[i][j][s],
											dp[i][j][s - 1] + a[t][2]);
								}
							}
							// 钱不够，积分够
							else if (a[t][0] > i ) {
								dp[i][j][s] = max(dp[i][j - a[t][1]][s]
										+ a[t][2], dp[i][j][s]);
								if (s >= 1) {
									dp[i][j][s] = max(dp[i][j][s],
											dp[i][j][s - 1] + a[t][2]);
								}
							}
							// 只能用钱
							else {
								dp[i][j][s] = max(dp[i - a[t][0]][j][s]
										+ a[t][2], dp[i][j][s]);
								if (s >= 1) {
									dp[i][j][s] = max(dp[i][j][s],
											dp[i][j][s - 1] + a[t][2]);
								}
							}
						}
					}
				}
			}
			System.out.println(dp[v1][v2][k]);
		}
	}
}
