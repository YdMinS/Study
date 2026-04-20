package 알고리즘문제풀이.브루트포스;

import java.util.*;
import java.io.*;

public class baekjoon24060 {
    static int N, K;
    static int[] num, temp;
    static int cnt=0, result=-1;

    public static void main(String[] args) throws IOException {
        input();
        mergeSort(0, N-1);
        System.out.println(result);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        num = new int[N];
        temp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void mergeSort(int p, int r) {
        if (p <r) {
            int q = (p+r)/2;
            mergeSort(p, q);
            mergeSort(q+1, r);
            merge(p, q, r);
        }
    }

    private static void merge(int p, int q, int r) {
        int i = p;
        int j = q+1;
        int t = 0;

        while (i<=q && j<=r) {
            if (num[i] <= num[j]) {
                temp[t++] = num[i++];
            } else {
                temp[t++] = num[j++];
            }
        }

        while (i<=q) {
            temp[t++] = num[i++];
        }

        while (j<=r) {
            temp[t++] = num[j++];
        }

        i=p;
        t=0;
        while (i<=r) {
            num[i]= temp[t++];
            cnt++;

            if (cnt == K) {
                result = num[i];
            }

            i++;
        }
    }
}
