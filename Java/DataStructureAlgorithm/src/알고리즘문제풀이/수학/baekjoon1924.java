package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon1924 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int totalDays = calculateDays(m, d);
        System.out.println(findDay(totalDays));
    }

    private static int calculateDays(int m, int d){
        int[] LENGTH_OF_MONTH = new int[]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int day = d;
        for(int i=0; i<m-1; i++){
            day += LENGTH_OF_MONTH[i];
        }
        return day;
    }

    private static String findDay(int totalDays){
        String[] DAYS = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        return DAYS[totalDays%7];
    }
}
