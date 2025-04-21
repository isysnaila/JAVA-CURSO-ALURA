public class Main {
    public static void main(String[] args) {
        Filme mammaMia = new Filme(); //tipo de referência
        mammaMia.setNome("Mamma Mia");
        mammaMia.setAnoDeLancamento(2008);
        mammaMia.setDuracaoEmMinutos(108);
        mammaMia.setDiretor("Phyllida Lloyd");

        mammaMia.avalia(8);
        mammaMia.avalia(10);
        mammaMia.avalia(9.5);
        mammaMia.exibeFichaTecnica();


        Serie fleabag = new Serie();
        fleabag.avalia(10);
        fleabag.avalia(8);
        fleabag.setNome("Fleabag");
        fleabag.setAnoDeLancamento(2016);
        fleabag.setTemporadas(2);
        fleabag.setEpisodiosPorTemporada(6);
        fleabag.setMinutosPorEpisodio(25);
        fleabag.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(mammaMia);
        calculadora.inclui(fleabag);
        System.out.println(calculadora.getTempoTotal());
    }
}
