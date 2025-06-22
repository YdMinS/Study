package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon16208 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList();
        int length = 0;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            length += num;
            list.add(num);
        }
        Collections.sort(list, Collections.reverseOrder());
        int score = 0;
        for(int i=0; i<N-1; i++){
            int num = list.get(i);
            length -= num;
            score += num * length;
        }
        System.out.println(score);
    }
}
