//REVERSE A STRING USING RECURSION
import java.util.*;
public class reverse_string {
    public static void revString(String str, int x){
        if(x==0){
            System.out.println(str.charAt(x));
            return;
        }
        System.out.print(str.charAt(x));
        revString(str,x-1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = str.length();

        revString(str, x-1);
    }
}
