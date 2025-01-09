package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuilder = new StringBuilder();
        int cnt = 0;
        for(int i=1; i<=5; i++){
            String str = br.readLine().toUpperCase();
            if (str.contains("FBI")) {
                if(cnt!=0){
                    strBuilder.append(" ");
                }
                cnt++;
                strBuilder.append(i);
            }
        }
        String str = strBuilder.toString();
        System.out.println(str.length()==0 ? "HE GOT AWAY!" : str);
    }
}
