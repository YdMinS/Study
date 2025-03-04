package 알고리즘문제풀이.문자열;

import java.io.*;

public class beajoon32621 {
    private static final String CUTE = "CUTE";
    private static final String NO_MONEY = "No Money";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if(!input.contains("+")){
            System.out.println(NO_MONEY);
            return;
        }
        String[] strArr = input.split("\\+");

        if (strArr.length != 2) {
            System.out.print(NO_MONEY);
            return;
        }

        if(!strArr[0].equals(strArr[1])){
            System.out.print(NO_MONEY);
            return;
        }

        char ch1 = strArr[0].charAt(0);
        char ch2 = strArr[1].charAt(0);

        if (ch1 < '1' || ch1 > '9' || ch2 < '1' || ch2 > '9') {
            System.out.print(NO_MONEY);
            return;
        }

        System.out.print(CUTE);
    }
}
