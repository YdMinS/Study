package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon3778 {
    private static final String CASE_FORMAT = "Case #%d: %d";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            String myName = br.readLine();
            String yourName = br.readLine();
//            bw.write(String.format(CASE_FORMAT, i, findAnagram(myName, yourName)));
        }
    }
    
//    private static int findAnagram(String myName, String yourName){
//        int myPointer = 0;
//        int yourPointer = yourName.length()-1;
//        while(myPointer!=myName.length()-1 && yourPointer!=0){
//            char ch1 = myName.charAt(myPointer);
//            char
//        }
//    }
}
