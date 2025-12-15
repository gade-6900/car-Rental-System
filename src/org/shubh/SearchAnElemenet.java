package org.shubh;

import java.util.Scanner;

public class SearchAnElemenet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Eneter array elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Search Key: ");
        int searchKey = sc.nextInt();
        boolean found = false;

        for(int i=0;i<arr.length;i++){
        if(arr[i] == searchKey){
            found=true;
            break;
        }
        }
        if(found){
            System.out.println("Elements found: "+ searchKey);
        }
        else{
            System.out.println("Elements not found: "+ searchKey);
        }
    }
}
