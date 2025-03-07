package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon31832 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String candidate = br.readLine();
            if(isValid(candidate)) {
                System.out.println(candidate);
                return;
            }
        }
    }

    private static boolean isValid(String name){
        if(name.length()>10) return false;
        int numberNum = 0;
        int capitalNum = 0;
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch>='0' && ch<='9') numberNum++;
            else if(ch>='A' && ch<='Z') capitalNum--;
            else if(ch>='a' && ch<='z') capitalNum++;
        }
        return numberNum != name.length() && capitalNum>=0;
    }
}
