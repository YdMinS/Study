package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon12813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String A = br.readLine();
        String B = br.readLine();
        bw.write(and(A, B)+"\n");
        bw.write(or(A, B)+"\n");
        bw.write(nor(A, B)+"\n");
        bw.write(not(A)+"\n");
        bw.write(not(B)+"\n");
        bw.close();
    }

    private static String and(String a, String b){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            char chA = a.charAt(i);
            char chB = b.charAt(i);
            stringBuilder.append(chA == '1' && chB == '1' ? "1" : "0");
        }
        return stringBuilder.toString();
    }

    private static String or(String a, String b){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            char chA = a.charAt(i);
            char chB = b.charAt(i);
            stringBuilder.append(chA == '1' || chB == '1' ? "1" : "0");
        }
        return stringBuilder.toString();
    }

    private static String nor(String a, String b){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            char chA = a.charAt(i);
            char chB = b.charAt(i);
            stringBuilder.append((chA == chB) ? "0" : "1");
        }
        return stringBuilder.toString();
    }

    private static String not(String a){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            stringBuilder.append(ch=='0' ? "1" : "0");
        }
        return stringBuilder.toString();
    }
}
