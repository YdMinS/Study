package 알고리즘문제풀이.데이터구조;

import java.io.*;
import java.util.*;

public class baekjoon17608 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int highestH = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
            stack.add(Integer.parseInt(br.readLine()));
        }
        while(!stack.isEmpty()){
            int height = stack.pop();
            if(highestH<height){
                highestH = height;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
