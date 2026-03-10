package SWEA_1231;

import java.io.*;
import java.util.*;

public class Solution {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    // 트리 문자 저장
    static char[] tree;

    public static void main(String[] args) throws Exception {
        for (int tc = 1; tc <= 10; tc++) {
            // 노드 개수 입력
            int N = Integer.parseInt(br.readLine());

            // 노드 번호가 1부터 시작하기 때문에 N+1 크기로 생성
            tree = new char[N + 1];

            // 각 노드 정보 입력
            for (int i = 0; i < N; i++) {

                // 한 줄 입력 예시 : 1 W 2 3
                st = new StringTokenizer(br.readLine());

                // 노드 번호
                int node = Integer.parseInt(st.nextToken());
                // 노드에 들어있는 문자
                // nextToken() → "W"
                // charAt(0) → 'W'
                char word = st.nextToken().charAt(0);
                // tree 배열에 문자 저장
                tree[node] = word;
            }

            System.out.print("#" + tc + " ");
            inorder(1);
            System.out.println();

        }
    }
    // 중위순회 함수
    // 순서 : 왼쪽 → 현재 노드 → 오른쪽
    static void inorder(int node) {
        // 배열 범위를 벗어나면 더 이상 탐색하지 않음 (재귀 종료 조건)
        if (node >= tree.length) return;
        // 왼쪽 자식
        // 완전이진트리에서 왼쪽 자식 = node * 2
        inorder(node * 2);
        // 현재 노드 출력
        System.out.print(tree[node]);
        // 오른쪽 자식
        // 완전이진트리에서 오른쪽 자식 = node * 2 + 1
        inorder(node * 2 + 1);
    }
}