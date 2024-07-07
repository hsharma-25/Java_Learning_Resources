
//Prints all permutations of a string.

public class printPermutations {
    public static void printPerm(String str, String perm){
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPerm(newStr,perm+currChar);
        }
    }

    public static void main(String[] args){
        String str ="abc";
        printPerm(str,"");
    }
}
