package atividadePOO;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[50];

        for (int i = 0; i < 50; i++) {
            System.out.println("Digite o dia de nascimento da pessoa " + (i + 1));
            int diaNascimento = sc.nextInt();
            System.out.println("Digite o mês de nascimento da pessoa " + (i + 1));
            int mesNascimento = sc.nextInt();
            System.out.println("Digite o ano de nascimento da pessoa " + (i + 1));
            int anoNascimento = sc.nextInt();

            pessoas[i] = new Pessoa(diaNascimento, mesNascimento, anoNascimento);
        }

        for (int i = 0; i < 50; i++) {
            System.out.printf("Pessoa %d - Data de Nascimento: %02d/%02d/%04d - Idade: %d anos\n",
            i+1, pessoas[i].getDiaNascimento(), pessoas[i].getMesNascimento(), pessoas[i].getAnoNascimento(), pessoas[i].getIdade());
        }

        sc.close();
    }
}
