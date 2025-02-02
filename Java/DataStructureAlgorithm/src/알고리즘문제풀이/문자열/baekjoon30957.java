package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon30957 {
    static final String SCU = "SCU";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String survey = br.readLine();
        int[] countArr = new int[3];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            char ch = survey.charAt(i);
            int index = ch == 'B' ? 0 : (ch == 'S' ? 1 : 2);
            countArr[index]++;
            max = Math.max(max, countArr[index]);
        }
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i<3; i++){
            if(max == countArr[i]){
                strBuilder.append(i == 0 ? 'B' : (i==1 ? 'S' : 'A'));
            }
        }
        System.out.println(strBuilder.length()==3 ? SCU : strBuilder);
    }
}
