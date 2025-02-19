package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon2386 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while(!(str = br.readLine()).equals("#")){
            char CH = str.charAt(0);
            int cnt = 0;
            for(int i=1; i<str.length(); i++){
                char ch = Character.toLowerCase(str.charAt(i));
                if(ch == CH) cnt++;
            }
            bw.write(CH+" "+cnt+"\n");
        }
        bw.close();
    }
}
