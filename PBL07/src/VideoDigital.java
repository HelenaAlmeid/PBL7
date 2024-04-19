public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    private String duracao;

    public VideoDigital(String titulo, String autor, String duracao) {
        super(titulo, autor);
        this.duracao = duracao;
    }

    public String getDuracao(){
        return duracao;
    }

    @Override
    public void descricao() {
        String espaco = "-----------------------------";
        System.out.println(espaco);
        System.out.println("          Descrição          ");
        System.out.println(espaco);
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Duração do video: " + getDuracao());
        System.out.println(espaco);
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
