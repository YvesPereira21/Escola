public class Aluno {
    private String nome;
    private String email;
    private int matricula;
    private int qtdCredito;

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String novoEmail){
        email = novoEmail;
    }
    public int getMatricula(){
        return matricula;
    }
    public Aluno(String nome, String email, int matricula){
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }

    public void adicionaCredito2(){
        qtdCredito += 2;
    }
    public void adicionaCredito4(){
        qtdCredito += 4;
    }
    public void adicionaCredito6(){
        qtdCredito += 6;
    }
}
