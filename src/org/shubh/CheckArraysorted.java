package org.shubh;

import java.util.Scanner;

public class CheckArraysorted {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Eneter siz");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }

        boolean sorted = true;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }

        if(sorted){
            System.out.println("Array is sorted ");
        }
        else{
            System.out.println("Arrays is not sorted: ");
        }

    }
}
