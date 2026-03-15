package util;

import java.util.Scanner;

public class ConsoleUtilis {

    /**
     * Solicita um número inteiro ao usuário via console, tratando entradas
     * inválidas (letras) e impedindo números negativos.
     *  @param sc O objeto Scanner para leitura da entrada
     *  @param msg A mensagem que será exibida ao usuário.
     *  @return O número Inteiro válido e positivo digitado.
     */
    public static int lerInt(Scanner sc, String msg){
        while(true){
            try{
                System.out.print(msg);
                // .trim() para remover espaços acidentais antes ou depois do número.
                int valor = Integer.parseInt(sc.nextLine().trim());

                if(valor < 0){
                    throw new IllegalArgumentException("Não é permitido número negativo.");
                }
                return valor;

            }catch(NumberFormatException e){
                System.out.println("Erro: digite apenas números.");
            }catch(IllegalArgumentException e){
                System.out.println("Erro: " +e.getMessage());
            }
        }

    }

    /**
     * Solicita uma string ao usuário via console, garantindo que o texto
     * não seja vazio ou composto apenas por espaços.
     * @param sc O objeto Scanner para leitura da entrada.
     * @param msg A mensagem que será exibida ao usuário.
     * @return O texto validado e sem espaços desnecessários nas bordas.
     */
    public static String lerString(Scanner sc, String msg){
        while(true) {

            System.out.println(msg);
            String texto = sc.nextLine().trim();
            if (texto.isBlank()) {
                System.out.println("Erro: O campo não pode ficar em branco.");
            } else{
                return texto;
            }

        }

    }
}
