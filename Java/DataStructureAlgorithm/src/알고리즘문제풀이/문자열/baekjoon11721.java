package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;

public class baekjoon11721 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder st = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int length = str.length()%10==0 ? str.length()/10 : str.length()/10+1;
        for(int i=0; i<length; i++){
            String tempStr = str;
            if(i==length-1){
                st.append(tempStr.substring(0+10*i));
            } else {
                st.append(tempStr.substring(0 + 10 * i, 10 * (i + 1)) + "\n");
            }
        }
        System.out.println(st);
    }
}
