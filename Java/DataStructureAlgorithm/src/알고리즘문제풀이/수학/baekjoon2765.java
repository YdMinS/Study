package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2765 {
    private static final String RESULT_STRING = "Trip #%d: %.2f %.2f\n";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = 1;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            double diameter = Double.parseDouble(st.nextToken());
            double numOfRevolution = Double.parseDouble(st.nextToken());
            double time = Double.parseDouble(st.nextToken());

            if(numOfRevolution == 0)break;

            double distance = diameter * 3.1415927 * numOfRevolution / 5280 / 12;
            double MPH = distance * 3600 / time ;
            bw.write(String.format(RESULT_STRING, i, distance, MPH));
            i++;
        }
        bw.flush();
        bw.close();
    }
}
