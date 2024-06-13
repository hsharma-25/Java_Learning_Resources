//CHECKS IF ARRAY IS STRICTLY INCREASING OR NOT
import java.util.*;
public class isSorted {
    public static boolean sorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] >= arr[idx+1]){
            return false;
        }
        return sorted(arr, idx+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if(sorted(arr,0)){
            System.out.println("Array is strictly increasing.");
        }
        else{
            System.out.println("Array is not strictly increasing.");

        }
    }
}
