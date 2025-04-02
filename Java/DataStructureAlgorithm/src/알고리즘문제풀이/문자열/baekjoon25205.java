package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon25205 {
    private static Set<Character> vowelSet = new HashSet<>();
    static{
        vowelSet.add('y');
        vowelSet.add('u');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('p');
        vowelSet.add('h');
        vowelSet.add('j');
        vowelSet.add('k');
        vowelSet.add('l');
        vowelSet.add('b');
        vowelSet.add('n');
        vowelSet.add('m');
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String name = br.readLine();
        System.out.print(vowelSet.contains(name.charAt(N-1)) ? 0 : 1);
    }
}
