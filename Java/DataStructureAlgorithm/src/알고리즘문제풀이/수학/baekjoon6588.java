package 알고리즘문제풀이.수학;

import java.io.*;
import java.util.*;

public class baekjoon6588 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int max=1000000;
    static boolean[] isPrime = new boolean[max+1];
    static List<Integer> primeMap = new ArrayList<>();
    final static String message = "Goldbach's conjecture is wrong.";


    static void execute() throws IOException{
        generatePrime();
        int num;
        while((num=Integer.parseInt(br.readLine())) != 0){
            proofGoldbach(num);
        }
    }

    private static void generatePrime(){
        Arrays.fill(isPrime, true);
        isPrime [0] = isPrime[1] = false;
        for(int i=2; i*i<=max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i=3; i<=max; i+=2){
            if(isPrime[i]){
                primeMap.add(i);
            }
        }

    }

    private static void proofGoldbach(int num) throws IOException {
        for(int prime: primeMap){
            if(prime > num) break;
            int b = num - prime;
            if(isPrime[b] && b%2!=0){
                bw.write(num+" = "+prime+" + "+b+"\n");
                return;
            }
        }
        bw.write(message+"\n");
    }

    static void output() throws IOException {
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        execute();
        output();
    }
}