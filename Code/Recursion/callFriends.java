
//Prints all the possible ways to call a given no. of friends.

public class callFriends {
    public static int callF(int n){

        if(n <= 1){
            return 1;
        }

        int ways1 = callF(n-1);
        int ways2 = (n-1) * callF(n-2);

        return ways1 + ways2;
    }

    public static void main(String[] args){
        int n = 4;
        System.out.println(callF(n));
    }
}
