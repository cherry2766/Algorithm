package SWEA_11315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            char[][] arr = new char[N][N];
            boolean result = false;

            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            int[] dr = {0, 1, 1, -1};
            int[] dc = {1, 0, 1, 1};

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (arr[r][c] == 'o') {

                        for (int d = 0; d < 4; d++) {
                            int cnt = 1;
                            int nr = r;
                            int nc = c;

                            for (int i = 0; i < 5; i++) {
                                nr += dr[d];
                                nc += dc[d];

                                if (nr < 0 || nr >= N || nc < 0 || nc >= N) break;
                                if (arr[nr][nc] != 'o') break;

                                cnt++;
                            }
                            if (cnt >= 5) {
                                result = true;
                                break;
                            }
                        }
                    }
                    if (result) break;
                }
                if (result) break;
            }
            if (result) {
                System.out.println("#" + tc + " " + "YES");
            } else {
                System.out.println("#" + tc + " " + "NO");
            }

        }
    }
}
