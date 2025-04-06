package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon31844 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int exclaLocation = -1;
        int hashLocation = -1;
        int atLocation = -1;
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            switch (ch){
                case '.':
                    break;
                case '@':
                    atLocation = i;
                    break;
                case '#':
                    hashLocation = i;
                    break;
                case '!':
                    exclaLocation = i;
            }
        }
        System.out.print(findCommandsNumber(exclaLocation, hashLocation, atLocation));
    }

    private static int findCommandsNumber(int exclaLocation, int hashLocation, int atLocation){
        int result = -1;
        if(exclaLocation>hashLocation && hashLocation>atLocation || exclaLocation<hashLocation && hashLocation<atLocation){
            result = Math.abs(exclaLocation-atLocation)-1;
        }
        return result;
    }
}
