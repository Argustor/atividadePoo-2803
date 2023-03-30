package atividadePOO;

public class Produto {
    private int codigo;
    private String descricao;
    private double precoUnitario;
    private int quantidadeEstoque;

    public Produto(int codigo, String descricao, double precoUnitario, int quantidadeEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double calcularValorEstoque() {
        return precoUnitario * quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        quantidadeEstoque -= quantidade;
    }
    
}
