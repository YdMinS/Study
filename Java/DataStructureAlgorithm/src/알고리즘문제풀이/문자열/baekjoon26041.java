package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon26041 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> numList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            numList.add(st.nextToken());
        }
        String B = br.readLine();
        int result = 0;
        for(String A : numList){
            if(A.length() != B.length() && A.startsWith(B)){
                result++;
            }
        }
        System.out.println(result);
    }
}
