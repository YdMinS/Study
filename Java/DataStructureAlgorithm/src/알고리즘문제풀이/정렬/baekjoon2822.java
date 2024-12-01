package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon2822 {
    static class Point implements Comparable<Point>{
        int num;
        int index;

        public Point(int num, int index){
            this.num = num;
            this.index = index;
        }

        @Override
        public int compareTo(Point other){
            return other.num - this.num;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=1; i<=8; i++){
            int num = Integer.parseInt(br.readLine());
            pq.offer(new Point(num, i));
        }
        List<Integer> indexList = new ArrayList();
        int sum = 0;
        for(int i=0; i<5; i++){
            Point point = pq.poll();
            sum += point.num;
            indexList.add(point.index);
        }
        System.out.println(sum);
        Collections.sort(indexList);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<5; i++){
            sb.append(indexList.get(i));
            if(i<4){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
