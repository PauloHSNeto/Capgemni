package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String character ="";
        for (int i =0; i<n; i++){
            character+="*";
            System.out.println(character);
        }
        scanner.close();


    }
}
