package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon3028 {
    private static int[] ball = new int[]{1, 0, 0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rotations = br.readLine();
        for(int i=0; i<rotations.length(); i++){
            char rotationCode = rotations.charAt(i);
            rotate(rotationCode);
        }
        for(int i=0; i<ball.length; i++){
            if(ball[i]==1){
                System.out.print(i+1);
                return;
            }
        }
    }

    private static void rotate(char rotationCode){
        int temp;
        switch (rotationCode){
            case 'A':
                temp = ball[0];
                ball[0] = ball[1];
                ball[1] = temp;
                return;
            case 'B':
                temp = ball[1];
                ball[1] = ball[2];
                ball[2] = temp;
                return;
            case 'C':
                temp = ball[0];
                ball[0] = ball[2];
                ball[2] = temp;
        }
    }
}
