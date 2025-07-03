package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon4435 {
    private static final String E_TRIUMPH = "Battle %d: Evil eradicates all trace of Good";
    private static final String G_TRIUMPH = "Battle %d: Good triumphs over Evil";
    private static final String NONE_TRIUMPH = "Battle %d: No victor on this battle field";

    private static final int[] gScore = new int[]{1, 2, 3, 3, 4, 10};
    private static final int[] eScore = new int[]{1, 2, 2, 2, 3, 5, 10};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            int scoreG = calculateGScore(new StringTokenizer(br.readLine()));
            int scoreE = calculateEScore(new StringTokenizer(br.readLine()));
            bw.write(scoreG == scoreE ?
                String.format(NONE_TRIUMPH, i) :
                    (scoreG > scoreE) ?
                            String.format(G_TRIUMPH, i) :
                            String.format(E_TRIUMPH, i)
            );
            if(i<N) bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static int calculateGScore(StringTokenizer st){
        int score = 0;
        for (int j : gScore) {
            score += Integer.parseInt(st.nextToken()) * j;
        }
        return score;
    }

    private static int calculateEScore(StringTokenizer st){
        int score = 0;
        for (int j : eScore) {
            score += Integer.parseInt(st.nextToken()) * j;
        }
        return score;
    }
}
