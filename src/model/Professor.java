package model;

import java.util.Scanner;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public static String lerString(Scanner sc, String mensagem){
        System.out.println(mensagem);
        return sc.nextLine();
    }
    @Override
    public String toString(){
        return "Nome:  " +nome +
                " | Idade: " +idade+
                " | Disciplina: " + disciplina;
    }
}