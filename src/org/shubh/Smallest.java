package org.shubh;
import java.util.Scanner;
public class Smallest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int min= arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("MIn array : "+ min);

    }
}
