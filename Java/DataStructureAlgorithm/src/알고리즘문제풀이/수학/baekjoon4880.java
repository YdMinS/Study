package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon4880 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int[] inputNum = parseNum();
        while(!(inputNum[0]==0 && inputNum[1]==0 && inputNum[2]==0)){
            String type = findType(inputNum);
            switch(type){
                case "AP":
                    int diff = inputNum[2]-inputNum[1];
                    System.out.println(type +" "+ (inputNum[2]+diff));
                    break;
                case "GP":
                    double ratio = (double)inputNum[2]/inputNum[1];
                    System.out.println(type + " " +(inputNum[2] * (int)ratio));
            }
            inputNum = parseNum();
        }
    }

    private static int[] parseNum() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] result = new int[3];
        result[0] = Integer.parseInt(st.nextToken());
        result[1] = Integer.parseInt(st.nextToken());
        result[2] = Integer.parseInt(st.nextToken());
        return result;
    }

    private static String findType(int[] inputNum){
        if(inputNum[0]-inputNum[1] == inputNum[1]-inputNum[2]){
            return "AP";
        } else {
            return "GP";
        }
    }
}
