package LAÇOSDEREPETICAO;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(50);
        int tentativa = 0;
        int numeroDigitado = 0;
        while (tentativa<5) {
            System.out.println("Adivinhe um numero entre 0 a 50:");
            numeroDigitado = entrada.nextInt();
            tentativa++;

            if (numeroDigitado==numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
            } else if (numeroDigitado<numeroAleatorio) {
                System.out.println("O número digitado é menor do que o número gerado.");
            } else if (numeroDigitado>numeroAleatorio) {
                System.out.println("O número digitado é maior do que o número gerado.");
            }
        }

        if (tentativa==5 && numeroDigitado!=numeroAleatorio) {
            System.out.println("Você não conseguiu adivinhar. O número era: " + numeroAleatorio);
        }
    }
}
