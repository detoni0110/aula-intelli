package org.example;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomedocliente;
        double compra = 0.0;
        int opcao = 0;
        int contadorproduto = 0;

        System.out.println("BEM VINDO AO BRANDAO");
        System.out.println("Insira o nome do cliente: ");
        nomedocliente = sc.nextLine();

        while (opcao != 6) {
            System.out.println("Menu de Produtos");
            System.out.println("1 - Arroz - R$ 25,00\n");
            System.out.println(" 2 - Feijão - R$ 10,00\n");
            System.out.println(" 3 - Leite - R$ 8,00\n");
            System.out.println(" 4 - Carne - R$ 40,00\n");
            System.out.println("5 - Ver total da compra\n");
            System.out.println("6 - Finalizar compra!");

            opcao = sc.nextInt();

            if (opcao == 1) {
                compra += 25.00;
                System.out.println("Arroz adicionado.");
            } else if (opcao == 2) {
                compra += 10.00;
                System.out.println("Feijão adicionado.");
            } else if (opcao == 3) {
                compra += 8.00;
                System.out.println("Leite adicionado.");
            } else if (opcao == 4) {
                compra += 40.00;
                System.out.println("Carne adicionada.");
            } else if (opcao == 5) {
                System.out.printf("Total parcial: R$ %.2f\n", compra);
            } else if (opcao == 6) {
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

            double desconto = 0.0;
            if (compra > 100.0) {
                desconto = compra * 0.10;
            }

            double valorfinal = compra - desconto;

            double descontopix = 0.0;

            System.out.println("Selecione la forma payament: ");
            System.out.println("1 - Dinheiro ");
            System.out.println("2 - Piquiso(5% de desconto adicional )");
            System.out.println("3 - Cartão");

            int formaPagamento = 0;
            while (formaPagamento < 1 && formaPagamento > 3) {
                System.out.println("Forma de pagamento inválida! Tente novamente!");
            }

            formaPagamento = sc.nextInt();

            if (formaPagamento == 2) {
                descontopix = valorfinal * 0.05;
                valorfinal -= descontopix;
                System.out.println("Desconto PIX aplicado!");
            } else if (formaPagamento < 1 || formaPagamento > 3) {
                System.out.println("Opção de pagamento inválida! Tente novamente.");
            }

            System.out.println("\nRESUMO DA COMPRA");
            System.out.println("Cliente: " + nomedocliente);
            System.out.println("Total de produtos comprados: " + contadorproduto);
            System.out.printf("Valor da compra original: R$ %.2f \n", compra);
            System.out.printf("Desconto por valor (>R$100): R$ %.2f\n", desconto);
            System.out.printf("Desconto PIX: R$ %.2f\n", descontopix);
            System.out.printf("Valor final a pagar: R$ %.2f\n", valorfinal);

        }

            }












    }












