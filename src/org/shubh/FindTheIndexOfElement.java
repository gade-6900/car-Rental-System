package org.shubh;

import java.util.Scanner;

public class FindTheIndexOfElement {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int size= sc.nextInt();

        int[] arr =new int[size];
        System.out.print("eneter array elements: ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Eneter array to search which index it hold: ");
        int key = sc.nextInt();
        int index =-1;

        for(int i=0;i< arr.length;i++) {
            if(arr[i] == key){
                index =i;
                break;
            }
        }
        System.out.println(index + " at the Index");
    }
}
