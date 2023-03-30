package atividadePOO;

import java.util.Scanner;

public class TesteImovel {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o endereço do imóvel: ");
        String endereco = sc.nextLine();

        System.out.println("Digite o valor venal do imóvel: ");
        double valorVenal = sc.nextDouble();

        Imovel imovel = new Imovel(endereco, valorVenal);
        imovel.imprimirDados();
    
        sc.close();
    }
    
}

