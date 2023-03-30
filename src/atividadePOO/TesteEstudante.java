package atividadePOO;

import java.util.Scanner;

public class TesteEstudante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota do estudante 1: ");
        double nota1Estudante1 = sc.nextDouble();
        System.out.print("Digite a segunda nota do estudante 1: ");
        double nota2Estudante1 = sc.nextDouble();

        System.out.print("Digite a primeira nota do estudante 2: ");
        double nota1Estudante2 = sc.nextDouble();
        System.out.print("Digite a segunda nota do estudante 2: ");
        double nota2Estudante2 = sc.nextDouble();

        Estudante estudante1 = new Estudante(nota1Estudante1, nota2Estudante1);
        Estudante estudante2 = new Estudante(nota1Estudante2, nota2Estudante2);

        System.out.printf("Estudante 1 - Nota 1: %.2f | Nota 2: %.2f | Média: %.2f\n",
                estudante1.getNotaUm(), estudante1.getNotaDois(), estudante1.getMedia());
        System.out.printf("Estudante 2 - Nota 1: %.2f | Nota 2: %.2f | Média: %.2f\n",
                estudante2.getNotaUm(), estudante2.getNotaDois(), estudante2.getMedia());

        sc.close();
    }
}
