package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon15662 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, playNum, cnt=0;
    static final int GEAR_SIZE = 8;
    static int[] rotatingGear;
    static int[][] map, play;

    public static void main(String[] args)throws IOException{
        input();
        execute();
        System.out.println(cnt);
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        map = new int[N][GEAR_SIZE];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<GEAR_SIZE; j++){
                map[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
        playNum = Integer.parseInt(br.readLine());
        play = new int[playNum][2];
        for(int i=0; i<playNum; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<2; j++){
                play[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void execute(){
        for(int i=0; i<playNum; i++) {
            rotatingGear = defineRotatingGear(i);
            for (int j = 0; j < rotatingGear.length; j++) {
                if(rotatingGear[j] == 1){
                    rotateToRight(j);
                } else if(rotatingGear[j] == -1){
                    rotateToLeft(j);
                }
            }
        }
        countS();
    }

    static int[] defineRotatingGear(int i){
        int[] rotatingGear = new int[N];
        int startGear = play[i][0]-1;
        rotatingGear[startGear] = play[i][1];

        for(int j=startGear+1; j<N; j++){
            if(map[j-1][2]!=map[j][6]) {
                rotatingGear[j] = rotatingGear[j-1] * -1;
            } else {
                break;
            }
        }
        for(int j=startGear-1; j>=0; j--){
            if(map[j+1][6] != map[j][2]){
                rotatingGear[j] = rotatingGear[j+1] * -1;
            } else {
                break;
            }
        }

        return rotatingGear;
    }

    static void rotateToRight(int gear){
        int temp = map[gear][GEAR_SIZE-1];
        for(int i=GEAR_SIZE-1; i>0; i--){
            map[gear][i] = map[gear][i-1];
        }
        map[gear][0] = temp;
    }

    static void rotateToLeft(int gear){
        int temp = map[gear][0];
        for(int i=0; i<GEAR_SIZE-1; i++){
            map[gear][i] = map[gear][i+1];
        }
        map[gear][GEAR_SIZE-1] = temp;
    }

    static void countS(){
        for(int i=0; i<N; i++){
            if(map[i][0]==1) cnt++;
        }
    }
}
