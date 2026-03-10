package SWEA_1954;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());

            int[][] arr = new int[N][N];

            int top = 0;
            int bottom = N - 1;
            int left = 0;
            int right = N - 1;
            int num = 1;

            while (top <= bottom && left <= right) {
                // right
                for (int c = left; c <= right; c++) {
                    arr[top][c] = num++;
                }
                top++;
                // down
                for (int r = top; r <= bottom; r++) {
                    arr[r][right] = num++;
                }
                right--;
                // left
                for (int c = right; c >= left; c--) {
                    arr[bottom][c] = num++;
                }
                bottom--;
                // up
                for (int r = bottom; r >= top; r--) {
                    arr[r][left] = num++;
                }
                left++;
            }

            System.out.println("#" + tc);

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
