package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon15688 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int i=0; i<N; i++){
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
