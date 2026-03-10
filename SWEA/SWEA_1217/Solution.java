package SWEA.power_1217;

import java.util.Scanner;

public class Solution {

    static int pow(int N, int M) {
        // 종료 조건
        if (M == 0)
            return 1;

        return N * pow(N, M - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            sc.nextInt();

            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println("#" + tc + " " + pow(N, M));
        }

    }
}
