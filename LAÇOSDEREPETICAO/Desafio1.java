package LAÇOSDEREPETICAO;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        

        /*Peça ao usuário para inserir dois números inteiros. 
        Compare os números e imprima uma mensagem indicando se são iguais, 
        diferentes, o primeiro é maior ou o segundo é maior.*/
        System.out.println("Insira o primeiro número:");
        int num1 = entrada.nextInt();
        System.out.println("Insira o segundo número:");
        int num2 = entrada.nextInt();

        if (num1>num2) {
            System.out.println("O primeiro número é maior.");
        } else if (num1<num2) {
            System.out.println("O segundo número é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }
        /*Crie um menu que oferece duas opções ao usuário: 
        "1. Calcular área do quadrado" e "2. Calcular área do círculo". 
        Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/
         int escolha = 0;
        
        while(escolha!=3){
            System.out.println("------------MENU-------------");
            System.out.println("1 - Calcular área do quadrado");
            System.out.println("2 - Calcular área do círculo ");
            System.out.println("3 - Encerrar o programa.-----");
            System.out.println("-----------------------------");
            System.out.println("Escolha uma opção:");
            escolha = entrada.nextInt();

            if (escolha==1) {
                System.out.println("Insira a medida do lado do quadrado:");
                double lado = entrada.nextDouble();

                double area = lado*lado;
                System.out.println("A área do quadrado equivale a: "+area);
            } else if (escolha==2) {
                System.out.println("Insira o raio do círculo: ");
                double raio = entrada.nextDouble();

                double areaCirculo = 3.14 * raio * raio;
                System.out.println("A área do círculo equivale a: " + areaCirculo);
            } else if (escolha==3) {
                System.out.println("PROGRAMA ENCERRADO");
            } else {
                System.out.println("Insira uma opção válida.");
            }
        }

        /*Crie um programa que solicite ao usuário um número e exiba a tabuada 
        desse número de 1 a 10.*/

        System.out.println("Insira um número para ver a tabuada: ");
        int numTabuada = entrada.nextInt();

        System.out.println("-------TABUADA--------");
        for(int i = 1; i <= 10; i++ ){
            System.out.println(numTabuada +" X " + i + " = " + numTabuada*i);
        }

        //fatorial
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
            
        
    }
}
