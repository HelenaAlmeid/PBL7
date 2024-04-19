public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    protected int numeroPaginas;

    public Ebook(String titulo, String autor, int numeroPaginas){
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    @Override
    public String descricao() {
        return "          Descrição          \n" +
                "Título: " + getTitulo() + "\nAutor: " + getAutor() +
                "\nNúmero de páginas: " + getNumeroPaginas() +
                "\n-----------------------------";
    }

    @Override
    public void baixar(){
        System.out.println("Ebook foi baixado");
    }

    @Override
    public void executar() {
        baixar();
        System.out.println("-----------------------------");
    }

    

   
    

}
