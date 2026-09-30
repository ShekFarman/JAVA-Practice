package Elite_Trainning;

import java.util.Scanner;

public class Climbing_leader_board {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size");
        int rn = sc.nextInt();

        System.out.println("enter size");
        int pn = sc.nextInt();

        int[] ranked = new int[rn];
        int[] player = new int[pn];

        System.out.println("enter elements");
        for(int i = 0; i < rn; i++) {
            ranked[i] = sc.nextInt();
        }

        System.out.println("enter elements");
        for(int i = 0; i < pn; i++) {
            player[i] = sc.nextInt();
        }

        for(int k = 0; k < pn; k++) {
            int rank = 1;
            for(int j = 0; j < rn; j++) {
                if( j>0 && ranked[j] == ranked[j - 1]) {
                    continue;
                }
                if(player[k] < ranked[j]) {
                    rank++;
                }
                else {
                    break;
                }
            }

            System.out.println(rank);
        }
    }
}