package 알고리즘문제풀이.그리디;

import java.io.*;

public class baekjoon1343 {
    static StringBuilder sb = new StringBuilder();
    static final String PATTERN1 = "AAAA";
    static final String PATTERN2 = "BB";
    static int currentX = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        for(int i=0; i<board.length(); i++){
            char c = board.charAt(i);
            if(c == '.'){
                if(currentX != 0){
                    if(currentX%2==1){
                        System.out.println(-1);
                        return;
                    } else {
                        doPattern();
                    }
                }
                currentX = 0;
                sb.append(".");
            } else {
                currentX++;
                if(i==board.length()-1){
                    if(currentX%2==1){
                        System.out.println(-1);
                        return;
                    } else {
                        doPattern();
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }

    private static void doPattern(){
        int numOfPatter1 = currentX/PATTERN1.length();
        int numOfPatter2 = currentX%PATTERN1.length()/PATTERN2.length();
        sb.append(PATTERN1.repeat(numOfPatter1)).append(PATTERN2.repeat(numOfPatter2));
    }
}
