package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon14915 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder strBuilder = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if(N==0){
            System.out.print("0");
            return;
        }
        Stack<Character> stack = new Stack<>();
        int restN = N;
        while(restN>0){
            int rest = restN%M;
            if(rest >=10){
                stack.add((char)(rest-10+'A'));
            } else {
                stack.add((char)(rest+'0'));
            }
            restN /= M;
        }
        while(!stack.isEmpty()){
            strBuilder.append(stack.pop());
        }
        System.out.print(strBuilder);
    }
}
