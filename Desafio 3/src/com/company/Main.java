package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String palavra = scanner.nextLine();
        //checar o numero de letras duplicadas
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i+1; j < palavra.length(); j++){
                if (palavra.charAt(j)==palavra.charAt(i)){count++;break;}
            }
        }
        System.out.println(count);



    }

}

/*# Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar
 a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são
  anagramas.
*/