package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon25630 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String st = br.readLine();
        int numOfMagic = 0;
        for(int i=0; i<N/2; i++){
            char frontCh = st.charAt(i);
            char backCh = st.charAt(N-1-i);
            if(frontCh != backCh) numOfMagic++;
        }
        System.out.println(numOfMagic);
    }
}
