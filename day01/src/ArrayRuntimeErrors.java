package practice;

import java.util.Arrays;

public class ArrayRuntimeErrors {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		// 행을 써서 2차원 출력하기
		arr[0] = new int[] { 1, 2, 3, 4, 5 }; // 5
		arr[1] = new int[4]; // 4
		arr[2] = new int[2]; // 2
		for (int r = 0; r < arr.length; r++) {
			System.out.println(Arrays.toString(arr[r]));
			System.out.println(arr[r][2]);
		}

	}

}
