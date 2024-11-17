package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon16466 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        for(int i=1; i<=Integer.MAX_VALUE; i++){
            if(!set.contains(i)){
                System.out.println(i);
                break;
            }
        }
    }
}
