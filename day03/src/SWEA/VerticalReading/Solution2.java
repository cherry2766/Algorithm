package SWEA.VerticalReading;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
// 강사님 풀이
	// 새로운 아이디어
	// String 1차원 배열 하나 만들어서
	// 일단은 모든 줄을 하나씩 입력 받고 동시에 최대 길이도 탐색
	// char 2차원 배열의 크기를 [5][최대길이] 초기화를 시키면

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			char[][] words = new char[5][];

			int maxLen = Integer.MIN_VALUE;
			for (int i = 0; i < 5; i++) {
				String str = br.readLine();

				words[i] = new char[str.length()];
				for (int s = 0; s < words[i].length; s++) {
					words[i][s] = str.charAt(s);
				}

				maxLen = Math.max(maxLen, str.length());
			}

			StringBuilder sb = new StringBuilder();

			for (int c = 0; c < maxLen; c++) {
				for (int r = 0; r < 5; r++) {
					if (words[r].length <= c) {
						continue;
					}

					sb.append(words[r][c]);
				}
			}

			System.out.println("#" + tc + " " + sb.toString());

		} // tc

	} // main

}
