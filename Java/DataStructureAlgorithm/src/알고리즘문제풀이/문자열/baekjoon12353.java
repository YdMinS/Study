package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon12353 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String gender = st.nextToken();
            int[] heightOfFather = getHeight(st.nextToken());
            int[] heightOfMother = getHeight(st.nextToken());
            double middleValue = getMiddleValue(gender, heightOfFather, heightOfMother);
            int[] rangeValue = getRange(middleValue);
            bw.write(String.format("Case #%d: %d'%d\" to %d'%d\"", i, rangeValue[0], rangeValue[1], rangeValue[2], rangeValue[3]));
            if(i<N) bw.newLine();
        }
        bw.close();
    }

    private static int[] getHeight(String data){
        String[] parsedData = data.split("[\'\"]");
        return new int[]{Integer.parseInt(parsedData[0]), Integer.parseInt(parsedData[1])};
    }

    private static double getMiddleValue(String gender, int[] heightOfFather, int[] heightOfMother) {
        int fatherHeightInInch = 12 * heightOfFather[0] + heightOfFather[1];
        int motherHeightInInch = 12 * heightOfMother[0] + heightOfMother[1];
        int sumInInch = fatherHeightInInch + motherHeightInInch;
        switch(gender){
            case "B":
                sumInInch += 5;
                break;
            case "G":
                sumInInch -= 5;
        }
        return sumInInch/2.0;
    }

    private static int[] getRange(double middleValue){
        int mvForUpperCase = (int)Math.floor(middleValue);
        int mvForLowerCase = (int)Math.ceil(middleValue);
        int[] upperRange = new int[]{(mvForUpperCase+4)/12, (mvForUpperCase+4)%12};
        int[] lowerRange = new int[]{(mvForLowerCase-4)/12, (mvForLowerCase-4)%12};
        if(lowerRange[0]<0) {
            lowerRange[0]--;
            lowerRange[1]+=12;
        }
        return new int[]{lowerRange[0], lowerRange[1], upperRange[0], upperRange[1]};
    }
}
