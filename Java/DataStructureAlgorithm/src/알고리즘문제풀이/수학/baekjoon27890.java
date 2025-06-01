package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon27890 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int xt0 = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int pX = xt0;
        int nX = xt0;
        for(int i=0; i<N; i++){
            if(pX%2==0){
                nX = pX/2 ^ 6;
            } else {
                nX = pX*2 ^ 6;
            }
            pX = nX;
        }
        System.out.print(nX);
    }
}
