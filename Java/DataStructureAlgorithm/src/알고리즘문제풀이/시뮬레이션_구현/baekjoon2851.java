package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;

public class baekjoon2851 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = 0;
        for (int i=0; i<10; i++) {
            String input = br.readLine();
            int mushroom = Integer.parseInt(input);
            int dif1 = Math.abs(100 - score);
            int dif2 = Math.abs(100 - score - mushroom);
            if (dif2 <= dif1) {
                score += mushroom;
            } else {
                break;
            }
        }
        System.out.println(score);
    }
}
