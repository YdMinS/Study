package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon14890 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, L;
    static int[][] map;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static int execute() {
        int cnt = 0;
        cnt += searchH();
        cnt += searchV();
        return cnt;
    }

    private static int searchH(){
        int result = 0;
        for(int i=0; i<N; i++){
            int j=0;
            int lGage = 1;
            int prevHeight = map[i][j];
            boolean isCountable = true;
            for(j=1; j<N; j++){
                if(map[i][j] == prevHeight){
                    lGage++;
                } else if(map[i][j] == prevHeight + 1){
                    if(lGage >= L){
                        lGage = 1;
                        prevHeight = map[i][j];
                    } else {
                        isCountable = false;
                        break;
                    }
                } else if(map[i][j] == prevHeight - 1){
                    int count = 0;
                    for(int k=j; k<N; k++){
                        if(map[i][k] == prevHeight - 1){
                            count++;
                        } else {
                            break;
                        }
                    }
                    if(count >= L){
                        j += L - 1;
                        lGage = 0;
                        prevHeight = map[i][j];
                    } else {
                        isCountable = false;
                        break;
                    }
                } else {
                    isCountable = false;
                    break;
                }
            }
            if(isCountable) {
                result++;
            }
        }
        return result;
    }

    private static int searchV(){
        int result = 0;
        for(int i=0; i<N; i++){
            int j=0;
            int lGage = 1;
            int prevHeight = map[j][i];
            boolean isCountable = true;
            for(j=1; j<N; j++){
                if(map[j][i] == prevHeight){
                    lGage++;
                } else if(map[j][i] == prevHeight + 1){
                    if(lGage >= L){
                        lGage = 1;
                        prevHeight = map[j][i];
                    } else {
                        isCountable = false;
                        break;
                    }
                } else if(map[j][i] == prevHeight - 1){
                    int count = 0;
                    for(int k=j; k<N; k++){
                        if(map[k][i] == prevHeight - 1){
                            count++;
                        } else {
                            break;
                        }
                    }
                    if(count >= L){
                        j += L - 1;
                        lGage = 0;
                        prevHeight = map[j][i];
                    } else {
                        isCountable = false;
                        break;
                    }
                } else {
                    isCountable = false;
                    break;
                }
            }
            if(isCountable) {
                result++;
            }
        }
        return result;
    }
}
