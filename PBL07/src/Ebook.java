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
    public void descricao() {
        System.out.println("          Descrição          ");
        System.out.println("");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Número de páginas: " + getNumeroPaginas());
        System.out.println("-----------------------------");
    }

    @Override
    public void baixar(){
        System.out.println("Ebook foi baixado");
    }

    

   
    

}
