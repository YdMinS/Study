package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon17103 {
    static HashSet<Integer> primeNumbers = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            int goldBachNum = findGoldBachNum(num);
            System.out.println(goldBachNum);
        }
    }

    private static void initialize() {
        primeNumbers.add(2);

        for (int i=3; i<=1000000; i+=2) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i=3; i*i<=n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }

    private static int findGoldBachNum(int num) {
        int goldBachNum = 0;

        for (int prime1 : primeNumbers) {
            if (primeNumbers.contains(num-prime1)) {
                goldBachNum++;
            }
            if (num-prime1 == prime1) goldBachNum++;
        }

        return goldBachNum/2;
    }
}
