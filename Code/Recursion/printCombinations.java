
//Prints all the possible outputs of a given keypad number combination.

import java.util.*;
public class printCombinations {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++){
            printComb(str, idx+1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter keypad number combination: ");
        String str = sc.nextLine();
        printComb(str,0,"");
    }
}
