package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon13419 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.length()%2!=0) str += str;
            StringBuilder strBuilder1 = new StringBuilder();
            StringBuilder strBuilder2 = new StringBuilder();
            for(int j=0; j<str.length(); j++){
                if(j%2==0){
                    strBuilder1.append(str.charAt(j));
                } else {
                    strBuilder2.append(str.charAt(j));
                }
            }
            bw.write(strBuilder1.toString());
            bw.newLine();
            bw.write(strBuilder2.toString());
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
