package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon1292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int index = 0;
        List<Integer> intList = new ArrayList<>();
        for (int i=1; i<=1000; i++) {
            for(int j=0; j<i; j++){
                intList.add(i);
                index++;
                if(index == B) break;
            }
        }
        int result = 0;
        for (int i=A-1; i<=B-1; i++) {
            result += intList.get(i);
        }
        System.out.println(result);
    }
}
