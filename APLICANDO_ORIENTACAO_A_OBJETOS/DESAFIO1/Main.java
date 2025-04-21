public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibeMensagem();

        System.out.println("----------------------------------------------");

        Calculadora calculadora1 = new Calculadora();
        System.out.println(calculadora1.dobraNumero(20));
        
        System.out.println("----------------------------------------------");

        Musica musica1 = new Musica();
        musica1.titulo = "Empty Space";
        musica1.artista = "James Arthur";
        musica1.anoDeLancamento = 2019;
        musica1.avalia(10);
        musica1.avalia(8);
        musica1.exibeFichaTecnica();

        System.out.println("----------------------------------------------");

        Carro carro1 = new Carro();
        carro1.modelo = "Fiat";
        carro1.ano = 2000;
        carro1.cor = "Vermelho";
        carro1.calculaIdade(2025);
        carro1.exibeFichaTecnica();
    }
}
