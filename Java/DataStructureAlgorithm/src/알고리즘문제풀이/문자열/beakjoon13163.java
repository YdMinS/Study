package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class beakjoon13163 {
    static final String GOD_PREFIX = "god";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringBuilder strBuilder = new StringBuilder(GOD_PREFIX);
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            while(st.hasMoreTokens()){
                strBuilder.append(st.nextToken());
            }
            bw.write(strBuilder+"\n");
        }
        bw.close();
    }
}
