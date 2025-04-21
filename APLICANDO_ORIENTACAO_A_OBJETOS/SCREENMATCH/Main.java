public class Main {
    public static void main(String[] args) {
        Filme mammaMia = new Filme(); //tipo de referência
        mammaMia.nome = "Mamma Mia";
        mammaMia.anoLancamento = 2008;
        mammaMia.duracaoEmMinutos = 108;

        mammaMia.exibeFichaTecnica();
        mammaMia.avalia(8);
        mammaMia.avalia(10);
        mammaMia.avalia(9.5);
        System.out.println("A soma das avaliações é: "+ mammaMia.somaDasAvaliacoes);
        System.out.println("O total de avaliações feitas foi: " + mammaMia.totalAvaliacoes);
        System.out.println(mammaMia.pegaMedia());

    }
}
