package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon11653 {
    static int N;
    static boolean[] numbers;
    static LinkedList<Integer> primeNumbers = new LinkedList<>();
    static List<Integer> factorizedNumber = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        preset();
        findPrimeNumbers();
        primeFactorization();
        output();
    }

    private static void preset() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numbers = new boolean[N+1];
    }

    private static void findPrimeNumbers(){
        for(int i=2; i<=N; i++){
            if(numbers[i]) continue;
            primeNumbers.add(i);
            for(int j=i; j<=N; j+=i){
                numbers[j] = true;
            }
        }
    }

    private static void primeFactorization(){
        int num = N;
        for(int i: primeNumbers){
            while(num%i==0){
                num /= i;
                factorizedNumber.add(i);
            }
        }
        Collections.sort(factorizedNumber);
    }

    private static void output() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i: factorizedNumber){
            stringBuilder.append(i+"\n");
        }
        System.out.println(stringBuilder);
    }
}
