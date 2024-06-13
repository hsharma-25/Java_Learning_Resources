//PRINTS THE STEPS REQUIRED TO SOLVE THE TOWER OF HANOI FOR A GIVEN NUMBER OF DISKS
import java.util.*;
public class TowerHanoi {
    public static void hanoi(int n, String src, String hel, String des){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+des);
            return;
        }
        hanoi(n-1,src,des,hel);
        System.out.println("Transfer disk "+n+" from "+src+" to "+des);
        hanoi(n-1,hel,src,des);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of disks: ");
        int n = sc.nextInt();

        hanoi(n, "Source", "Helper", "Destination");
    }
}
