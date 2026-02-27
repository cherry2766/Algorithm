package SWEA.VerticalReading;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			char[][] arr = new char[5][];

			int maxLen = 0;
			for (int i = 0; i < 5; i++) {
				String str = br.readLine();

				arr[i] = new char[str.length()];
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = str.charAt(j);
				}
				maxLen = Math.max(maxLen, str.length());
			}
			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < maxLen; j++) {
				for (int i = 0; i < 5; i++) {
					if (arr[i].length <= j) {
						continue;
					}
					sb.append(arr[i][j]);
				}

			}
			System.out.println("#" + tc + " " + sb.toString());
		}

	}

}
