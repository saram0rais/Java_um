//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 

import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {

        Scanner entrada1 = new Scanner (System.in);
        System.out.println("Informe o primeiro valor");
        int valor1 = entrada1.nextInt();

        Scanner entrada2 = new Scanner (System.in);
        System.out.println("Informe o segundo valor");
        int valor2 = entrada1.nextInt();

        Scanner entrada3 = new Scanner (System.in);
        System.out.println("Informe o terceiro valor");
        int valor3 = entrada3.nextInt();

        if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3){
            int conta = valor1 + valor2;
            System.out.println("A soma dos 2 maiores números sao: " + conta);
        } 
        else  if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2){
            int conta = valor1 + valor3;
            System.out.println("A soma dos 2 maiores números sao: " + conta);
        }
        else  if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1){
            int conta = valor2 + valor3;
            System.out.println("A soma dos 2 maiores números sao: " + conta);
        }
        else  if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3){
            int conta = valor2 + valor1;
            System.out.println("A soma dos 2 maiores números sao: " + conta);
        }
        else  if (valor3 > valor1 && valor3 > valor2 && valor2 > valor1){
            int conta = valor3 + valor2;
            System.out.println("A soma dos 2 maiores números sao: " + conta);
        }
         else  if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2){
            int conta = valor3 + valor1;
            System.out.println("A soma dos 2 maiores números sao: " + conta);
        }
    }
}