package Bronze.BOJ_14681;

import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x > 0 && y > 0) {
            System.out.println("1");
        }else if(x < 0 && y > 0) {
            System.out.println("2");
        }else if(x < 0 && y < 0) {
            System.out.println("3");
        }else if(x > 0 && y < 0){
            System.out.println("4");
        }

    }
}