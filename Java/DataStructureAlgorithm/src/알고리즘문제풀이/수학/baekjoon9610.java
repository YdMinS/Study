package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon9610 {
    private static int[] coordinateInfo = new int[5];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x==0 || y==0) coordinateInfo[0]++;
            else coordinateInfo[findLocation(x, y)]++;
        }
        output();
    }

    private static int findLocation(int x, int y){
       return x>0 ? (y>0 ? 1 : 4) : (y>0 ? 2 : 3);
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<=4; i++){
            bw.write("Q"+i+": "+coordinateInfo[i]+"\n");
        }
        bw.write("AXIS: "+coordinateInfo[0]);
        bw.flush();
        bw.close();
    }
}
