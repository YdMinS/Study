package 알고리즘문제풀이.기하;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon14215 {
    static int[] map = new int[3];

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        map[0] = Integer.parseInt(st.nextToken());
        map[1] = Integer.parseInt(st.nextToken());
        map[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(map);
    }

    private static int execute(){
        if(map[2]<map[0]+map[1]){
            return map[0]+map[1]+map[2];
        } else {
            return (map[0]+map[1])*2-1;
        }
    }
}
