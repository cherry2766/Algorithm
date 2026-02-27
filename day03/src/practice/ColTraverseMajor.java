package practice;

public class ColTraverseMajor {

	public static void main(String[] args) {
		int R = 3;
		int C = 4;
		int[][] arr = { 
				{ 1, 4, 7, 10 }, 
				{ 2, 5, 8, 11 }, 
				{ 3, 6, 9, 12 } };

		// 열 우선 (고정)
		for (int c = 0; c < 4; c++) {
			// 행 홀/짝 구분
			// 홀 수일때 bottom -> top
			if (c % 2 == 1) {
				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.printf("%d ", arr[r][c]);
				}
				// 짝 수일때 top -> bottom
			} else {
				for (int r = 0; r < 3; r++) {
					System.out.printf("%d ", arr[r][c]);
				}
			}
			System.out.println();

		}

	}

}
