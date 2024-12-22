package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon25640 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ref = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(ref.equals(str)) cnt++;
        }
        System.out.println(cnt);
    }
}
