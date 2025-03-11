package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon15351 {
    private static final String PERFECT_LIFE = "PERFECT LIFE";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String activity = br.readLine();
            int lifeScore = calculateLifeScore(activity);
            bw.write(lifeScore==100 ?PERFECT_LIFE : String.valueOf(lifeScore));
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static int calculateLifeScore(String activity) {
        int score = 0;
        for(int i=0; i<activity.length(); i++){
            char ch = activity.charAt(i);
            if(ch==' ') continue;
            score += activity.charAt(i) - 'A' + 1;
        }
        return score;
    }
}
