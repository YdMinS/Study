package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon14729 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Float> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            list.add(Float.parseFloat(br.readLine()));
        }
        Collections.sort(list);
        for(int i=0; i<7; i++){
            bw.write(String.format("%.3f\n", list.get(i)));
        }
        bw.flush();
        bw.close();
    }
}
