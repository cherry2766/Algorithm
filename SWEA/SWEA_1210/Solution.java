package SWEA_1210;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = 10;

        for (int tc = 1; tc <= T; tc++) {
            int testCase = Integer.parseInt(br.readLine());
            int[][] arr = new int[100][100];

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int x = 99;
            int y = 0;

            for (int i = 0; i < 100; i++) {
                if (arr[x][i] == 2) {
                    y = i;
                    break;
                }
            }

            while (x != 0) {
                // right
                if (y + 1 < 100 && arr[x][y + 1] == 1) {
                    while (y + 1 < 100 && arr[x][y + 1] == 1) {
                        y++;
                    }
                    // left
                } else if (y - 1 >= 0 && arr[x][y - 1] == 1) {
                    while (y - 1 >= 0 && arr[x][y - 1] == 1) {
                        y--;
                    }
                }

                x--;
            }
            System.out.println("#" + testCase + " " + y);
        }
    }

}
