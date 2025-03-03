package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon9243 {
    private static final String SUCCESS = "Deletion succeeded";
    private static final String FAILED = "Deletion failed";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String original = br.readLine();
        String edit = br.readLine();
        if(number%2==0){
            System.out.println(original.equals(edit) ? SUCCESS : FAILED);
        } else {
            for(int i=0; i<original.length(); i++){
                char ch1 = original.charAt(i);
                char ch2 = edit.charAt(i);
                if(ch1 == ch2){
                    System.out.println(FAILED);
                    return;
                }
            }
            System.out.println(SUCCESS);
        }
    }
}
