public class Fachada {

    Alunos alumnis = new Alunos();

    public void adicionaAlumnis(String name, String email){
        alumnis.adicionaAluno(name, email);
    }
    public void removeAlumnis(int matricula){
        alumnis.removeAluno(matricula);
    }
    public void pesquisaAlumnis(String email){
        alumnis.pesquisarAluno(email);
    }
    public void pesquisarAlumnisMatricula(int matricula, int qtdCredito){
        alumnis.pesquisarAlunoMatricula(matricula, qtdCredito);
    }
    public void alumnnisComCredito(){
        alumnis.alunoComCreditos();
    }
    public void alumnisTodos(){
        alumnis.toString();
    }
}
