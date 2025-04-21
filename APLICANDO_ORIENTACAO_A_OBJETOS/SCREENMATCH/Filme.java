public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome de Filme: " + nome);
        System.out.println("Ano de Lançamento: "+ anoLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos.");
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }
}