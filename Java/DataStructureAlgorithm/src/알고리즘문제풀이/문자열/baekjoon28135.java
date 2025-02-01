package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon28135 {
    static final int FIFTY = 50;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=1; i<=N; i++){
            cnt++;
            if(i==N){
                System.out.println(cnt);
                return;
            }
            if(containsFifty(i)){
                cnt++;
            }
        }
    }

    private static boolean containsFifty(int n){
        int num = n;
        while(num>=10){
            int comparand = num%100;
            if(comparand == FIFTY){
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
