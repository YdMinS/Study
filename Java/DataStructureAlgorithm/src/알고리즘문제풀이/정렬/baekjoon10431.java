package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon10431 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            List<Integer> list = new LinkedList<>();
            for(int j=0; j<20; j++){
                int currentN = Integer.parseInt(st.nextToken());
                for(int k=0; k<=j; k++){
                    if(list.size()==0){
                        list.add(currentN);
                        continue;
                    }
                    if(k==j){
                        list.add(currentN);
                        continue;
                    }
                    int sortedN = list.get(k);
                    if(sortedN>currentN){
                        list.add(k, currentN);
                        cnt += j-k;
                        break;
                    }
                }
            }
            bw.write(String.format("%d %d\n", n, cnt));
        }
        bw.flush();
        bw.close();
    }
}
