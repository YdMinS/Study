package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> clammern;
        String str = br.readLine();
        while(!str.equals(".")){
            clammern = new Stack();
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch=='(' || ch=='['){
                    clammern.push(ch);
                    continue;
                }
                if(ch == ')'){
                    if(!clammern.isEmpty() && clammern.peek()=='(') {
                        clammern.pop();
                        continue;
                    } else {
                        clammern.push(ch);
                        break;
                    }
                }
                if(ch == ']'){
                    if(!clammern.isEmpty() && clammern.peek()=='['){
                        clammern.pop();
                    } else {
                        clammern.push(ch);
                        break;
                    }
                }
                if(ch == '.'){
                    break;
                }
            }
            if(clammern.isEmpty()){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            str = br.readLine();
        }
    }
}
