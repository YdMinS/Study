package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon2495 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while((str = br.readLine()) != null){
            int current = Character.getNumericValue(str.charAt(0));
            int max = 1;
            int currentMax = 1;
            for(int i=1; i<str.length(); i++){
                int num = Character.getNumericValue(str.charAt(i));
                if(num == current){
                    currentMax++;
                    max = Math.max(max, currentMax);
                } else {
                    currentMax = 1;
                }
                current = num;
            }
            bw.write(max+"\n");
        }
        bw.close();
    }
}
