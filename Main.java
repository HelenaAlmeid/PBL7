import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ItemBibliotecaDigital> item = new ArrayList<>();
        ItemBibliotecaDigital ebook1 = new Ebook("A guerra da papoula","R. F. Kuang", 300);
        item.add(ebook1);
        ItemBibliotecaDigital ebook2 = new Ebook("Duna","Frank Herbert",800);
        item.add(ebook2);

        Baixavel verificar;
            verificar = ebook1;
            verificar.baixar();





        }
    }
}