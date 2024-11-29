package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon11728 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] num = new int[]{A, B};
        List<Integer> list = new ArrayList();
        for(int n : num){
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<A+B; i++){
            sb.append(list.get(i));
            if(i!=A+B-1){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
