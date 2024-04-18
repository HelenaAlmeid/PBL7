public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    protected String duracao;

    public VideoDigital(String titulo, String autor, String duracao) {
        super(titulo, autor);
        this.duracao = duracao;
    }

    public String getDuracao(){
        return duracao;
    }

    public String descricao() {
        System.out.println("          Descrição          ");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Duração do video: " + getDuracao());
        System.out.println("-----------------------------");
    }

    public void Baixar(){
        System.out.println("O video foi baixado");
    }

    public void Visualizavel(){
        System.out.println("O video foi visualizado");
    }
}
