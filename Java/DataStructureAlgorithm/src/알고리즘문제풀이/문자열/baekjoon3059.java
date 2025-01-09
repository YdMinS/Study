package 알고리즘문제풀이.문자열;

import java.io.*;
import java.util.*;

public class baekjoon3059 {
    static final int TOTAL_SCORE = (26 * ('A' + 'Z')) /2;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            for (int i = 0; i < N; i++) {
                int score = TOTAL_SCORE;
                Set<Character> charSet = new HashSet<>();
                String str = br.readLine();
                for (char ch : str.toCharArray()) {
                    if (charSet.add(ch)) {
                        score -= ch;
                    }
                }
                bw.write(score + "\n");
            }
        }
    }
}
