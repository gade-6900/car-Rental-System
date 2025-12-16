package org.shubh;

import java.util.Scanner;

public class CountFrequency {
    public static void main(String ars[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array elemnts: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Count(arr);

    }

    static void Count(int[] arr){
    for(int i=0;i<arr.length;i++){
        int count=1;

        if(arr[i] ==-1)
            continue;

            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println(arr[i]+ "-->"+count);

    }
    }

}
