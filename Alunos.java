import java.util.ArrayList;
import java.util.List;

public class Alunos {

    List<Aluno> alunos = new ArrayList<>();

    public void adicionaAluno(String nome, String email){

        Aluno alun = new Aluno(nome, email, alunos.size() + 1);
        alunos.add(alun);
    }

    public Aluno buscaAluno(Integer matricula){
        return alunos.get(matricula - 1);
    }

    public void removeAluno(Integer matricula){

        Aluno alunoRemover = buscaAluno(matricula);
        alunos.remove(alunoRemover);
    }

    public String pesquisarAluno(String email){

        for (Aluno alu: alunos) {
            if(alu.getEmail().contains(email)){
                System.out.println("Email: " + alu.getEmail());
            }
        }
        return null;
    }
    public String pesquisarAlunoMatricula(Integer matricula, Integer adicionaqtdCredito){

        for (int i = 0; i < alunos.size(); i++){
            Aluno alun = alunos.get(i);
            if(alun.getMatricula() == matricula){
                if(adicionaqtdCredito == 2){
                    alun.adicionaCredito2();
                } else if (adicionaqtdCredito == 4) {
                    alun.adicionaCredito4();
                } else if (adicionaqtdCredito == 6) {
                    alun.adicionaCredito6();
                }
            }
        }
        return null;
    }

    public void alunoComCreditos(){

        for (Aluno alunin: alunos) {
            if(alunin.getQtdCredito() > 0){
                System.out.println(alunin.toString());
            }
        }
    }
    @Override
    public String toString(){

        String todosAlunos = "";
        for (Aluno aluno: alunos) {
            todosAlunos += (aluno.toString());
        }
        return todosAlunos;
    }


}
