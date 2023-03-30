package atividadePOO;

public class Imovel {
    
    private String endereco;
    private double valorVenal;
    private double valorVenda;
    private final double taxa = 0.2;

public Imovel(String endereco, double valorVenal) {
    this.endereco = endereco;
    this.valorVenal = valorVenal;
    this.valorVenda = valorVenal * (1 + taxa);
}

public void imprimirDados(){
    System.out.println("Endereço: " + endereco);
    System.out.println("Valor Venal: R$" + valorVenal);
    System.out.println("Valor Venda: R$" + valorVenda);
}

}
