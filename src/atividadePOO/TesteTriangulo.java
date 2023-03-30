package atividadePOO;

import java.util.Scanner;

public class TesteTriangulo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double ladoA = sc.nextDouble();
        System.out.print("Digite o lado B: ");
        double ladoB = sc.nextDouble();
        System.out.print("Digite o lado C: ");
        double ladoC = sc.nextDouble();
        

        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);

        System.out.println("Lado A: " + triangulo.getLadoA());
        System.out.println("Lado B: " + triangulo.getLadoB());
        System.out.println("Lado C: " + triangulo.getLadoC());
        System.out.println("Tipo do Triangulo: " + triangulo.getTipoTriangulo());
    }
}
