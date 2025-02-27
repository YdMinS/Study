package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;
import java.text.*;

public class baekjoon29614 {
    private static final Map<String, Double> scoreMap = new HashMap<>();
    static{
        scoreMap.put("A+", 4.5);
        scoreMap.put("A", 4.0);
        scoreMap.put("B+", 3.5);
        scoreMap.put("B", 3.0);
        scoreMap.put("C+", 2.5);
        scoreMap.put("C", 2.0);
        scoreMap.put("D+", 1.5);
        scoreMap.put("D", 1.0);
        scoreMap.put("F", 0.0);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String gradeInfo = br.readLine();
        double sum = 0;
        int numOfSubject = 0;
        for(int i=0; i<gradeInfo.length(); i++){
            String grade;
            if(i<gradeInfo.length()-1 && (gradeInfo.charAt(i+1))=='+'){
                grade = gradeInfo.substring(i, i+2);
                i++;
            } else {
                grade = gradeInfo.charAt(i) + "";
            }
            numOfSubject++;
            sum += scoreMap.get(grade);
        }
        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println(df.format(sum/numOfSubject));
    }
}
