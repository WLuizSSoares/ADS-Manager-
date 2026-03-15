package service;
import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class GestorAcademico {
    private List<Pessoa> membros = new ArrayList<>();

    public void adicionarMembro(Pessoa p){
        membros.add(p);
    }

    public void listar(){
        if(membros.isEmpty()){
            System.out.println("Não há membros cadastrados.");
            return;
        }else{
            for(Pessoa p : membros){
                System.out.println(p);
            }
        }

    }


}
