package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon3062 {
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringBuilder str = new StringBuilder(br.readLine());
            int num1 = Integer.parseInt(str.toString());
            int num2 = Integer.parseInt(str.reverse().toString());
            StringBuilder strNum = new StringBuilder(num1+num2+"");
            String calculatedNum = strNum.toString();
            String calculatedNum2 = strNum.reverse().toString();
            bw.write(calculatedNum.equals(calculatedNum2) ? YES : NO);
            bw.write(i<N-1 ? "\n" : "");
        }
        bw.close();
    }
}
