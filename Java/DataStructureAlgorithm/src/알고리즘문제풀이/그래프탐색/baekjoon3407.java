package 알고리즘문제풀이.그래프탐색;

import java.io.*;
import java.util.*;

public class baekjoon3407 {
    static Set<String> atomSet = new HashSet();
    static {
        String atoms = "H He Li Be B C	N O	F Ne Na	Mg Al Si P S Cl	Ar K Ca	Sc Ti "+
                       "V Cr Mn Fe Co Ni Cu Zn Ga Ge As Se Br Kr Rb Sr Y Zr	Nb Mo "+
                       "Tc Ru Rh Pd	Ag Cd In Sn	Sb Te I Xe Cs Ba Hf Ta W Re Os Ir "+
                       "Pt Au Hg Tl Pb Bi Po At Rn Fr Ra Rf Db Sg Bh Hs Mt Ds Rg Cn "+
                       "Fl Lv La Ce Pr Nd Pm Sm Eu Gd Tb Dy Ho Er Tm Yb Lu Ac Th Pa "+
                       "U Np Pu Am Cm Bk Cf Es Fm Md No Lr";
        StringTokenizer st = new StringTokenizer(atoms);
        while(st.hasMoreTokens()){
            atomSet.add(st.nextToken().toLowerCase());
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            boolean isPronounceable = false;
            for(int j=1; j<=2; j++){
                if(dfs(str, 0)){
                    isPronounceable = true;
                    break;
                }
            }
            System.out.println(isPronounceable ? "YES" : "NO");
        }
        br.close();
    }

    private static boolean dfs(String str, int s){
        if(s == str.length()){
            return true;
        }
        for(int e = s+1; e<=s+2 && e <=str.length(); e++){
            if(atomSet.contains(str.substring(s,e)) && dfs(str, e)){
                return true;
            }
        }
        return false;
    }
}
