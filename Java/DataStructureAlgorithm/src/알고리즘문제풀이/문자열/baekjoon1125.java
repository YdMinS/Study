package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon1125 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String frontNum = st.nextToken();
        String backNum = st.nextToken();
        char[] frontNums = frontNum.toCharArray();
        char[] backNums = backNum.toCharArray();
        long result = 0;
        for(int i=0; i<frontNums.length; i++){
            for(int j=0; j<backNums.length; j++){
                result += (long) (frontNums[i] - '0') * (backNums[j]-'0');
            }
        }
        System.out.println(result);
    }
}
