package org.shubh;

import java.util.Scanner;

public class UnsortedDuplicateRemove {
    static void unsortedDupliacteRemove(int[] arr){
        for(int i=0;i< arr.length;i++){
                if(arr[i]==-1) continue;

                for(int j=i+1;j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        arr[j] = -1;
                    }
                }
        }
        for(int x: arr){
            if(x!=-1) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        unsortedDupliacteRemove(arr);
    }
}
