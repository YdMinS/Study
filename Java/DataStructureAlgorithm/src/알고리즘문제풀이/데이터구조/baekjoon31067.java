package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon31067 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int prevTrack = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for(int i=1; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num<=prevTrack){
                num += K;
                cnt++;
            }
            if(num>prevTrack){
                prevTrack = num;
            } else {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(cnt);
    }
}
