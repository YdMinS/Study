package 알고리즘문제풀이.문자열;

import java.util.regex.*;
import java.io.*;

public class baekjoon17249 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] handPrints = br.readLine().split(Pattern.quote("(^0^)"));
        int leftSide = countJap(handPrints[0]);
        int rightSide = handPrints.length==1 ? 0 : countJap(handPrints[1]);
        System.out.printf("%d %d", leftSide, rightSide);
    }

    private static int countJap(String handPrint){
        int cnt = 0;
        for(int i=0; i<handPrint.length(); i++){
            char ch = handPrint.charAt(i);
            if(ch=='@') cnt++;
        }
        return cnt;
    }
}
