public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    protected String duracao;

    public VideoDigital(String titulo, String autor, String duracao) {
        super(titulo, autor);
        this.duracao = duracao;
    }

    public String getDuracao(){
        return duracao;
    }

    @Override
    public void descricao() {
        System.out.println("          Descrição          ");
        System.out.println("");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Duração do video: " + getDuracao());
        System.out.println("-----------------------------");
    }

    @Override
    public void baixar(){
        System.out.println("O video foi baixado");
    }

    @Override
    public void visualizar(){
        System.out.println("O video foi visualizado");
    }

   
    
}
