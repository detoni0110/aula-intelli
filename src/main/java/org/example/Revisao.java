package org.example;

import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {

        int inteiro = 1;
        double decimais = 1.1;
        boolean boleano = true;
        String texto = "texto";

        int idade = 18;
        if (idade >= 18){
            System.out.println("Maior de idade");
        } else if (idade < 18 && idade > 11) {
            System.out.println("Adolescente");
            } else {
            System.out.println("Menor de idade");

        }
        /* Em java a a estrutura do for muda um pouco em relacao ao phyton temos que
        passar algumas cndiceos a ais sendo ela a contador a condicao e o incremento
        o while segue o mesmo principio do python nao havendo mudancas significativas


         */

//for(contador;condicao;incremento){}
        for(int i = 0; i < 10; i++){
            System.out.println(i);

        }

        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua cidade de nascimento");
        String cidade = sc.nextLine();


    }

}

