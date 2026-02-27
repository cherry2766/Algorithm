package practice;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// 2차원 배열 선언
		// 2차원은 반드시 길이 필요
		// 2차원은 가변으로 반드시 적을 필요 없음
		// (하지만, null 주의)
//		int[][] arr = new int[3][];

		// 배열의 길이를 넣어줄때는 대괄호
		// 배열을 직접 넣어줄때는 중괄호
		int[][] arr1 = { { 1, 2, 3 } }; // 2차원이고, 1*3행열
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 동적할당으로 2차원 배열 채우기
		// 배열 선언 + 배열의 크기 1,2차원 모두 크기 존재 해야함
		int[][] scores1;
		for (int tc = 1; tc < 5; tc++) {
			scores1 = new int[3][4];
		}

		int[][] nums = new int[3][4];

		// 1차원 row
		for (int r = 0; r < nums.length; r++) {
			// 2차원 col
			for (int c = 0; c < nums[r].length; c++) {
				nums[r][c] = r * nums[r].length + c + 1;
			}
			System.out.println(Arrays.toString(nums[r]));
		}
	}

}
