public class Filme {
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getAnoDeLancamento(){
        return anoLancamento;
    }

    public void setAnoDeLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalAvaliacoes;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome de Filme: " + nome);
        System.out.println("Ano de Lançamento: "+ anoLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos.");
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }
}