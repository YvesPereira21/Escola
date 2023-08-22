import java.util.ArrayList;
import java.util.List;

public class Alunos {

    List<Aluno> alunos = new ArrayList<>();
    List<Aluno> exalunos = new ArrayList<>();
    

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionaAluno(String name, String email){
        Aluno alun = new Aluno(name, email, alunos.size() + 1);
        alunos.add(alun);
    }

    public List<Aluno> removeAluno(int matricula){
        Aluno aluno = alunos.get(matricula);
        alunos.remove(matricula);
        return getAlunos();
    }

    public List<Aluno> pesquisarAluno(String email){
        Aluno alu = null;
        for (int i = 0; i < alunos.size(); i++) {
            alu = alunos.get(i);
            if (alu.getEmail().contains(email)) {
                return (List<Aluno>) alu;
            }
        }
        return (List<Aluno>) alu;
    }

    public List<Aluno> recuperaAluno(int matricula){
        List<Aluno> alunoRecuperado = new ArrayList<>();
        for (Aluno alun : alunos){
            if(alun.getMatricula() == matricula){
                alunoRecuperado.add(alun);
            }
        }

        return alunoRecuperado;
    }


}
