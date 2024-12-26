package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon31822 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().substring(0,5);
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<N; i++){
            String lecture = br.readLine().substring(0,5);
            if(lecture.equals(str)) cnt++;
        }
        System.out.println(cnt);
    }
}
