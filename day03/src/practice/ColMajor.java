package practice;

import java.util.Arrays;

public class ColMajor {
	// 4가지 방식
	/*
	 * 1. PscalCase - 클래스 2. camelCase - 변수, 메서드 3. kebab-case - api key 4.
	 * SNAKE_CASE - 상수 final
	 */
	public static void main(String[] args) {
		// 열 우선순위

		int R = 3;
		int C = 4;
		int[][] arr = new int[R][C];
		// 가로 탐색 -> 열
		// 세로 탐색 -> 행

		// 열로 고정
		for (int c = 0; c < C; c++) {
			// 행 탐색
			for (int r = 0; r < R; r++) {
				arr[r][c] = c * R + r + 1;
			}
			
		}
		
		for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                System.out.printf("%d ", arr[r][c]);
            }
            System.out.println();
        }

		for (int c = 0; c < C; c++) {
			// 행 탐색
			for (int r = 0; r < R; r++) {
				System.out.printf("%d ", arr[r][c]);
			}
			System.out.println();
		}

	}

}
