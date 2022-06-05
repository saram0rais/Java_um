// Faça um para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, 
// para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo 
// segundo valor lido. 

import java.util.Scanner;

public class atv8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        double valor1 = in.nextInt();


        System.out.println("Informe o segundo valor");
        double valor2 = in.nextInt();

        while (valor2 <= 0) {
            
            System.out.println("Por favor informe um valor maior do que 0");
            valor2 = in.nextInt();
        } 

          double conta = valor1 / valor2;
          System.out.println("O resultado da divisao dos dois valores e: " + conta);

        in.close();        
            
    }
}
