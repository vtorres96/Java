import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date dataDaMatricula;

    public Matricula(Aluno aluno, Curso curso, Date dataDaMatricula){

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(Date dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }
}
