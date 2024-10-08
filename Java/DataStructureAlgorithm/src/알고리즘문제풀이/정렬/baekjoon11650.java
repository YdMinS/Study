package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

class Point implements Comparable<Point>{
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other){
        if(this.x != other.x){
            return Integer.compare(this.x, other.x);
        }
        return Integer.compare(this.y, other.y);
    }
}

public class baekjoon11650 {
    static int N;
    static List<Point> list = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        input();
        Collections.sort(list);
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Point(x, y));
        }
    }

    private static void output() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Point point : list) {
            bw.append(point.x + " " + point.y + "\n");
        }
        bw.flush();
        bw.close();
    }
}
