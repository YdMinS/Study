package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon4740 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while(!(str = br.readLine()).equals("***")){
            bw.write(new StringBuilder(str).reverse()+"\n");
        }
        bw.close();
    }
}
