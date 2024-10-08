package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon10814 {
    static class Member implements Comparable<Member>{
        int age;
        String name;
        int order;

        public Member(int age, String name, int order){
            this.age = age;
            this.name = name;
            this.order = order;
        }

        @Override
        public int compareTo(Member other) {
            int ageCompareTo = this.age - other.age;
            if(ageCompareTo ==0){
                return this.order - other.order;
            }
            return ageCompareTo;
        }
    }

    static int N;
    static List<Member> list = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        input();
        Collections.sort(list);
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Member(age, name, i+1));
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(Member member : list){
            bw.append(String.format("%d %s\n", member.age, member.name));
        }
        bw.flush();
        bw.close();
    }
}
