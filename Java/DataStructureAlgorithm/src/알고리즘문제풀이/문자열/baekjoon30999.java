package 알고리즘문제풀이.문자열;

import java.io.*;
import java.util.*;

public class baekjoon30999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken())/2+1;
        int approved = 0;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            int cnt = 0;
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                if(ch == 'O'){
                    cnt++;
                }
            }
            if(cnt >= M) approved++;
        }
        System.out.println(approved);
    }
}
