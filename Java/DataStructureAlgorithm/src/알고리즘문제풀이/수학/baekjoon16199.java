package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon16199 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int[] birthDay = input();
        int[] today = input();
        System.out.println(calculateLifeYears(birthDay, today));
        System.out.println(1 + today[0] - birthDay[0]);
        System.out.println(today[0] - birthDay[0]);
    }

    private static int[] input() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] result = new int[3];
        for(int i=0; i<3; i++){
            result[i] = Integer.parseInt(st.nextToken());
        }
        return result;
    }

    private static int calculateLifeYears(int[] birthDay, int[] today){
        int result = today[0] - birthDay[0] - 1;
        if(today[1] > birthDay[1] || (today[1] == birthDay[1] && today[2]>=birthDay[2])){
            result++;
        }
        return result;
    }
}
