package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon11098 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            bw.write(findPlayer());
            if(i<N-1){
                bw.write("\n");
            }
        }
        bw.close();
    }

    private static String findPlayer() throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int bestPrice = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            String player = st.nextToken();
            if(price > bestPrice){
                bestPrice = price;
                stringBuilder.setLength(0);
                stringBuilder.append(player);
            }
        }
        return stringBuilder.toString();
    }
}
