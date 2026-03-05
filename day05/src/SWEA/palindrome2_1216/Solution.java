package SWEA.palindrome2_1216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static char[][] arr = new char[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트케이스 시작
        for (int tc = 1; tc <= 10; tc++) {
            // 한 줄 버리기
            int T = Integer.parseInt(br.readLine());
            // 배열 채우기
            for (int r = 0; r < 100; r++) {
                arr[r] = br.readLine().toCharArray();
            }
            // 가로 탐색 후 가장 긴 회문 길이
            int rowMax = rowPalindrome();
            // 세로 탐색 후 가장 긴 회문 길이
            int colMax = colPalindrome();
            // 최대 길이 계산
            int ans = Math.max(rowMax, colMax);

            System.out.println("#" + T + " " + ans);

        }
    }

    public static int rowPalindrome() {
        // 회문 길이를 줄이면서 탐색 - 가장 긴 길이의 회문부터 찾으려고
        for (int len = 100; len >= 1; len--) {
            // 행 고정
            for (int r = 0; r < 100; r++) {
                // 회문 시작 위치 - 길이가 len일 때 가능한 시작 위치
                for (int c = 0; c <= 100 - len; c++) {
                    boolean isPalindrome = true;
                    // 회문 검사 시작
                    for (int k = 0; k < len / 2; k++) {
                        // 회문이 아니면 반복 종료
                        if (arr[r][c + k] != arr[r][c + len - 1 - k]) {
                            isPalindrome = false;
                            break;
                        }
                    }
                    // 찾으면 길이 리턴, 길이가 긴값부터 찾았으니까 찾으면 그게 최대 길이임
                    if (isPalindrome) {
                        return len;
                    }
                }
            }
        }
        return 1;
    }

    public static int colPalindrome() {

        for (int len = 100; len >= 1; len--) {
            for (int c = 0; c < 100; c++) {
                for (int r = 0; r <= 100 - len; r++) {
                    boolean isPalindrome = true;
                    for (int k = 0; k < len / 2; k++) {
                        if (arr[r + k][c] != arr[r + len - 1 - k][c]) {
                            isPalindrome = false;
                            break;
                        }
                    }
                    if (isPalindrome) {
                        return len;
                    }
                }
            }
        }
        return 1;
    }
}
