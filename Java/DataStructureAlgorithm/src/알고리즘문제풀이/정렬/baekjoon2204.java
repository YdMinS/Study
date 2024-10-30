package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon2204 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        while(N!=0){
            String[] strArr = new String[N];
            for(int i=0; i<N; i++){
                strArr[i] = br.readLine();
            }
            Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
            bw.write(strArr[0]+"\n");
            N = Integer.parseInt(br.readLine());
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
