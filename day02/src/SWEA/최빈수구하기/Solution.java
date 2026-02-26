package SWEA.최빈수구하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 테스트 케이스 개수
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			// 테스트 케이스 번호
			int testCaseNum = Integer.parseInt(br.readLine());

			// 0~100점까지 점수가 idx인 배열
			int[] cnt = new int[101];

			StringTokenizer st = new StringTokenizer(br.readLine());

			// 1000명 학생 점수 받기
			for (int j = 0; j < 1000; j++) {
				int score = Integer.parseInt(st.nextToken());
				// 점수 개수 세서 넣기
				cnt[score]++;
			}
			// 점수의 개수 최대값
			int max = 0;
			// 최빈수
			int result = 0;

			for (int k = 0; k < cnt.length; k++) {
				// 작은 점수부터 탐색하므로 개수가 같으면 더 큰 점수가 result에 저장됨
				if (cnt[k] >= max) {
					max = cnt[k];
					result = k;
				}
			}
			System.out.println("#" + testCaseNum + " " + result);
		}

	}

}
