package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;

public class baekjoon2522 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack();
        for(int i=1; i<=N; i++){
            int blank = N-i;
            String str = " ".repeat(blank) + "*".repeat(i) + "\n";
            bw.write(str);
            if(blank!=0){
                stack.add(str);
            }
        }
        while(!stack.isEmpty()){
            bw.write(stack.pop());
        }
        bw.flush();
        bw.close();
    }
}
