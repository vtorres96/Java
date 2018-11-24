import java.util.ArrayList;
import java.util.List;

public class Turma<alunos> {

    private String nome;
    private List<Aluno> ListaAlunos;
    private Curso curso;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getListaAlunos() {
        return ListaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        ListaAlunos = listaAlunos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void iniciarAula(){
        System.out.println("Iniciando a aula de " + curso.getNome() + " na turma " + getNome());

        for(Aluno aluno : ListaAlunos){
            aluno.assistirAula();
        }
    }
}
