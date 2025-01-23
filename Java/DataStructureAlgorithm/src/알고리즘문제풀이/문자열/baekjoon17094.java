package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon17094 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt2 = 0;
        int cntE = 0;
        String str = br.readLine();
        for(int i=0; i<N; i++){
            if(str.charAt(i) == '2'){
                cnt2++;
            } else {
                cntE++;
            }
        }
        System.out.println(cnt2==cntE ? "yee" : (cnt2>cntE ? "2" : "e"));
    }
}
