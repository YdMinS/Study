package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon30501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                if(ch == 'S'){
                    System.out.println(str);
                    return;
                }
            }
        }
    }
}
