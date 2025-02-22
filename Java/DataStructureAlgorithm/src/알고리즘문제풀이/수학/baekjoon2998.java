package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon2998 {
    public static void main(String[] args) throws IOException{
        StringBuilder inputNum = new StringBuilder(input());
        StringBuilder result = new StringBuilder();
        for(int i=0; i<inputNum.length()/3; i++){
            String num = inputNum.substring(i*3,(i+1)*3);
            result.append(convertNum(num));
        }
        System.out.println(result);
    }

    private static String input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = br.readLine();
        if(inputNum.length()%3!=0){
            int numOfZero = 3-inputNum.length()%3;
            return "0".repeat(numOfZero) + inputNum;
        } else {
            return inputNum;
        }
    }

    private static String convertNum(String num){
        int binaryNumber = Integer.parseInt(num, 2);
        return Integer.toString(binaryNumber);
    }
}
