package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon13420 {
    private static final String CORRECT = "correct";
    private static final String INCORRECT = "wrong answer";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            String operator = st.nextToken();
            long B = Long.parseLong(st.nextToken());
            st.nextToken();
            long result = Long.parseLong(st.nextToken());
            bw.write(check(A, B, operator, result) ? CORRECT : INCORRECT);
            if(i<N-1) bw.write("\n");
        }
        bw.close();
    }

    private static boolean check(long a, long b, String operator, long result){
        switch (operator) {
            case "+" :
                return a + b == result;
            case "-" :
                return a - b == result;
            case "*" :
                return a * b == result;
            case "/" :
                return a / b == result;
            default :
                return false;
        }
    }
}
