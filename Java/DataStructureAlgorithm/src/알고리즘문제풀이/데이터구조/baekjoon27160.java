package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon27160 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> fruitsMap = new HashMap();
        {
            fruitsMap.put("STRAWBERRY", 0);
            fruitsMap.put("BANANA", 1);
            fruitsMap.put("LIME", 2);
            fruitsMap.put("PLUM", 3);
        }
        int[] fruitsNum = new int[4];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int fruitNum = Integer.parseInt(st.nextToken());
            int fruitIndex = fruitsMap.get(fruit);
            fruitsNum[fruitIndex] += fruitNum;
        }
        for(int num : fruitsNum){
            if(num == 5){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
