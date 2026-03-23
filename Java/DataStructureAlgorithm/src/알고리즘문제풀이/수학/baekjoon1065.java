package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int numOfHS = 0;
        for (int i=1; i<=N; i++) {
            if (checkHS(i)) {
                numOfHS++;
            }
        }
        System.out.println(numOfHS);
    }

    private static boolean checkHS(int i) {
        if (i < 100) return true;

        String number = i + "";
        int length = number.length();
        int diff = Character.getNumericValue(number.charAt(0)) - Character.getNumericValue(number.charAt(1));
        for (int j=1; j+1<length; j++) {
            int currentDiff =
                    Character.getNumericValue(number.charAt(j)) - Character.getNumericValue(number.charAt(j+1));
            if (diff != currentDiff) return false;
        }
        return true;
    }
}
