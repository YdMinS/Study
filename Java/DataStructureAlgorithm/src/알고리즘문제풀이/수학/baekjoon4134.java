package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            long n = Long.parseLong(br.readLine());

            if (n <=2) {
                System.out.println(2);
                continue;
            }

            if (n%2 ==0) n++;

            while (true) {
                if (isPrime(n)) {
                    System.out.println(n);
                    break;
                }
                n += 2;
            }
        }
    }

    static boolean isPrime(long num) {
        if (num % 2 == 0) return false;

        for (long i=3; i*i <= num; i+=2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
