package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon4597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while(!(str = br.readLine()).equals("#")){
            char parity = str.charAt(str.length()-1);
            int numOfOne = 0;
            for(int i=0; i<str.length()-1; i++){
                char ch = str.charAt(i);
                if(ch=='1') numOfOne++;
            }
            bw.write(str.substring(0,str.length()-1));
            if(numOfOne%2==0 && parity == 'e' || numOfOne%2==1 && parity == 'o'){
                bw.write("0");
            } else {
                bw.write("1");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
