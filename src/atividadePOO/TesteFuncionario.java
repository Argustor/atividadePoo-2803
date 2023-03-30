package atividadePOO;
import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário base: ");
        double salarioBase = sc.nextDouble();
        System.out.println("Digite o total de vendas: ");
        double totalDeVendas = sc.nextDouble();

        Funcionario funcionario = new Funcionario(salarioBase, totalDeVendas);
        funcionario.imprimirAtribuitos();

        sc.close();
    }
}
