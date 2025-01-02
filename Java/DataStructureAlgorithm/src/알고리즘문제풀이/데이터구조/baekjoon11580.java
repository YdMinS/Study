package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon11580 {
    static class Point{
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if(obj==null || getClass() != obj.getClass()) return false;
            Point other = (Point) obj;
            return x == other.x && y == other.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static Map<Character, int[]> direction = new HashMap<>();
    static {
        direction.put('E', new int[]{1, 0});
        direction.put('W', new int[]{-1, 0});
        direction.put('N', new int[]{0, 1});
        direction.put('S', new int[]{0, -1});
    }
    static Set<Point> visited = new HashSet();
    static {
        visited.add(new Point(0,0));
    }
    static int N, cnt=1;
    static String commands;
    static int[] current = {0,0};

    public static void main(String[] args) throws IOException{
        input();
        for(int i=0; i<commands.length(); i++){
            search(commands.charAt(i));
        }
        System.out.println(cnt);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        commands = br.readLine();
    }

    private static void search(char ch){
        int[] d = direction.get(ch);
        int nx = current[0] + d[0];
        int ny = current[1] + d[1];
        Point nextPoint = new Point(nx, ny);
        if(!visited.contains(nextPoint)){
            visited.add(nextPoint);
            cnt++;
        }
        current = new int[]{nx, ny};
    }
}
