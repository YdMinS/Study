package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon18110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        if(N==0) {
            System.out.println(N);
            return;
        }
        int outNum = (int)Math.round(N*0.15);
        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int i=outNum; i<N-outNum; i++){
            sum += list.get(i);
        }
        System.out.println((int)Math.round((double)sum/(N-outNum*2)));
    }
}
