package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon9506 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        while(a != -1){
            int sum = 1;
            Deque<Integer> dq = new LinkedList<>();
            dq.add(1);
            for(int i=2; i<a; i++){
                if(a%i==0){
                    dq.add(i);
                    sum+=i;
                }
            }
            if(sum == a){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a+" =");
                while(!dq.isEmpty()){
                    stringBuilder.append(" "+dq.pop());
                    if(!dq.isEmpty()){
                        stringBuilder.append(" +");
                    }
                }
                System.out.println(stringBuilder);
            } else {
                System.out.println(a+" is NOT perfect.");
            }
            a = Integer.parseInt(br.readLine());
        }
    }
}
