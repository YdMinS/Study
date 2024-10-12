package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon11557 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, max;
    static String univ;

    public static void main(String[] args) throws IOException{
        input();
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            max = -1;
            int caseNum = Integer.parseInt(br.readLine());
            for(int j=0; j<caseNum; j++){
                st = new StringTokenizer(br.readLine());
                String currentUni = st.nextToken();
                int currentAGage = Integer.parseInt(st.nextToken());
                if(currentAGage>max) {
                    max = currentAGage;
                    univ = currentUni;
                }
            }
            bw.write(univ+"\n");
        }
        br.close();
    }
}
