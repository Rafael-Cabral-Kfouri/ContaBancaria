import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("*******************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("*******************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atual é: " + saldo);
            } else if (opcao == 2)  {
                System.out.println("Digite o valor que deseja transferir: ");
                double transferencia = leitura.nextInt();
                if (saldo >= transferencia){
                    saldo -= transferencia;
                    System.out.println("O saldo atual é: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }

            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double recebido = leitura.nextInt();
                saldo += recebido;
                System.out.println("O saldo atual é: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida.");
            }

        }

    }
}