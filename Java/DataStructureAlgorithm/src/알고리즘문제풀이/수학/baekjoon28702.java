package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon28702 {
    private static final String STR3 = "Fizz";
    private static final String STR5 = "Buzz";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<3; i++){
            try{
               int N =  Integer.parseInt(br.readLine())+3-i;
               if(N%3==0 && N%5==0){
                   System.out.println(STR3+STR5);
               } else if (N%3==0){
                   System.out.println(STR3);
                } else if (N%5==0){
                   System.out.println(STR5);
               } else {
                   System.out.println(N);
               }
               return;
            } catch(NumberFormatException e){
                continue;
            }
        }
    }
}
