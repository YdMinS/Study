package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon11005 {
    static HashMap<Integer, Character> ref = new HashMap();
    static {
        for(int i=0; i<=26; i++){
            Character ch = Character.valueOf((char)('A' + i));
            ref.put(10+i, ch);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder strBuilder = new StringBuilder();
        Stack<Character> stack = new Stack();
        int num = Integer.parseInt(st.nextToken());
        int digit = Integer.parseInt(st.nextToken());
        while(num!=0){
            int rest = num%digit;
            num /= digit;
            if(rest>9){
                char ch = ref.get(rest);
                stack.add(ch);
            } else {
                stack.add((char)('0'+rest));
            }
        }
        while(!stack.isEmpty()){
            strBuilder.append(stack.pop());
        }
        System.out.println(strBuilder);
    }
}
