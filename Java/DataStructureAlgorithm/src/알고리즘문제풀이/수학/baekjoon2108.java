package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2108 {
    public static void main(String[] args) throws IOException{
        List<Integer> numList = input();
        System.out.println(calculateAverage(numList));
        System.out.println(findMiddleValue(numList));
        System.out.println(findMode(numList));
        System.out.println(findRange(numList));
    }

    private static List<Integer> input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<N; i++){
            result.add(Integer.parseInt(br.readLine()));
        }
        return result;
    }

    private static int calculateAverage(List<Integer> numList){
        long sum = 0;
        for(int num : numList){
            sum+=num;
        }
        return (int)Math.round((double)sum/numList.size());
    }

    private static int findMiddleValue(List<Integer> numList){
        List<Integer> numListToUse = new ArrayList<>(numList);
        Collections.sort(numListToUse);
        return numListToUse.get(numList.size()/2);
    }

    private static int findMode(List<Integer> numList){
        Map<Integer, Integer> numCntMap = new HashMap<>();
        for(int num : numList){
            numCntMap.put(num, numCntMap.getOrDefault(num, 0)+1);
        }
        int maxCount = Collections.max(numCntMap.values());
        List<Integer> resultCandidates = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : numCntMap.entrySet()){
            if(entry.getValue() == maxCount){
                resultCandidates.add(entry.getKey());
            }
        }
        Collections.sort(resultCandidates);
        return resultCandidates.size() > 1 ? resultCandidates.get(1) : resultCandidates.get(0);
    }

    private static int findRange(List<Integer> numList){
        return Collections.max(numList) - Collections.min(numList);
    }
}
