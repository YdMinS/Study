package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon6321 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            bw.write(String.format("String #%d\n", i));
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                char ch = (char)(str.charAt(j)+1);
                bw.write(ch != (char)('Z'+1) ? ch : 'A');
            }
            if(i!=N) {
                bw.write("\n\n");
            }
        }
        bw.close();
    }
}
