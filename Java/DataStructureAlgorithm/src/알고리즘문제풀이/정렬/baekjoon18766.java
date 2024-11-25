package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon18766 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int l = Integer.parseInt(br.readLine());
            String[] ref = new String[l];
            String[] com = new String[l];
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j=0; j<l; j++){
                ref[j] = st1.nextToken();
                com[j] = st2.nextToken();
            }
            Arrays.sort(ref);
            Arrays.sort(com);
            if(Arrays.equals(ref, com)){
                bw.write("NOT ");
            }
            bw.write("CHEATER\n");
        }
        bw.flush();
        bw.close();
    }
}
