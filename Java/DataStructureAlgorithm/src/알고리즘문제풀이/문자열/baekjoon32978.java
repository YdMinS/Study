package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon32978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> ingredientList = new ArrayList<>();
        StringTokenizer plannedIngredients = new StringTokenizer(br.readLine());
        StringTokenizer usedIngredients = new StringTokenizer(br.readLine());
        while(plannedIngredients.hasMoreTokens()){
            ingredientList.add(plannedIngredients.nextToken());
        }
        while(usedIngredients.hasMoreTokens()){
            ingredientList.remove(usedIngredients.nextToken());
        }
        System.out.println(ingredientList.get(0));
    }
}
