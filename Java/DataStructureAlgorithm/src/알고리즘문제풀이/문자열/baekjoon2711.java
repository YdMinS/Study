package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon2711 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            bw.write(str.substring(0, index-1) + str.substring(index) + "\n");
        }
        bw.close();
    }
}
