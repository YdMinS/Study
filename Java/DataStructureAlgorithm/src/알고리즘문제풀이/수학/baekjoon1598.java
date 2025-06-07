package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon1598 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] coordinateA = findXY(a);
        int[] coordinateB = findXY(b);
        System.out.println(findDistance(coordinateA, coordinateB));
    }

    private static int[] findXY(int num){
        int x = (num-1)/4;
        int y = (num-1)%4;
        return new int[]{x, y};
    }

    private static int findDistance(int[] A, int[] B){
        int distanceX = Math.abs(A[0] - B[0]);
        int distanceY = Math.abs(A[1] - B[1]);
        return distanceX + distanceY;
    }
}
