package 알고리즘문제풀이.정렬;

import java.io.*;

public class baekjoon1251 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            sb.append("z");
        }
        String result = sb.toString();
        for(int i=1; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                sb.setLength(0);
                sb.append(new StringBuilder(str.substring(0, i)).reverse());
                sb.append(new StringBuilder(str.substring(i, j)).reverse());
                sb.append(new StringBuilder(str.substring(j)).reverse());
                String newStr = sb.toString();
                if(newStr.compareTo(result) < 0){
                    result = newStr;
                }
            }
        }
        System.out.println(result);
    }
}
