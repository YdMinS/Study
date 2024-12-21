package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon13333 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list, Collections.reverseOrder());
        int qIndex = 0;
        for(int i=0; i<N; i++){
            if(list.get(i) >= i+1){
                qIndex = i+1;
            } else {
                break;
            }
        }
        System.out.println(qIndex);
    }
}
