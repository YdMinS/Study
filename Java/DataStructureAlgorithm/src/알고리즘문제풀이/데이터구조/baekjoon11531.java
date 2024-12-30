package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon11531 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> attemptsByProblem = new HashMap();
        int score = 0;
        int solvedProblem = 0;
        int currentTime = Integer.parseInt(st.nextToken());
        while(currentTime!=-1){
            String problem = st.nextToken();
            String result = st.nextToken();
            if(!attemptsByProblem.containsKey(problem)){
                attemptsByProblem.put(problem, 1);
            } else {
                int trials = attemptsByProblem.get(problem);
                attemptsByProblem.put(problem, trials + 1);
            }
            if(result.equals("right")){
                solvedProblem ++;
                int trials = attemptsByProblem.get(problem);
                score += currentTime + (trials-1)*20;
            }
            st = new StringTokenizer(br.readLine());
            currentTime = Integer.parseInt(st.nextToken());
        }
        System.out.println(String.format("%d %d", solvedProblem, score));
    }
}
