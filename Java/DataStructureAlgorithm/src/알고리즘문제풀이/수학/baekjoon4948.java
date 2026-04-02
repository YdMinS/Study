package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon4948 {
    static List<Integer> primeNumbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        primeNumbers.add(2);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n != 0) {
            findPrimeNumbers(n);
            int numOfPrimeNumber = findNumberOfPrimeNumbers(n);
            System.out.println(numOfPrimeNumber);
            n = Integer.parseInt(br.readLine());
        }
    }

    private static void findPrimeNumbers(int n) {
        int lastIndex = primeNumbers.size() - 1;
        int lastPrimNumber = primeNumbers.get(lastIndex);

        for (int i=lastPrimNumber+1; i<=2*n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n % 2 == 0) return false;

        for (int i=3; i*i<=n; i+=2) {
            if (n % i == 0 ) return false;
        }

        return true;
    }

    private static int findNumberOfPrimeNumbers(int n) {
        int num = 0;
        for(int primeNumber : primeNumbers) {
            if (primeNumber > n && primeNumber <= 2*n) num++;
        }
        return num;
    }
}
