package 알고리즘문제풀이.문자열;

import java.io.*;
import java.lang.*;

public class baekjoon1541 {
    static int result = 0;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(result);
    }

    static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int minusNum = 0;
        int tempNum = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                sb.append(str.charAt(i));
                continue;
            }
            if(str.charAt(i)=='+'){
                if(minusNum == 0) {
                    result += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                } else {
                    tempNum += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            } else if(str.charAt(i)=='-'){
                if(minusNum == 0){
                    minusNum = -1;
                    result += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                } else {
                    tempNum += Integer.parseInt(sb.toString());
                    result += minusNum * tempNum;
                    tempNum = 0;
                    sb.setLength(0);
                }
            }
        }
        if(minusNum == 0){
            result += Integer.parseInt(sb.toString());
        } else {
            tempNum += Integer.parseInt(sb.toString());
            result += tempNum * minusNum;
        }
    }
}
