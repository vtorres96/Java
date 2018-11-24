public class Professor extends Docente {

    private int rd;
    private String nome;

    @Override
    public void darAula() {
        System.out.println("O professor " + nome + " de rd " + rd + " está dando aula");
    }

    public int getRd() {
        return rd;
    }

    public void setRd(int rd) {
        this.rd = rd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
