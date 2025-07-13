package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon17502 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringBuilder result = new StringBuilder();
        List<Character> resultList = new ArrayList<>();
        int strLength = str.length() % 2 == 0 ? str.length()/2 : str.length()/2 + 1;
        for(int i=0; i<strLength; i++){
            char front = str.charAt(i);
            char back = str.charAt(str.length()-1-i);
            if (front == back && front != '?') {
                resultList.add(front);
                continue;
            }
            if (front != back) {
                if (front == '?') {
                    resultList.add(back);
                } else {
                    resultList.add(front);
                }
                continue;
            }
            resultList.add('a');
        }
        for (Character character : resultList) {
            result.append(character);
        }
        int startIndex = str.length() %2 == 0 ? resultList.size()-1 : resultList.size() -2;
        for (int i=startIndex; i>=0; i--){
            result.append(resultList.get(i));
        }
        System.out.println(result);
    }
}
