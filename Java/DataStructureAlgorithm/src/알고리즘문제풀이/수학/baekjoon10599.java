package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon10599 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input;
        while(isExecutable(input = br.readLine().split(" "))){
            List<Integer> ageList = new ArrayList<>();
            for(String str : input) {
                ageList.add(Integer.parseInt(str));
            }
            int maxAge = ageList.get(3) - ageList.get(0);
            int minAge = ageList.get(2) - ageList.get(1);
            bw.write(String.format("%d %d\n", minAge, maxAge));
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
