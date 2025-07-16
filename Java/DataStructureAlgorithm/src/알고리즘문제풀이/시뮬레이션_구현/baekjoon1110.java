package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;

public class baekjoon1110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        if(inputStr.length()==1) inputStr = "0"+inputStr;
        String nextStr = inputStr;
        int cycle = 0;
        do {
            nextStr = parseNextStr(nextStr);
            cycle++;
        } while (!nextStr.equals(inputStr));
        System.out.println(cycle);
    }

    private static String parseNextStr(String str){
        int front = Character.getNumericValue(str.charAt(0));
        int back = Character.getNumericValue(str.charAt(1));
        int sum = front + back;
        return back + "" + sum % 10;
    }
}
