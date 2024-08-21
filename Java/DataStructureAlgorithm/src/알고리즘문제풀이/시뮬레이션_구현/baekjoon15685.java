//package 알고리즘문제풀이.시뮬레이션_구현;
//
//import java.lang.*;
//import java.io.*;
//import java.util.*;
//
//public class baekjoon15685 {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static StringTokenizer st;
//    static int N, cnt = 0;
//    static int[][] map = new int[101][101];
//    static int[][] playMap;
//
//    public static void main(String[] args) throws IOException{
//        input();
//        execute();
//    }
//
//    static void input() throws IOException{
//        N = Integer.parseInt(br.readLine());
//        playMap = new int[N][4];
//        for(int i=0; i<N; i++){
//            st = new StringTokenizer(br.readLine());
//            for(int j=0; j<4; j++) {
//                playMap[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//    }
//
//    static void execute() throws IOException{
//        for(int[] info: playMap){
//            int x = info[0];
//            int y = info[1];
//            int d = info[2];
//            int g = info[3];
//            play(x, y , d, g);
//        }
//    }
//
//    static void play(int x, int y, int d, int g){
//        List<Integer[]> list = new ArrayList<>();
//        list.add(new Integer[]{x, y});
//        map[x][y] = 1;
//        if(g>0) {
//            Integer[] listOf1G = findSecondPoint(x, y, d);
//            map[listOf1G[0]][listOf1G[1]] = 1;
//            list.add(findSecondPoint(x, y, d));
//            if(g>1){
//                int rx = list.get(list.size())[0];
//                int ry = list.get(list.size())[1];
//                for(int i=list.size()-2; i>=0; i--){
//                    int nx = list.get(i)[0];
//                    int ny = list.get(i)[1];
//                    Integer[] shiftedPoint = shiftPoint(nx, ny, rx, ry);
//                    int shiftedX = shiftedPoint[0];
//                    int shiftedY = shiftedPoint[1];
//                    list.add(new Integer[]{shiftedX, shiftedY});
//                    map[shiftedX][shiftedY] = 1;
//                }
//            }
//        }
//    }
//
//    static Integer[] findSecondPoint(int x, int y, int d){
//        int rx = x;
//        int ry = y;
//        switch(d){
//            case 0:
//               rx++;
//               break;
//            case 1:
//                ry--;
//                break;
//            case 2:
//                rx--;
//                break;
//            case 3:
//                ry++;
//        }
//        return new Integer[]{rx, ry};
//    }
//
//    static Integer[] shiftPoint(int nx, int ny, int rx, int ry){
//        int shiftedX;
//        int shiftedY;
//        int difX = nx-rx;
//        int difY = ny-ry;
//        if(difX > 0){
//            if(difY > 0){
//                shiftedX = nx;
//                shiftedY *= ry - difY;
//            }
//            if(difY < 0){
//                shiftedX = rx - difX;
//                shiftedY = ny;
//            }
//        }
//        if(difX < 0){
//            if(difY > 0){
//                shiftedX = rx + di
//            }
//            if(difY < 0){
//                shiftedY *
//            }
//        }
//        if(nx-rx == 0){
//
//        }
//    }
//}
