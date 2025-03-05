package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon32401 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cnt = 0;
        char current = 'Z';
        for(int i=0; i<N; i++){
            char ch = str.charAt(i);
            if(ch=='A'){
                if(current=='N') {
                    cnt++;
                }
                current='A';
            } else if (ch=='N'){
                if(current=='A') {
                    current = 'N';
                } else if (current=='N'){
                    current = 'Z';
                }
            }
        }
        System.out.println(cnt);
    }
}
