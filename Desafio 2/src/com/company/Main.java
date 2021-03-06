package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();
        String special="!@#$%^&*()-+";
        //contagem de digitos faltando
        int faltas =4;
        boolean hasDigit =false,hasUppercase=false, hasLowercase=false, hasSpecial=false;
        if (senha.matches(".*[0-9].*")){hasDigit=true;faltas--;}
        if (senha.matches(".*[A-Z].*")){hasLowercase=true;faltas--;}
        if (senha.matches(".*[a-z].*")){hasUppercase=true;faltas--;}
        if (senha.matches(special)){hasSpecial=true;faltas--;}

        //conferir se a senha é valida
        if (senha.length()>=6 && hasDigit && hasUppercase && hasSpecial && hasLowercase){
        System.out.println("Senha é valida");}
        //caso falte no minimo 3 letras
        else if (6-senha.length()>3){
            System.out.println(6-senha.length());
        }else {System.out.println(faltas);}

    }

}


/*
Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o
preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela
satisfaz os seguintes critérios:
        Possui no mínimo 6 caracteres.
        Contém no mínimo 1 digito.
        Contém no mínimo 1 letra em minúsculo.
        Contém no mínimo 1 letra em maiúsculo.
        Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
        Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para
        ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados
        para uma string qualquer ser considerada segura.
*/