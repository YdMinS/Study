package 알고리즘문제풀이.그리디;

import java.io.*;

public class baekjoon1439 {
    static int groupOf0 = 0;
    static int groupOf1 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char current = s.charAt(0);
        countGroup(current);
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            if(c!=current){
                current = c;
                countGroup(current);
            }
        }
        System.out.println(Math.min(groupOf0, groupOf1));
    }

    private static void countGroup(char current) {
        if(current== '1'){
            groupOf1++;
        } else {
            groupOf0++;
        }
    }
}
