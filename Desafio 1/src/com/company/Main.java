package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String spaces ="";
        String character ="";
        for (int i =0; i<n; i++){

            //contagem de espaços//
            for (int j=0;j+i+1<n;j++){spaces+=" ";}
            character+="*";
            System.out.println(spaces+character);
            //reset dos espaços
            spaces ="";
        }
        scanner.close();


    }
}
