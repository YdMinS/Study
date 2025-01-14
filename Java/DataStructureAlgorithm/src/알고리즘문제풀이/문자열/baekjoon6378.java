package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon6378 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String strToNum;
        while(!(strToNum=br.readLine()).equals("0")){
            while(strToNum.length()>1){
                strToNum = calculateDigitalRoot(strToNum);
            }
            bw.write(strToNum+"\n");
        }
        br.close();
        bw.close();
    }

    private static String calculateDigitalRoot(String num){
        int result = 0;
        while(num.length()>0){
            result += Character.getNumericValue(num.charAt(num.length()-1));
            num  = num.substring(0, num.length()-1);
        }
        return result+"";
    }
}
