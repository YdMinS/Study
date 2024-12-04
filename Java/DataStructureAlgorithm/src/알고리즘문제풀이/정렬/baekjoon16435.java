package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon16435 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        for (Integer n : list) {
            if(L>=n){
                L++;
            } else{
                break;
            }
        }
        System.out.println(L);
    }
}
