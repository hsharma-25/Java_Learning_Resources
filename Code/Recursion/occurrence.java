//FINDS FIRST AND LAST OCCURRENCE(INDEX) OF GIVEN CHAR IN STRING
import java.util.*;
public class occurrence {
    public static int first = -1;
    public static int last = -1;

    public static void findOcc(String str, int idx, char el){
        if(idx == str.length()){

            System.out.print("First occurrence at index: ");
            System.out.println(first);

            System.out.print("Last occurrence at index: ");
            System.out.println(last);

            return;

        }
        if(str.charAt(idx) == el){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOcc(str,idx+1,el);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter char: ");
        char el = sc.next().charAt(0);

        findOcc(str, 0, el);
    }
}
