package BroCode_Project;

import java.util.*;

public class ArrayInput {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the number of integers you want to store: ");
       int n = scanner.nextInt();
       System.out.print("Enter the elements here: ");
       int[] arr = new int[n];
       for(int i = 0; i < arr.length; i++){
           arr[i] = scanner.nextInt();
       }

       System.out.println("The elements entered are: ");
       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + " ");
       }
       scanner.close();
    }
}
