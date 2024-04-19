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
    public String descricao() {
        return "          Descrição          \n" +
                "Título: " + getTitulo() + "\nAutor: " + getAutor() +
                "\nDuração do video: " + getDuracao() +
                "\n-----------------------------";
    }

    @Override
    public void baixar(){
        System.out.println("O video foi baixado");
    }

    @Override
    public void visualizar(){
        System.out.println("O video foi visualizado");
    }

   @Override
   public void executar() {
       baixar();
       visualizar();
       System.out.println("-----------------------------");
   }
    
}
