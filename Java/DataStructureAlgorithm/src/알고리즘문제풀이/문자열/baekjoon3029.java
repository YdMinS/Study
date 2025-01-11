package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon3029 {
    private static final int FULL_TIME = 3600 * 24;
    private static final int[] TIME_UNIT_SECONDS = {3600, 60, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] c = br.readLine().split(":");
        String[] e = br.readLine().split(":");

        int currentTime = convertTimeToSeconds(c);
        int explosionTime = convertTimeToSeconds(e);

        int timeDiff =  (explosionTime - currentTime + FULL_TIME) % FULL_TIME;

        System.out.println(toHHMMSS(timeDiff));
    }

    private static int convertTimeToSeconds(String[] time){
        int result = 0;
        for(int i=0; i<3; i++){
            result += TIME_UNIT_SECONDS[i] * Integer.parseInt(time[i]);
        }
        return result;
    }

    private static String toHHMMSS(int timeDiff){
        if(timeDiff==0){
            return "24:00:00";
        }
        int restTime  = timeDiff;
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i<3; i++){
            int timeToPrint = restTime/TIME_UNIT_SECONDS[i];
            if(timeToPrint < 10) strBuilder.append("0");
            strBuilder.append(timeToPrint);
            restTime %= TIME_UNIT_SECONDS[i];
            if(i<2) strBuilder.append(":");
        }
        return strBuilder.toString();
    }
}
