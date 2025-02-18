package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon11816 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = br.readLine();
        int result;
        if(inputNum.substring(0,1).equals("0") && !inputNum.substring(1,2).equals("x")){
            String octalNum = inputNum.substring(1);
            result = Integer.parseInt(octalNum, 8);
        } else if (inputNum.substring(0,2).equals("0x")) {
            String hexNum = inputNum.substring(2);
            result = Integer.parseInt(hexNum, 16);
        } else {
            result = Integer.parseInt(inputNum);
        }
        System.out.println(result);
    }
}
