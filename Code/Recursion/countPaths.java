
//Gives the no. of the paths possible to reach a given cell in a matrix starting from (0,0).

public class countPaths {
    public static int countP(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }

        int downP = countP(i+1,j,n,m);

        int rightP = countP(i,j+1,n,m);

        return downP + rightP;

    }

    public static void main(String[] args){
        int n = 3, m = 3;
        int ans = countP(0,0,n,m);
        System.out.println(ans);
    }
}
