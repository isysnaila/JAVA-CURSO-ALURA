public class Filme extends Titulo{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override

    public void exibeFichaTecnica(){
        System.out.println("----------------------------------------------------------------");
        super.exibeFichaTecnica();
        System.out.println("Duração: " + getDuracaoEmMinutos() + " minutos.");
        System.out.println("Diretor: " + diretor);
        System.out.println("----------------------------------------------------------------");
    }

}