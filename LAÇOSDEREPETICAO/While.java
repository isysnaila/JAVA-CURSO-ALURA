package LAÇOSDEREPETICAO;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int contador = 0;

        while (nota != -1){
            System.out.println("Digite a nota ou -1 para encerrar");
            nota = leitura.nextDouble();
            if (nota != -1) {
                media+=nota;
                contador++;
                
            } 
            
        }

        System.out.println("Média de Avaliações: " + media/contador);

    }
}
