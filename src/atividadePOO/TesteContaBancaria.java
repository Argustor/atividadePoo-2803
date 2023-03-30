package atividadePOO;

import java.util.Scanner;

public class TesteContaBancaria {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o nome do titular: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

        conta.imprimirDados();

        sc.close();
    }
}
