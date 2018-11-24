import java.util.List;

public class Gato {

    private String nome;
    private float qtdEnergia = 0F;
    private float velocidade = 5F;

    public Gato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getQtdEnergia() {
        return qtdEnergia;
    }

    public void setQtdEnergia(float qtdEnergia) {
        this.qtdEnergia = qtdEnergia;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void comerUmRato(Rato rato){
        qtdEnergia = qtdEnergia + rato.getPeso();
        System.out.println(getNome() + " está comendo " + rato.getNome() + " e agora a sua energia é " + qtdEnergia);
    }

    public void comerRatos (List<Rato> listaRatos){
        for(Rato rato : listaRatos){
            comerUmRato(rato);
        }
    }

    public double correr (Integer distancia){
        qtdEnergia = qtdEnergia - (distancia * 0.5F);
        return (qtdEnergia);
    }

    public Boolean meConvemComer(Rato rato, Integer distancia){
        if (qtdEnergia > distancia) {
            return true;
        } else {
            return false;
        }
    }

}
