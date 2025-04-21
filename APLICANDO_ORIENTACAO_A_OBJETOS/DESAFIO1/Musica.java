public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Cantor: "+ artista);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Média de Avaliação: " + pegaMedia());
        System.out.println("Essa música foi avaliada: " + numeroAvaliacoes + " vezes.");
    }

    void avalia(int nota){
        avaliacao += nota;
        numeroAvaliacoes++;
    }

    double pegaMedia(){
        return avaliacao/numeroAvaliacoes;
    }

}
