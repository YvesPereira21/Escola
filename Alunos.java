import java.util.ArrayList;
import java.util.List;

public class Alunos {

    List<Aluno> alunos = new ArrayList<>();
    List<Aluno> exAlunos = new ArrayList<>();


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionaAluno(String name, String email){
        Aluno alun = new Aluno(name, email, alunos.size() + 1);
        alunos.add(alun);
    }

    public void removeAluno(int matricula){
        Aluno aluno = alunos.get(matricula);
        alunos.remove(aluno);
        exAlunos.add(aluno);
        aluno.setMatriculaRemovida(exAlunos.size() + 1);

        for (int i = 0; i < alunos.size(); i ++){
            Aluno alun = alunos.get(i);
            alun.setMatricula(i + 1);
        }
    }

    public void pesquisarAluno(String email){
        for (Aluno alu: alunos) {
            if(alu.getEmail().contains(email)){
               String an = alu.getEmail();
            }
        }
    }

    public List<Aluno> recuperaAluno(int matricula){
        for (Aluno alun : exAlunos){
            if(alun.getMatricula() == matricula){
                alunos.add(alun);
                exAlunos.remove(alun);
            }
        }
        return alunos;
    }


}
