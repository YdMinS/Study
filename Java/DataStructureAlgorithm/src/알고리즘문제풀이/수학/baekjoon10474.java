package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon10474 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input;
        while(isExecutable(input = br.readLine().split(" "))){
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int share = A / B;
            int rest = A % B;
            bw.write(String.format("%d %d / %d\n", share, rest, B));
        }
        bw.flush();
        bw.close();
    }

    private static boolean isExecutable(String[] input){
        for(String str : input){
            if(!str.equals("0")) return true;
        }
        return false;
    }
}
