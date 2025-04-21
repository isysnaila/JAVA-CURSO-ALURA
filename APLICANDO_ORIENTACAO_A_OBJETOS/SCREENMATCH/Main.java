public class Main {
    public static void main(String[] args) {
        Filme mammaMia = new Filme(); //tipo de referência
        mammaMia.setNome("Mamma Mia");
        mammaMia.setAnoDeLancamento(2008);
        mammaMia.setDuracaoEmMinutos(108);

        mammaMia.exibeFichaTecnica();
        mammaMia.avalia(8);
        mammaMia.avalia(10);
        mammaMia.avalia(9.5);
        System.out.println("O total de avaliações feitas foi: " + mammaMia.getTotalDeAvaliacoes());
        System.out.println(mammaMia.pegaMedia());

    }
}
