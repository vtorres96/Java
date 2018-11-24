import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {

    BombaCombustivel bomba = new BombaCombustivel();

    GasolinaNormal gasolinaNormal = new GasolinaNormal();
    gasolinaNormal.setPreco(4.10F);
    gasolinaNormal.setCor("laranja");

    Etanol etanol = new Etanol();
    etanol.setPreco(2.29F);
    etanol.setCor("verde");

    GasolinaAditivada gasolinaAditivada = new GasolinaAditivada();
    gasolinaAditivada.setPreco(4.31F);
    gasolinaAditivada.setCor("vermelho");

    bomba.recarregarCaminhaoPipa(gasolinaNormal, etanol, gasolinaAditivada);

    Scanner scanner = new Scanner(System.in);

    int opcao = 0;

      System.out.println("Qual combustivel você quer abastecer?");
      System.out.println("1 - Gasolina Normal");
      System.out.println("2 - Etanol");
      System.out.println("3 - Gasolina Aditivada");
      System.out.println("4 - Sair");

      opcao = scanner.nextInt();

    if (opcao != 4) {

        System.out.println("Quantos litros?");
        float quantidadeLitros = scanner.nextFloat();

        float preco = bomba.abastecer(quantidadeLitros, opcao);

        System.out.println("Valor total da compra: R$" + preco);

    } else {
        System.out.println("Você optou por não reabastecer");
    }

  }

}
