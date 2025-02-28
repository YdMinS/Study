package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon23027 {
    // index of A, B, C = 0, 1, 2
    private static int[] ABC = new int[3];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String to;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int index = ch-'A';
            if(index>=0 && index<=2) ABC[index]++;
            if(ABC[0]!=0) break;
        }
        if(ABC[0]!=0){
            to = "A";
        } else if (ABC[1]!=0){
            to = "B";
        } else if (ABC[2]!=0){
            to = "C";
        } else {
            System.out.println("A".repeat(s.length()));
            return;
        }
        StringBuilder newS = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch<='F' && ch!='E'){
                newS.append(to);
            } else {
                newS.append(ch);
            }
        }
        System.out.println(newS);
    }
}
