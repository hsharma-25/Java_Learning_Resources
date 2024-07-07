
//Prints all possible subsequences of given string.

import java.util.*;
import java.util.HashSet;
public class Subsequences {
    public static void printSub(String str, int idx, String newStr, HashSet<String> set){

        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currChar = str.charAt(idx);
        //to be
        printSub(str,idx+1,newStr+currChar,set);
        //or not to be
        printSub(str,idx+1,newStr,set);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        printSub(str,0,"", set);
    }
}
