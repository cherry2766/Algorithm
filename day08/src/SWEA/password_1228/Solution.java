package SWEA.password_1228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            // 원본 암호문의 길이
            int N = Integer.parseInt(br.readLine());

            List<Integer> list = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                list.add(Integer.valueOf(st.nextToken()));
            }
            // 명령어의 개수
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                st.nextToken();
                int idx = Integer.parseInt(st.nextToken());
                int K = Integer.parseInt(st.nextToken());
                for (int j = 0; j < K; j++) {
                    list.add(idx + j, Integer.valueOf(st.nextToken()));
                }
            }

            System.out.print("#" + tc + " ");
            for (int i = 0; i < 10; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
