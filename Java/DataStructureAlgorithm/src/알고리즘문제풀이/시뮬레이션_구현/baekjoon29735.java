package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon29735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputTime = br.readLine().split(" ");
        int start = toMinutes(inputTime[0]);
        int end = toMinutes(inputTime[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int workTime = end - start;
        int maxPerDay = workTime / T;

        int target = N + 1;
        int day = target / maxPerDay;
        int rest = target % maxPerDay;

        if (rest == 0) {
            day--;
            rest = maxPerDay;
        }

        int arrival = start + rest * T;
        int hour = arrival / 60;
        int minute = arrival % 60;

        System.out.printf("%d\n%02d:%02d\n", day, hour, minute);
    }

    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}