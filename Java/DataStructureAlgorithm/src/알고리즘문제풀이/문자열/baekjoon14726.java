package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon14726 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String cardNumber = br.readLine();
            bw.write(isValidate(cardNumber));
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static String isValidate(String cardNumber){
        int sum = 0;
        for(int i=0; i<cardNumber.length(); i++){
            int index = cardNumber.length()-1-i;
            if(i%2==0){
                sum += cardNumber.charAt(index)-'0';
            } else {
                int num = (cardNumber.charAt(index)-'0') * 2;
                if(num>=10){
                    int tempNum = num;
                    num = tempNum/10 + tempNum%10;
                }
                sum += num;
            }
        }
        return sum%10==0 ? "T" : "F";
    }
}
