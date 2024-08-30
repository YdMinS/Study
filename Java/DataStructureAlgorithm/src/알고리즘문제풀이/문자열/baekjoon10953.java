package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;

public class baekjoon10953 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(",");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(a+b);
        }
    }
}
/Users/ixtlim/Desktop/DeChallintier/YdMinS/Study/out/production/Study/알고리즘문제풀이/문자열/baekjoon10953
        ./Users/ixtlim/Desktop/DeChallintier/YdMinS/Study/Java/DataStructureAlgorithm/src/알고리즘문제풀이/문자열/baekjoon10953.java