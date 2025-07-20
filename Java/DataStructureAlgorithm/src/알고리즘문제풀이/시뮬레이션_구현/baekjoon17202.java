package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon17202 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String num2 = br.readLine();
        String testNum = parseTestNum(num1, num2);
        System.out.println(calculateGungHab(testNum));
    }

    private static String parseTestNum(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<8; i++) {
            sb.append(num1.charAt(i));
            sb.append(num2.charAt(i));
        }
        return sb.toString();
    }

    private static String calculateGungHab(String testNum){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<testNum.length(); i++){
            q.add(Character.getNumericValue(testNum.charAt(i)));
        }
        while(q.size() > 2){
            for(int i=0; i<q.size()-1; i++) {
                int a = q.poll();
                int b = q.peek();
                q.add((a + b)%10);
            }
            q.poll();
        }
        return ""+q.poll()+q.poll();
    }
}
