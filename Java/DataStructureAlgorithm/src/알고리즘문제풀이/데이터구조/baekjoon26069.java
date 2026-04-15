package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String CHONGCHONG = "ChongChong";
        int n = Integer.parseInt(br.readLine());
        HashSet<String> dancingPeople = new HashSet<>();
        dancingPeople.add(CHONGCHONG);
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String person1 = st.nextToken();
            String person2 = st.nextToken();
            if (dancingPeople.contains(person1)) dancingPeople.add(person2);
            if (dancingPeople.contains(person2)) dancingPeople.add(person1);
        }
        System.out.println(dancingPeople.size());
    }
}
