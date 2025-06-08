package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon1703 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a;
        while((a = Integer.parseInt(st.nextToken()))!=0){
            int leafNum = 1;
            for(int i=0; i<a; i++){
                int factor = Integer.parseInt(st.nextToken());
                int prune = Integer.parseInt(st.nextToken());
                leafNum = leafNum * factor - prune;
            }
            bw.write(leafNum+"\n");
            st = new StringTokenizer(br.readLine());
        }
        bw.flush();
        bw.close();
    }
}
