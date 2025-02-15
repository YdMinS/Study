package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon5218 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            bw.write("Distances: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            for(int j=0; j<str1.length(); j++){
                char ch1 = str1.charAt(j);
                char ch2 = str2.charAt(j);
                bw.write(ch2>=ch1 ? ch2-ch1+"" : 26+ch2-ch1+"");
                bw.write(j<str1.length()-1 ? " " : "\n");
            }
        }
        bw.close();
    }
}
