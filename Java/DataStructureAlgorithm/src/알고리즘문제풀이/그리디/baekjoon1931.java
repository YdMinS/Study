package 알고리즘문제풀이.그리디;

import java.io.*;
import java.lang.*;
import java.util.*;

public class baekjoon1931 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, max;
    static List<Meeting> meetings = new ArrayList<>();

    static class Meeting{
        int start, end;

        Meeting(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    static class MeetingComparator implements Comparator<Meeting>{
        @Override
        public int compare(Meeting m1, Meeting m2){
            if(m1.end == m2.end){
                return m1.start - m2.start;
            }
            return m1.end - m2.end;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
        System.out.println(max);
    }

    private static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meetings.add(new Meeting(start, end));
        }
    }

    private static void execute(){
        Collections.sort(meetings, new MeetingComparator());
        int count = 0;
        int end = 0;

        for(Meeting meeting : meetings){
            if(meeting.start >= end){
                count++;
                end = meeting.end;
            }
        }
        max = count;
    }
}
