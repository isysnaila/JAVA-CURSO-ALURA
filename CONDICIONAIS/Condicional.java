package CONDICIONAIS;
import java.util.Scanner;

public class Condicional {
    public static void main(String[] args){
        int anoDeLancamento;
        boolean incluidoNoPlano = true;
        double notaDoFilme;
        String tipoPlano = "plus";

        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual o nome do filme?");
        String nome = leitura.nextLine();
        System.out.println("Qual o ano de lançamento do filme?");
        anoDeLancamento = leitura.nextInt();
        System.out.println("Qual nota você dá para esse filme?");
        notaDoFilme = leitura.nextDouble();

        System.out.println("O filme "+ nome + " foi lançado em " + anoDeLancamento + " e sua nota é " + notaDoFilme);
        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }
        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação.");
        }
    }
}