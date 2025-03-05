package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon32751 {
    private static int N;
    private static int[] ingredients;
    private static String aBurger;

    public static void main(String[] args) throws IOException{
        input();
        if(N==1 && aBurger.equals("a")) {
            System.out.println("Yes");
            return;
        }
        if(N==2 || (N>2 && (aBurger.charAt(0)!='a' || aBurger.charAt(N-1)!='a')) || ingredients[0]<2 ){
            System.out.println("No");
            return;
        }
        ingredients[0] -= 2;
        System.out.println(isDelicious() ? "Yes" : "No");
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ingredients = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            ingredients[i] = Integer.parseInt(st.nextToken());
        }
        aBurger = br.readLine();
    }

    private static boolean isDelicious(){
        char last = 'a';
        for(int i=1; i<N-1; i++){
            char ch = aBurger.charAt(i);
            if(last == ch) return false;
            last = ch;
            int index = ch-'a';
            if(ingredients[index]<=0){
                return false;
            } else {
                ingredients[index] -= 1;
            }
        }
        return true;
    }
}
