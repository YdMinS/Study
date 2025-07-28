package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon1373 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = br.readLine();

        int padding = 3 - inputNum.length() % 3;
        if (padding != 3) {
            inputNum = "0".repeat(padding) + inputNum;
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<inputNum.length(); i+=3) {
            String chunk = inputNum.substring(i, i+3);
            int octalNum = Integer.parseInt(chunk, 2);
            sb.append(octalNum);
        }

        System.out.println(sb.toString().replaceFirst("^0+(?!$)", ""));
    }
}
