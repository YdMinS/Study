package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = readNum(st.nextToken());
        int num2 = readNum(st.nextToken());
        System.out.println(num1>num2 ? num1 : num2);
    }

    private static int readNum(String str){
        int result;
        Stack<Character> stack = new Stack();
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            stack.add(str.charAt(i));
        }
        while(!stack.isEmpty()){
            strBuilder.append(stack.pop());
        }
        result = Integer.parseInt(strBuilder.toString());
        return result;
    }
}
