package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon5613 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(br.readLine());
        String operator;
        while(!(operator = br.readLine()).equals("=")){
            int operand = Integer.parseInt(br.readLine());
            result = calculate(result, operand, operator);
        }
        System.out.print(result);
    }

    private static int calculate(int operand1, int operand2, String operator) {
        int result = operand1;
        switch (operator){
            case "+":
                result += operand2;
                break;
            case "-":
                result -= operand2;
                break;
            case "*":
                result *= operand2;
                break;
            case "/":
                result /= operand2;
        }
        return result;
    }
}
