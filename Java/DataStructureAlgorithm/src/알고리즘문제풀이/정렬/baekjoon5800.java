package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon5800 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            bw.write(String.format("Class %d\n", i));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int gap = 0;
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++){
                int num = Integer.parseInt(st.nextToken());
                list.add(num);
                max = Math.max(num, max);
                min = Math.min(num, min);
            }
            Collections.sort(list);
            for(int j=0; j<n-1; j++){
                int currentGap = Math.abs(list.get(j)-list.get(j+1));
                gap = Math.max(gap,currentGap);
            }
            bw.write(String.format("Max %d, Min %d, Largest gap %d\n", max, min, gap));
        }
        bw.flush();
        bw.close();
    }
}
