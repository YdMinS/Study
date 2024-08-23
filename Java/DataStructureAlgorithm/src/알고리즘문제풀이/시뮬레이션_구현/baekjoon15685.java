package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon15685 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, cnt = 0;
    static int[][] map = new int[101][101];
    static int[][] playMap;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(cnt);
    }

    private static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        playMap = new int[N][4];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++) {
                playMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void execute() throws IOException{
        for(int[] info: playMap){
            int x = info[0];
            int y = info[1];
            int d = info[2];
            int g = info[3];
            play(x, y , d, g);
        }
        countSquare();
    }

    private static void play(int x, int y, int d, int g){
        List<Integer[]> list = new ArrayList<>();
        list.add(new Integer[]{x, y});
        map[x][y] = 1;
        Integer[] pointFromFirstPlay = findSecondPoint(x, y, d);
        map[pointFromFirstPlay[0]][pointFromFirstPlay[1]] = 1;
        list.add(pointFromFirstPlay);
        int rotation = g;
        while(rotation>0){
            int rx = list.get(list.size()-1)[0];
            int ry = list.get(list.size()-1)[1];
            for (int i = list.size() - 2; i >= 0; i--) {
                int nx = list.get(i)[0];
                int ny = list.get(i)[1];
                Integer[] shiftedPoint = shiftPoint(nx, ny, rx, ry);
                int shiftedX = shiftedPoint[0];
                int shiftedY = shiftedPoint[1];
                list.add(new Integer[]{shiftedX, shiftedY});
                map[shiftedX][shiftedY] = 1;
            }
            rotation--;
        }
    }

    private static Integer[] findSecondPoint(int x, int y, int d){
        int rx = x;
        int ry = y;
        switch(d){
            case 0:
               rx++;
               break;
            case 1:
                ry--;
                break;
            case 2:
                rx--;
                break;
            case 3:
                ry++;
        }
        return new Integer[]{rx, ry};
    }

    private static Integer[] shiftPoint(int nx, int ny, int rx, int ry){
        int difX = nx-rx;
        int difY = ny-ry;
        int shiftedX = rx - difY;
        int shiftedY = ry + difX;
        return new Integer[]{shiftedX, shiftedY};
    }

    private static void countSquare(){
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                int result = 0;
                result += map[i][j];
                result += map[i+1][j];
                result += map[i][j+1];
                result += map[i+1][j+1];
                if(result==4) cnt++;
            }
        }
    }
}
