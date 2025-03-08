package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon16944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String password = br.readLine();

        boolean hasDigit = false, hasLower = false, hasUpper = false, hasSymbol = false;

        String specialCharacters = "!@#$%^&*()-+";

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) hasDigit = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isUpperCase(ch)) hasUpper = true;
            else if (specialCharacters.indexOf(ch) >= 0) hasSymbol = true;
        }

        int num_missing = 0;
        if (!hasDigit) num_missing++;
        if (!hasLower) num_missing++;
        if (!hasUpper) num_missing++;
        if (!hasSymbol) num_missing++;

        System.out.println(Math.max(num_missing, 6 - N));
    }
}
