
//Removes Duplicates from given string.

import java.util.*;
public class removeDuplicates {
    public static boolean[] map = new boolean[26];

    public static void removeDup(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println("String without duplicates: "+newStr);
            return;
        }

        if(map[str.charAt(idx) - 'a']){
            removeDup(str,idx+1,newStr);
        }
        else{
            map[str.charAt(idx) - 'a'] = true;
            newStr += str.charAt(idx);
            removeDup(str,idx+1,newStr);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        removeDup(str,0,"");
    }
}
