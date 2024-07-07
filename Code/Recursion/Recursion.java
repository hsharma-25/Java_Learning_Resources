
//Basic Recursion Program

import java.util.*;
public class Recursion {
    public static int printN(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpnm1 = printN(x,n-1);
        int xpn = x * xpnm1;
        return xpn;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans = printN(x,n);
        System.out.println(ans);
    }
}

