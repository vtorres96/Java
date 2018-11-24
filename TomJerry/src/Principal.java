import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Rato rato1 = new Rato();
        rato1.setNome("Guilherme");
        rato1.setPeso(2);

        Rato rato2 = new Rato();
        rato2.setNome("Vinicius");
        rato2.setPeso(2);

        Rato rato3 = new Rato();
        rato3.setNome("Juan");
        rato3.setPeso(2);

        List<Rato> ListaRatos;
        ListaRatos = new ArrayList<>();
        ListaRatos.add(rato1);
        ListaRatos.add(rato2);
        ListaRatos.add(rato3);

        Gato gato1 = new Gato();
        gato1.setNome("Fabio");

        // Chamando comerUmRato
            //gato1.comerUmRato(rato1);

        // Chamando comerRatos
            //gato1.comerRatos(ListaRatos);

        // Chamando correr
            //double gatoCorrendo = gato1.correr(2);
            //System.out.println(gatoCorrendo);


    }
}
