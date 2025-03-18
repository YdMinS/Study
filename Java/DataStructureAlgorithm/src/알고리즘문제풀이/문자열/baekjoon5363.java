package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon5363 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String sentence = br.readLine();
            int firstIndex = sentence.indexOf(" ");
            int secondIndex = sentence.indexOf(" ", firstIndex + 1);
            bw.write(sentence.substring(secondIndex+1));
            bw.write(" "+sentence.substring(0,secondIndex));
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
