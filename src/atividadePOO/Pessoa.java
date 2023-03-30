package atividadePOO;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    int idade;
    
    public Pessoa (int diaNascimento, int mesNascimento, int anoNascimento) {
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.idade = calcularIdade();
    }

    private int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(this.anoNascimento, this.mesNascimento, this.diaNascimento);
        return Period.between(dataNascimento, hoje).getYears();
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public int getIdade() {
        return idade;
    }
}
