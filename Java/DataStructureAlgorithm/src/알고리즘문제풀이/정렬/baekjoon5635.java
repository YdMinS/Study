package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon5635 {
    static class Person{
        String name;
        int d;
        int m;
        int y;

        public Person(String name, int d, int m, int y){
            this.name = name;
            this.d = d;
            this.m = m;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Person(name, d, m, y));
        }
        Collections.sort(list, (a, b)-> {
            if(a.y!=b.y) return b.y - a.y;
            if(a.m!=b.m) return b.m - a.m;
            return b.d - a.d;
        });
        System.out.println(list.get(0).name);
        System.out.println(list.get(N-1).name);
    }
}
