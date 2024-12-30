package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon2605 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new LinkedList();
        for(int i=1; i<=N; i++){
            int num = Integer.parseInt(st.nextToken());
            list.add(list.size()-num, i);
        }
        for(int i=0; i<N; i++){
            bw.write(list.get(i)+"");
            if(i<N-1){
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
