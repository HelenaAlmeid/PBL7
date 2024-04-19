import java.util.ArrayList;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<ItemBibliotecaDigital> itens = new ArrayList<>();
        ItemBibliotecaDigital e;
        e = new Ebook("A guerra da papoula","R. F. Kuang", 300);
        itens.add(e);
        
        e = new Ebook("Duna","Frank Herbert",800);
        itens.add(e);

        ItemBibliotecaDigital v;
        v = new VideoDigital("Jogos Vorazes", "Suzanne Collins", "9h");
        itens.add(v);

        v = new VideoDigital("Divergente", "Veronica Roth", "8h");
        itens.add(v);

        for (ItemBibliotecaDigital item: itens){
            System.out.println(item.descricao());
            item.executar();
        }
        


        }
    }
