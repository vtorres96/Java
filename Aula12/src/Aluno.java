public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codigoAluno;

    public Aluno(String nome, String sobrenome, Integer codigoAluno){
        System.out.println("O aluno " + nome + " " + sobrenome + " possui o código " + codigoAluno);
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

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

}
