package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon28455 {
    static int N;
    static List<Integer> list = new ArrayList();

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list, Collections.reverseOrder());
    }

    private static String execute() {
        int level = 0;
        int ability = 0;
        for(int i=0; i<(list.size()<42 ? list.size() : 42); i++){
            ability += calculateLevel(list.get(i));
            level += list.get(i);
        }
        return level+" "+ability;
    }

    private static int calculateLevel(int num){
        if(num>=250){
            return 5;
        } else if (num>=200){
            return 4;
        } else if (num>=140){
            return 3;
        } else if (num>=100){
            return 2;
        } else if (num >=60){
            return 1;
        }
        return 0;
    }
}
