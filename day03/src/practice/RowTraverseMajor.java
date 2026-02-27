package practice;

public class RowTraverseMajor {

	public static void main(String[] args) {
//		----->
//		<-----

		int R = 3;
		int C = 4;
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		// 행우선
		for (int r = 0; r < arr.length; r++) {
			// 짝수일 때 ----->
			if ((r & 1) == 0) {
				for (int c = 0; c < arr[r].length; c++) {
					System.out.print(arr[r][c] + " ");
				}
				// 홀수일 때 <-----
			} else {
				for (int c = arr[r].length - 1; c >= 0; c--) {
					System.out.print(arr[r][c] + " ");
				}
			}
			System.out.println();
		}

	}

}
