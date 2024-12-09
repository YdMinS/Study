package 알고리즘문제풀이.그리디;

import java.util.*;
import java.io.*;

public class baekjoon15786 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int postItNum = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        int index = 0;
        for(int i=0; i<postItNum; i++){
            String currentPostIt = br.readLine();
            boolean isRight = false;
            for(int j=0; j<currentPostIt.length(); j++){
                char c = currentPostIt.charAt(j);
                if(c==str.charAt(index)){
                    index++;
                    if(index==N){
                        isRight = true;
                        break;
                    }
                }
            }
            index = 0;
            bw.write(isRight ? "true\n" : "false\n");
        }
        bw.flush();
        bw.close();
    }
}
