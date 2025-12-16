package org.shubh;

import java.util.Scanner;
public class RevTwoPointer {
    static void Revrse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }


    }

        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter size: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.print("Enter array: ");
            for(int i=0;i<size;i++){
                arr[i] =sc.nextInt();
            }
            Revrse(arr);
        }
}

