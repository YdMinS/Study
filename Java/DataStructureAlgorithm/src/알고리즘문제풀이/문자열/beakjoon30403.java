package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class beakjoon30403 {
    private static Set<Character> alphabetSet = new HashSet<>();

    public static void main(String[] args) throws IOException{
        input();
        boolean isUpperRainbow = findRainbow("ROYGBIV");
        boolean isLowerRainbow = findRainbow("roygbiv");
        System.out.println(whichRainbow(isUpperRainbow, isLowerRainbow));
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            alphabetSet.add(str.charAt(i));
        }
    }

    private static boolean findRainbow(String ref){
        for(int i=0; i<ref.length(); i++){
            if(!alphabetSet.contains(ref.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static String whichRainbow(boolean isUpperRainbow, boolean isLowerRainbow){
        if(isUpperRainbow && isLowerRainbow){
            return "YeS";
        } else if (isUpperRainbow){
            return "YES";
        } else if (isLowerRainbow){
            return "yes";
        } else {
            return "NO!";
        }
    }
}
