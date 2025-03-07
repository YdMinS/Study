package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon31496 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String S = st.nextToken();
        int result = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String[] sArr = st.nextToken().split("_");
            for(String s : sArr){
                if(s.equals(S)) {
                    result += Integer.parseInt(st.nextToken());
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
