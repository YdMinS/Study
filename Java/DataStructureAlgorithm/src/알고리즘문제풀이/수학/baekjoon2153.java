package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon2153 {
    private static final String RIGHT = "It is a prime word.";
    private static final String WRONG = "It is not a prime word.";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        int num = 0;
        for(int i=0; i<data.length(); i++){
            num += getNumber(data.charAt(i));
        }
        System.out.println(checkPrimeWord(num) ? RIGHT : WRONG);
    }

    private static int getNumber(char ch){
        if(ch>='a' && ch<='z'){
            return ch-'a'+1;
        } else {
            return ch-'A'+27;
        }
    }

    private static boolean checkPrimeWord(int num){
        if(num == 1) return true;
        boolean[] check = new boolean[num+1];
        for(int i=2; i<=num; i++){
            if(check[i]) continue;
            for(int j=i*2; j<=num; j+=j){
                check[j] = true;
            }
            if(check[num]) return false;
        }
        return true;
    }
}
