package atividadePOO;

public class Funcionario {
    double salarioBase;
    double totalDeVendas;
    double salarioFinal;

    public Funcionario(double salarioBase, double totalDeVendas) {
        this.salarioBase = salarioBase;
        this.totalDeVendas = totalDeVendas;
        
        if (totalDeVendas == 0){
            this.salarioFinal = salarioBase;
        }else if (totalDeVendas <= 10000){
            this.salarioFinal = salarioBase + (totalDeVendas * 0.1);
        }else if (totalDeVendas <= 20000) {
            this.salarioFinal = salarioBase + (totalDeVendas * 0.15);
        }else {
            this.salarioFinal = salarioBase + (totalDeVendas * 0.2);
        }
    }

    public void imprimirAtribuitos(){
        System.out.println("Salário base: " + this.salarioBase);
        System.out.println("Total de vendas: " + this.totalDeVendas);
        System.out.println("Salário final: " + this.salarioFinal);
    }
}
