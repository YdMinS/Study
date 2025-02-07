package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon2902 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuilder = new StringBuilder();
        String[] strArr = br.readLine().split("-");
        for(int i=0; i< strArr.length; i++){
            strBuilder.append(strArr[i].charAt(0));
        }
        System.out.println(strBuilder);
    }
}
