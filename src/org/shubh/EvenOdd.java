package org.shubh;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String argsp[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int even =0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2 ==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even : "+ even);
        System.out.println("Odd : "+ odd);
    }
}
