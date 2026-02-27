package practice;

public class RowMajor {

	public static void main(String[] args) {
		// 행 우선
		int R = 3;
		int C = 4;
		int[][] arr = new int[R][C];
		// 행
		for (int r = 0; r < R; r++) {
			// 열
			for (int c = 0; c < C; c++) {
				// 행 위치 인덱스 * 열의 길이
				arr[r][c] = r * C + c + 1;
				System.out.printf("%d ", arr[r][c]);
			}
			System.out.println();

		}

	}

}
