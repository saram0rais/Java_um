//Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args){
        
        Scanner entrada_nome = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada_nome.nextLine();

        Scanner entrada_idade = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = entrada_idade.nextInt();

        System.out.println("Ola " + nome + ", sua idade e " + idade);
    }
}