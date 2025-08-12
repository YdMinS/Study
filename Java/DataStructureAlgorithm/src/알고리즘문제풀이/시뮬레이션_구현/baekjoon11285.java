package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon11285 {
    private static final List<String> CHOSEONG = List.of(
            "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ",
            "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ",
            "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ",
            "ㅋ", "ㅌ", "ㅍ", "ㅎ"
    );

    private static final List<String> JUNGSEONG = List.of(
            "ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ",
            "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ",
            "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ",
            "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ",
            "ㅣ"
    );

    private static final List<String> JONGSEONG = List.of(
            "", "ㄱ", "ㄲ", "ㄳ", "ㄴ",
            "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ",
            "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ",
            "ㅀ", "ㅁ", "ㅂ", "ㅄ", "ㅅ",
            "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ",
            "ㅌ", "ㅍ", "ㅎ"
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int i=0;
        int sum = 0xAC00;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int index;
            switch (i) {
                case 0 :
                    index = CHOSEONG.indexOf(input);
                    sum += 21 * 28 * index;
                    i++;
                    break;
                case 1 :
                    index = JUNGSEONG.indexOf(input);
                    sum += 28 * index;
                    i++;
                    break;
                case 2 :
                    index = JONGSEONG.indexOf(input);
                    sum += index;
                    i++;
                    break;
            }
        }
        System.out.println((char)sum);
    }
}
