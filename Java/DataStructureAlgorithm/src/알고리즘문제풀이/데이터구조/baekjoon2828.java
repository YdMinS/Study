package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon2828 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(br.readLine());
        int cnt = 0;
        List<Integer> screen = new ArrayList<>();
        for(int i=0; i<M; i++){
            screen.add(i);
        }
        for(int i=0; i<J; i++){
            int nextLocation = Integer.parseInt(br.readLine())-1;
            int minIndex = -1;
            int minDistance = Integer.MAX_VALUE;
            for(int j=0; j<screen.size(); j++){
                int location = screen.get(j);
                int distance = Math.abs(nextLocation-location);
                if(distance<minDistance){
                    minDistance = distance;
                    minIndex = j;
                }
                if(distance == 0) break;
            }
            if(minDistance==0) continue;
            if(minIndex!=-1){
                screen.remove(minIndex);
                screen.add(minIndex, nextLocation);
                cnt += minDistance;
            }
        }
        System.out.println(cnt);
    }
}
