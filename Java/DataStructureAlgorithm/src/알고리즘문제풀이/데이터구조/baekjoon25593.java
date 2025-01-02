package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon25593 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int FAIR_NUMBER = 12;
    static int N;
    static Map<String, Integer> workTime = new HashMap();
    static int[] timeArr = {4, 6, 4, 10};

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            for(int w=0; w<4; w++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 7; j++) {
                    String name = st.nextToken();
                    if (name.equals("-")) continue;
                    addTime(name, timeArr[w]);
                }
            }
        }
        if(workTime.isEmpty()){
            System.out.println("Yes");
        } else {
            List<Integer> timeList = new ArrayList<>(workTime.values());
            Collections.sort(timeList);
            int max = timeList.get(timeList.size() - 1);
            int min = timeList.get(0);
            System.out.println(max - min > FAIR_NUMBER ? "No" : "Yes");
        }
    }

    private static void addTime(String name, int time){
        int timeToUpdate = time;
        if(workTime.containsKey(name)) {
            timeToUpdate += workTime.get(name);
        }
        workTime.put(name, timeToUpdate);
    }
}
