package model;

import service.GestorAcademico;

import java.util.Scanner;

import static model.Professor.lerString;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno (String nome, int idade, int matricula) throws IllegalArgumentException {
        super(nome, idade);
        if(idade < 0){
            throw new IllegalArgumentException("A idade não pode ser negativa!");
        }
        this.matricula = matricula;
    }


    @Override
    public String toString(){
        return "Nome:  " +nome +
                " | Idade: " +idade+
                " | Matricula: "+ matricula;
    }
}