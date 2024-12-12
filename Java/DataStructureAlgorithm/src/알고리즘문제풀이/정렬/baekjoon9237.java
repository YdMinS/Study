package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon9237 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list, Collections.reverseOrder());
        int globalTime = 1;
        int requiredTime = 0;
        for(int i=0; i<N; i++){
            globalTime++;
            int currentRequiredTime = list.get(i);
            requiredTime--;
            if(currentRequiredTime>requiredTime){
                requiredTime = currentRequiredTime;
            }

        }
        if(requiredTime==0){
            System.out.println(globalTime);
        } else {
            globalTime+= requiredTime;
            System.out.println(globalTime);
        }
    }
}
