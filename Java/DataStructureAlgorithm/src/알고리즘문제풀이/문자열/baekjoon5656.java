package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon5656 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = 1;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            String operator = st.nextToken();
            if(operator.equals("E")) break;
            int B = Integer.parseInt(st.nextToken());
            bw.write(String.format("Case %d: %b\n", i++, compare(A, B, operator)));
        }
        bw.flush();
        bw.close();
    }

    private static boolean compare(int A, int B, String operator){
        switch (operator){
            case "<=":
                return A <= B;
            case ">=":
                return A >= B;
            case "==":
                return A == B;
            case "<":
                return A < B;
            case ">":
                return A > B;
            case "!=":
                return A != B;
        }
        return true;
    }
}
