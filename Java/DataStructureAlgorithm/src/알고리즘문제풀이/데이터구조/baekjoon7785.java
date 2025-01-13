package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> workingPeople = new HashSet<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();
            if(action.equals("enter")) {
                workingPeople.add(name);
            } else {
                workingPeople.remove(name);
            }
        }
        List<String> workingPeopleList = new ArrayList<>(workingPeople);
        workingPeopleList.sort(Collections.reverseOrder());
        for(String name : workingPeopleList){
            bw.write(name+"\n");
        }
        bw.close();
    }
}
