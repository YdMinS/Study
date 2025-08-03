package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;

public class baekjoon19843 {
    private static List<String> days = new ArrayList<>();
    static {
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int countedT = 0;
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int sleepDayIn = days.indexOf(st.nextToken());
            int sleepTimeIn = Integer.parseInt(st.nextToken());
            int sleepDayOut = days.indexOf(st.nextToken());
            int sleepTimeOut = Integer.parseInt(st.nextToken());
            int sleepDays = sleepDayOut - sleepDayIn;
            if (sleepDays == 0) {
                countedT += sleepTimeOut - sleepTimeIn;
            }
            else if (sleepDays == 1) {
                countedT += 24 - sleepTimeIn + sleepTimeOut;
            } else {
                countedT += 24 - sleepTimeIn + sleepTimeOut + 24 * (sleepDays - 1);
            }
        }
        if (T - countedT <= 0) {
            System.out.println(0);
        } else if (T - countedT <= 24 * 2) {
            System.out.println(T - countedT);
        } else {
            System.out.println(-1);
        }
    }
}
