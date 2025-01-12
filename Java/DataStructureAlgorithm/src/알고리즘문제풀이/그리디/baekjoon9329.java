package 알고리즘문제풀이.그리디;

import java.util.*;
import java.io.*;

public class baekjoon9329 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static Reward[] rewards;
    private static int[] stickerCounts;

    private static class Reward{
        int[] stickers;
        int value;

        Reward(int[] stickers, int value){
            this.stickers = stickers;
            this.value = value;
        }

        double getEfficiency(){
            return (double) value / stickers.length;
        }
    }

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            input();
            Arrays.sort(rewards, (a, b)-> Double.compare(b.getEfficiency(), a.getEfficiency()));
            execute();
        }
        bw.close();
    }

    private static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        rewards = new Reward[n];
        for(int j=0; j<n; j++){
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int[] stickers = new int[k];
            for(int l=0; l<k; l++){
                stickers[l] = Integer.parseInt(st.nextToken());
            }
            int price = Integer.parseInt(st.nextToken());
            rewards[j] = new Reward(stickers, price);
        }
        st = new StringTokenizer(br.readLine());
        stickerCounts = new int[m+1];
        for(int i=1; i<=m; i++){
            int sticker = Integer.parseInt(st.nextToken());
            stickerCounts[i] = sticker;
        }
    }

    private static void execute() throws IOException{
        long totalReward = 0;
        for(Reward reward : rewards){
            int maxExchange = Integer.MAX_VALUE;
            for(int sticker : reward.stickers){
                maxExchange = Math.min(maxExchange, stickerCounts[sticker]);
            }

            totalReward += (long) maxExchange * reward.value;

            for(int sticker : reward.stickers){
                stickerCounts[sticker] -= maxExchange;
            }
        }
        bw.write(totalReward + "\n");
    }
}