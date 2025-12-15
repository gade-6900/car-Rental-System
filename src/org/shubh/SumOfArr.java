package org.shubh;
import java.util.*;
public class SumOfArr {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int sum =0;
        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=  sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){

            sum += arr[i];
        }
        System.out.println(sum);

    }
}
