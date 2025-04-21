public class Carro {
    String modelo;
    int ano;
    String cor;
    int idadeCarro;

    void calculaIdade(int anoAtual){
        idadeCarro = anoAtual-ano;
    }

    void exibeFichaTecnica(){
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade do carro: " + idadeCarro + " anos.");

    }



}
