package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon12605 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           Stack<String> stack = new Stack();
           bw.write(String.format("Case #%d:", i));
           while(st.hasMoreTokens()) {
               stack.push(st.nextToken());
           }
           while(!stack.isEmpty()){
               bw.write(" "+stack.pop());
           }
           bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
