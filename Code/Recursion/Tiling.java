
//Prints the no. of ways possible to place tiles

import java.util.*;
public class Tiling {
    public static int placeT(int n, int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int horP = placeT(n-1, m);
        int verP = placeT(n-m, m);

        return horP + verP;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(placeT(n,m));
    }
}
