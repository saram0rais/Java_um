//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor");
        int valor = entrada.nextInt();

        if(valor > 0){
            System.out.println(valor + " e positivo");
        }else if (valor < 0) {
            System.out.println(valor + " e negativo");
        }else if (valor == 0) {
            System.out.println(valor + " e zero");
        }

    }
}