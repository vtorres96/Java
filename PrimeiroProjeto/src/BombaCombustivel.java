public class BombaCombustivel {

  private Combustivel gasolinaNormal;

  private Combustivel etanol;

  private Combustivel gasolinaAditivada;

  public float abastecer(float quantidadeLitros, int tipo){
    float precoTotal = 0;
    System.out.print("Abastecendo "+quantidadeLitros+" litros de ");

    if (tipo == 1){
      System.out.println("gasolina normal");
      precoTotal = quantidadeLitros * gasolinaNormal.getPreco();
    } else if (tipo == 2){
      System.out.println("etanol");
      precoTotal = quantidadeLitros * etanol.getPreco();
    } else if (tipo == 3){
      System.out.println("gasolina aditivada");
      precoTotal = quantidadeLitros * gasolinaAditivada.getPreco();
    } else {
      System.out.println("ERRO: Essa bomba não tem combustivel do tipo "+ tipo);
    }

    return precoTotal;
  }

  public void recarregarCaminhaoPipa(GasolinaNormal gasNormal, Etanol etanol, GasolinaAditivada gasAditivada){
    this.gasolinaNormal = gasNormal;
    this.etanol = etanol;
    this.gasolinaAditivada = gasAditivada;
    System.out.println("Bomba recarregada");
  }

}
