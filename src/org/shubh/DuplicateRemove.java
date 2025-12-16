package org.shubh;

import java.util.Scanner;

public class DuplicateRemove {
    static void dupliacteRemove(int[] arr){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        for(int i=0;i<=j;i++){
    System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter size: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        dupliacteRemove(arr);
    }
}
