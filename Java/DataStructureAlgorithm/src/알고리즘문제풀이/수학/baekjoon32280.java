package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon32280 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        List<Integer> timeList = new ArrayList<>();
        int lateTime;
        int teacherTime=0;
        for(int i=0; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int time = calcuateTime(st.nextToken());
            String who = st.nextToken();
            if(who.equals("teacher")){
                teacherTime = time;
            } else {
                timeList.add(time);
            }
        }
        lateTime = calcuateTime(br.readLine());
        timeList.sort(Comparator.reverseOrder());
        for(int time : timeList){
            if(time>=lateTime && time>=teacherTime){
                num++;
            }
        }
        System.out.println(num);
    }

    private static int calcuateTime (String timeInfoStr){
        String[] timeInfo = timeInfoStr.split(":");
        return 60 * Integer.parseInt(timeInfo[0]) + Integer.parseInt(timeInfo[1]);
    }
}
