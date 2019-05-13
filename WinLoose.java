package com.codingblocks;

import java.util.Arrays;
import java.util.Scanner;

public class WinLoose {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String res[] = new String[T];
        int count = 0;
        in.nextLine();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            in.nextLine();
            String stregth = in.nextLine();
            String[] strenghtnums = stregth.split(" ");
            String energy = in.nextLine();
            String[] energynums = energy.split(" ");
            int[] strengtharr = new int[N];
            int[] energyarr = new int[N];
            for (int j = 0; j < N; j++) {
                strengtharr[j] = Integer.parseInt(strenghtnums[j]);
                energyarr[j] = Integer.parseInt(energynums[j]);
            }
            Arrays.sort(strengtharr);
            Arrays.sort(energyarr);


            String answer="WIN";


            for (int k = 0; k <strengtharr.length ; k++) {
                if(energyarr[k] < strengtharr[k]){
                    answer = "LOSE";
                    break;
                }
            }
            res[count] = answer;
            count++;
        }


        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }

        }
}
