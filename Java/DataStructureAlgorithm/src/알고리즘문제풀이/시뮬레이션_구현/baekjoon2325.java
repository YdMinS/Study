package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon2325 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            String stars = "*".repeat(i)+"\n";
            bw.write(stars);
            if(i!=N){
                stack.add(stars);
            }
        }
        while(!stack.isEmpty()){
            bw.write(stack.pop());
        }
        bw.flush();
        bw.close();
    }
}
