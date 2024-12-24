package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon27310 {
    public static void main(String[] arsg) throws IOException{
        String emogy = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int colonNum = 0;
        int udBarNum = 0;
        for(int i=0; i<emogy.length(); i++){
            char c = emogy.charAt(i);
            if(c==':'){
                colonNum++;
            } else if (c=='_'){
                udBarNum++;
            }
        }
        int level = emogy.length() + colonNum + udBarNum * 5;
        System.out.println(level);
    }
}
