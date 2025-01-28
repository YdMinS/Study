package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon31628 {
    static String[][] map = new String[10][10];

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(findHorizontal() || findVertical() ? 1 : 0);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0; i<10; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<10; j++){
                map[i][j] = st.nextToken();
            }
        }
    }

    private static boolean findHorizontal() {
        for(int i=0; i<10; i++){
            boolean isSame = true;
            String FIRST = map[i][0];
            for(int j=1; j<10; j++){
                String str = map[i][j];
                if(!str.equals(FIRST)) {
                    isSame = false;
                    break;
                }
            }
            if(isSame) return true;
        }
        return false;
    }

    private static boolean findVertical() {
        for(int i=0; i<10; i++){
            boolean isSame = true;
            String FIRST = map[0][i];
            for(int j=1; j<10; j++){
                String str = map[j][i];
                if(!str.equals(FIRST)) {
                    isSame = false;
                    break;
                }
            }
            if(isSame) return true;
        }
        return false;
    }
}
