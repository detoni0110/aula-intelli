package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Arrays;

public class Atividades {

    public static void main(String[] args) {
        /*
        criar duas variaveis a e b e exibir o resultado
        de soma entre elas
         */


//           int a = 2;
//        int b = 2;
//
//        int soma = a + b;
//        int multiplicacao = a * b;
//        int divisao = a / b;
//        int subtracao = a - b;
//
//        System.out.println(soma);
//        System.out.println(multiplicacao);
//        System.out.println(divisao);
//        System.out.println(subtracao);

//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o sua idade: ");
//        int idade = sc.nextInt();
//
//        if (idade >= 18){
//            System.out.println("Você é maior de idade!");
//        } else {
//            System.out.println("Você é menor de idade!");
//        }

//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Quantos reais você tem na carteira hoje? ");
//        double reais = sc.nextDouble();
//
//        System.out.print("Qual é a cotação do dólar hoje? ");
//        double cotaçãodolar = sc.nextDouble();
//
//        double dolares = reais / cotaçãodolar;
//
//        System.out.printf("Com R$ " + reais + "Você pode comprar U$" + dolares);

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite a largura da parede: ");
//        double largura = sc.nextDouble();
//
//        System.out.println("Digite a altura da parede");
//        double altura = sc.nextDouble();
//
//        double area = largura * altura;
//        double litros = area / 2;
//
//        System.out.println("Área da parede: " + area + " metros quadrados.");
//        System.out.println("Quantidade de tinta necessária: " + litros + " litros.");

    Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        double distancia = sc.nextDouble();

        System.out.println("Digite o total de combustivel gasto em litros: ");
        double combustivel = sc.nextDouble();

        double consumo = distancia / combustivel;


        System.out.printf("O consumo médio do seu carro é de: %.2f Km/l", consumo);






    }
}