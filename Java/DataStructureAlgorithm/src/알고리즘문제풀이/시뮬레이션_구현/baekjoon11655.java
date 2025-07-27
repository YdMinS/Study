package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;

public class baekjoon11655 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if (ch>='A' && ch <='Z') {
                sb.append(parseBig(ch));
            } else if (ch>='a' && ch<='z') {
                sb.append(parseSmall(ch));
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    private static char parseBig(char ch) {
        char result = (char)(ch+13) ;
        if (result > 'Z') result = (char)('A' + result - 'Z' - 1);
        return result;
    }

    private static char parseSmall(char ch) {
        char result = (char)(ch+13);
        if (result > 'z') result = (char)('a' + result - 'z' - 1);
        return result;
    }

}
