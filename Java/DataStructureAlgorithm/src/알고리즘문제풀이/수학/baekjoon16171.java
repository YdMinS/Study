package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon16171 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine().replaceAll("[0-9]", "");
        String ref = br.readLine();
        System.out.println(inputStr.contains(ref) ? 1 : 0);
    }
}
