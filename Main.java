import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fachada fach = new Fachada();
        boolean condParada = false;

        System.out.println("Olá, seja bem vindo ao portal da coordenação!");
        System.out.println("Menu:\n"
                + "Digite 1 se deseja adicionar o aluno!\n"
                + "Digite 2 se deseja remover o aluno através da matrícula!\n"
                + "Digite 3 se deseja pesquisar o aluno pelo email!\n"
                + "Digite 4 se deseja pesquisar o aluno através da matrícula e adicionar créditos a ele!\n"
                + "Digite 5 se deseja procurar os alunos que já possuem uma quantidade de créditos!\n"
                + "Digite 6 para exibir a quantidade de alunos!\n"
                + "Digite 7 se deseja sair");



        while(!condParada){
            System.out.println("Qual opção deseja acessar? ");

            int opcao = sc.nextInt();

            if(opcao < 1 || opcao > 7){
                System.out.println("Opção inválida! Digite a opção correta.");

                opcao = sc.nextInt();
            }
            switch (opcao){
                case 1:

                    System.out.println("Digite o nome do aluno");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.println("Digite o email do aluno");
                    String email = sc.nextLine();


                    fach.adicionaAlumnis(nome, email);
                    break;
                case 2:

                    System.out.println("Digite o número da matrícula do aluno que deseja remover");
                    int matricula = sc.nextInt();

                    fach.removeAlumnis(matricula);
                    break;
                case 3:

                    System.out.println("Digite o email do aluno que procura");
                    String procurarEmail = sc.nextLine();
                    sc.nextLine();

                    fach.pesquisaAlumnis(procurarEmail);
                    break;
                case 4:

                    System.out.println("Digite a matrícula do aluno que procura e adicione créditos a ele");
                    int procuraMatricula = sc.nextInt();

                    int qtdCredito = sc.nextInt();

                    fach.pesquisarAlumnisMatricula(procuraMatricula, qtdCredito);
                    break;
                case 5:

                    System.out.println("Alunos que já possuem créditos: ");
                    fach.alumnnisComCredito();
                    break;
                case 6:

                    System.out.println("Todos alunos: ");
                    System.out.println(fach.alumnisTodos());
                    break;
                case 7:

                    condParada = true;
                default:

                    throw new IllegalStateException("Unexpected value: " + opcao);
            }


        }
        sc.close();

    }


}

