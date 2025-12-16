package org.shubh;

import java.util.Scanner;

public class MoveZerosToEnd {
    static void moveToLast(int[]arr ){
    int index =0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[index]=arr[i];
            index++;
        }
    }
        for(int i=index;i< arr.length;i++){
            arr[i]=0;
    }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter arry elements: ");
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        moveToLast(arr);
        System.out.print("Move Zeros : ");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
