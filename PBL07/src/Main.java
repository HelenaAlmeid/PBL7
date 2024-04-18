import java.util.ArrayList;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<ItemBibliotecaDigital> item = new ArrayList<>();
        ItemBibliotecaDigital e;
        e = new Ebook("A guerra da papoula","R. F. Kuang", 300);
        item.add(e);
        
        e = new Ebook("Duna","Frank Herbert",800);
        item.add(e);

        ItemBibliotecaDigital v;
        v = new VideoDigital("Jogos Vorazes", "Suzanne Collins", "9h");
        item.add(v);

        v = new VideoDigital("Divergente", "Veronica Roth", "8h");
        item.add(v);

        for (ItemBibliotecaDigital visualizarDescricao: item){
            visualizarDescricao.descricao();
            if(visualizarDescricao instanceof Ebook){
                ((Ebook)visualizarDescricao).baixar();;
                System.out.println("-----------------------------");
            }
            else if(visualizarDescricao instanceof VideoDigital){
                ((VideoDigital)visualizarDescricao).visualizar();
                ((VideoDigital)visualizarDescricao).baixar();;
                System.out.println("-----------------------------");
            }
        }
        


        }
    }
