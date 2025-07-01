package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon4388 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] numInput = br.readLine().split(" ");
        while(!numInput[0].equals("0") || !numInput[1].equals("0")){
            int totalCarry = 0;
            String A = numInput[0];
            String B = numInput[1];
            int carry = 0;
            for(int i=0; i<Math.max(A.length(), B.length()); i++){
                int a = i<A.length() ? Character.getNumericValue(A.charAt(A.length()-1-i)) : 0;
                int b = i<B.length() ? Character.getNumericValue(B.charAt(B.length()-1-i)) : 0;
                if (a+b+carry >= 10) {
                    carry = 1;
                    totalCarry++;
                } else {
                    carry = 0;
                }
            }
            bw.write(totalCarry+"\n");
            numInput = br.readLine().split(" ");
        }
        bw.flush();
        bw.close();
    }
}
