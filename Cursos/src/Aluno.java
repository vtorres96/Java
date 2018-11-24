public class Aluno {

    private String ra;
    private String nome;
    private String sobrenome;

    public void assistirAula(){
        System.out.println("O aluno de ra " + ra + ", " + nome + " " + " " + sobrenome);
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
