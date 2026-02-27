package boj.스위치;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 스위치 개수
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		// 스위치 초기값
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(st.nextToken());
			arr[i + 1] = N;
		}
		// 학생 수
		int S = Integer.parseInt(br.readLine());

		for (int i = 0; i < S; i++) {
			// 성별
			st = new StringTokenizer(br.readLine());
			int G = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			if (G == 1) {
				for (int j = num; j < T + 1; j += num) {
					showSwitch(arr, j);
				}
			} else {
				int z = 1;
				showSwitch(arr, num);
				while (num - z > 0 && num + z < T + 1 && arr[num - z] == arr[num + z]) {
					showSwitch(arr, num - z);
					showSwitch(arr, num + z);
					z++;
				}
			}

		}
		for (int i = 1; i < T + 1; i++) {
			System.out.print(arr[i] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}

	} // main 끝

	public static void showSwitch(int arr[], int idx) {
		if (arr[idx] == 1) {
			arr[idx] = 0;
		} else {
			arr[idx] = 1;
		}
	}

}
