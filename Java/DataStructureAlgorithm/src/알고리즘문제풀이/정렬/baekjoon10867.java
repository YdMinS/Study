package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon10867 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(!list.contains(num)){
                list.add(num);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
            if(i+1!=list.size()){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
