package SWEA.VerticalReading;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 테스트 케이스를 가져
		br.readLine();
		//배열 [i]로 인덱스 조회 
		
		// 그 다음줄에 있는 문자를 가져옴 
		// String에서는 charAt(i)
		br.readLine();
		// String -> charAt(i) -> char
		
 
		/*
		우리가 열 우선순위로 지금 탐색을 해야하는데..
		1. 과연 범위가 어디까지일까? -> while? 
			-> 입력을 받아오면서 최대 길이를 갱신 
			-> col 6까지고 row 5까지 보면 되겠
		2. 세로로 읽어야하는데..  열 우선순위
		 	-> 모든 행이 길이가 다른데... 나는 열 우선순위로 탐색해 
		 	-> 내가 지금 들어갈 자리가 비어있나 없나 검증
		 	-> words[r][c] x 
		 	-> if 내가 지금 보고 있는 행의 길이를 먼저 찾아내기 
		 	      4 인데, 3까지만 인덱스 접근이 가능하니깐 
		 	      열의 위치가 3 보다 크면 넘어가 continue
		/*
		  0 1 2 3 4 5
	    0 A A B C D D
		1 a f z z
		2 0 9 1 2 1
		3 a 8 E W g 6
		4 P 5 h 3 k x 
		*/
	
		
	}

}
