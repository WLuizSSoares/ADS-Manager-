import model.Aluno;
import model.Professor;
import service.GestorAcademico;
import util.ConsoleUtilis;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorAcademico gestor = new GestorAcademico();
        boolean continuar = true;



        while(continuar){
            System.out.println("""
                   ---Gestor Online---
                   1 - Cadastrar Aluno.
                   2 - Cadastrar Professor.
                   3 - Listar.
                   4 - Sair
                   """);
            int opcao = ConsoleUtilis.lerInt(sc, "Escolha: ");

            switch(opcao){
                case 1:
                    cadastrarPessoa(sc, gestor, "aluno");
                    break;
                case 2:
                    cadastrarPessoa(sc, gestor, "professor");
                    break;
                case 3:
                    gestor.listar();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static void cadastrarPessoa(Scanner sc, GestorAcademico gestor, String tipo){

        String nome = ConsoleUtilis.lerString(sc, "Nome: ");
        int idade = ConsoleUtilis.lerInt(sc, "Idade: ");


        if(tipo.equals("aluno")){
            int matricula = ConsoleUtilis.lerInt(sc, "Matricula: ");
            gestor.adicionarMembro(new Aluno(nome, idade, matricula));
        }else if(tipo.equals("professor")){
            String disciplina = ConsoleUtilis.lerString(sc, "Disciplina: ");
            gestor.adicionarMembro(new Professor(nome, idade, disciplina));
        }
    }

}