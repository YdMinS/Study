package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon26068 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            int restDay = Integer.parseInt(str.substring(2));
            if(restDay <= 90){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
