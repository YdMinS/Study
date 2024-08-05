package 알고리즘문제풀이.브루트포스;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon1107 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int channel, brokenBtnNum;
    static boolean[] broken = new boolean[10];

    public static void main(String[] args) throws IOException{
        input();
        int result = execute();
        System.out.println(result);
    }

    static void input() throws IOException{
        channel = Integer.parseInt(br.readLine());
        brokenBtnNum = Integer.parseInt(br.readLine());
        if(brokenBtnNum > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < brokenBtnNum; i++) {
                int brokenBtn = Integer.parseInt(st.nextToken());
                broken[brokenBtn] = true;
            }
        }
    }

    static int execute(){
        int minPress = Math.abs(channel-100);
        for(int i=0; i<=1000000; i++){
            int length = possible(i);
            if(length>0){
                int press = Math.abs(channel-i)+length;
                if(press < minPress){
                    minPress = press;
                }
            }
        }
        return minPress;
    }

    static int possible(int num){
        if(num == 0){
            return broken[0] ? 0 : 1;
        }
        int length = 0;
        while(num>0){
            if(broken[num%10]){
                return 0;
            }
            num /= 10;
            length++;
        }
        return length;
    }
}
