package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon21734 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            int chInt = ch;
            int num = 0;
            while(chInt!=0){
                num += chInt%10;
                chInt = chInt / 10;
            }
            for(int j=0; j<num; j++){
                bw.write(ch);
            }
            if(i<S.length()-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
