package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon11575 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                int ex = (a * (ch - 'A') + b) % 26;
                bw.write((char)(ex + 'A'));
            }
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
