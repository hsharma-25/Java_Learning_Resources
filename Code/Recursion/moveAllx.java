import java.util.*;
public class moveAllx {
    public static void moveX(String str, int idx, int count, String newStr){

        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        if(str.charAt(idx) == 'x'){
            count++;
            moveX(str,idx+1,count,newStr);
        }
        else{
            newStr += str.charAt(idx);
            moveX(str,idx+1,count,newStr);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        moveX(str,0,0,"");
    }
}
