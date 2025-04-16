package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon5575 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] time = new int[6];
            for(int j=0; j<6; j++){
                time[j] = Integer.parseInt(st.nextToken());
            }
            int timeIn = time[0] * 60 * 60 + time[1] * 60 + time[2];
            int timeOut = time[3] * 60 * 60 + time[4] * 60 + time[5];
            int workingTime = timeOut - timeIn;
            bw.write(String.format("%d %d %d", workingTime/3600, workingTime%3600/60, workingTime%3600%60));
            if(i<2) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
