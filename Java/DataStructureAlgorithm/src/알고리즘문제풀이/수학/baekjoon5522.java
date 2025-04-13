package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon5522 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        long sum = 0;
        while((str = br.readLine())!=null && !str.isBlank()){
            sum += Long.parseLong(str);
        }
        System.out.print(sum);
    }
}
