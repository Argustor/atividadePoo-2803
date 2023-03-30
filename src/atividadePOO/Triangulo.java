package atividadePOO;
import java.util.Scanner;


public class Triangulo {
    private double ladoA, ladoB, ladoC;
    private String tipoTriangulo;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        if (ladoA >= ladoB + ladoC || ladoB >= ladoA + ladoC || ladoC >= ladoA + ladoB) {
            tipoTriangulo = "Inválido";
        } else if (ladoA == ladoB && ladoB == ladoC) {
            tipoTriangulo = "Valido-Equilátero";
        }else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
            tipoTriangulo = "Valido-Escaleno";
        } else {
            tipoTriangulo = "Valido-Isósceles";
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    public String getTipoTriangulo() {
        return tipoTriangulo;
    }
    public double getLadoA() {
        return ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public double getLadoC() {
        return ladoC;
    }
}

