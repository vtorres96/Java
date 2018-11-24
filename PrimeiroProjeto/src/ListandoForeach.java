import java.util.ArrayList;
import java.util.List;

public class ListandoForeach {

    public static void main(String[] args) {

        List<String> ListaDeNomes = new ArrayList<>();

        ListaDeNomes.add("Joaquim");
        ListaDeNomes.add("João");

        for (String nome : ListaDeNomes) {
            System.out.println(nome);
        }

        for (int i = 0; i < ListaDeNomes.size(); i++){
            System.out.println(ListaDeNomes.get(i));
        }

    }

}
