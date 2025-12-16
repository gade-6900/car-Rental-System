package org.shubh;

import java.util.Scanner;

public class FindSecondLargElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Eneter array elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax =max;
                max = arr[i];

            }
            else if(arr[i]>secondmax && arr[i] !=max){
                secondmax = arr[i];
            }
        }
        System.out.println("Second Max : " + secondmax);
    }
}
