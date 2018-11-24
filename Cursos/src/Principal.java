import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        // Criando alunos
        Aluno aluno1 = new Aluno ();
        aluno1.setNome("Victor");
        aluno1.setSobrenome("Torres");
        aluno1.setRa("123456");

        Aluno aluno2 = new Aluno ();
        aluno2.setNome("Lucas");
        aluno2.setSobrenome("Pratto");
        aluno2.setRa("654321");

        Aluno aluno3 = new Aluno ();
        aluno3.setNome("Luisa");
        aluno3.setSobrenome("Mel");
        aluno3.setRa("135790");

        // Criando Lista de Alunos
        List<Aluno> ListaDeAlunos;
        ListaDeAlunos = new ArrayList<>();
        ListaDeAlunos.add(aluno1);
        ListaDeAlunos.add(aluno2);
        ListaDeAlunos.add(aluno3);

        // Criando professores
        Professor professor1 = new Professor();
        professor1.setRd(1);
        professor1.setNome("Fabio");

        Professor coordenador = new Professor();
        coordenador.setRd(2);
        coordenador.setNome("Ana Paula");

        // Criando curso
        Curso cursoA = new Curso();
        cursoA.setNome("Mobile Android");
        cursoA.setCoordenador(coordenador);

        // Criando turma
        Turma turma1 = new Turma();
        turma1.setNome("Mobile 04");
        turma1.setProfessor(professor1);
        turma1.setCurso(cursoA);
        turma1.setListaAlunos(ListaDeAlunos);

        turma1.iniciarAula();

    }
}
