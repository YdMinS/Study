package 알고리즘문제풀이.문자열;

import java.io.*;
import java.util.*;

public class baekjoon31428 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String ref = br.readLine();
        int cnt = 0;
        for(int i=0; i<N; i++){
            if(ref.equals(st.nextToken())){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
