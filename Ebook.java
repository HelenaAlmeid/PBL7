public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    protected int numeroPaginas;

    public Ebook(String titulo, String autor, int numeroPaginas){
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public String descricao() {
        System.out.println("          Descrição          ");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Duração do video: " + getNumeroPaginas());
        System.out.println("-----------------------------");
    }

    public void Baixar(){
        System.out.println("Ebook foi baixado");
    }

}
