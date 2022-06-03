//Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]". 

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);       
        System.out.println("Informe seu nome");
        String nome = entrada.nextLine();

        System.out.println("Ola, " + nome);

    }
}