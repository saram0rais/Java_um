import java.util.Scanner;

public class triangulo {
    public static void main(String[] angs) {

        Scanner entrada_base = new Scanner (System.in);
        System.out.println("Informe a medida da base do triangulo");
        int base = entrada_base.nextInt();

        Scanner entrada_altura = new Scanner (System.in);
        System.out.println("Informe a medida da altura do triangulo");
        int altura = entrada_altura.nextInt();


        Scanner calculo1 = new Scanner (System.in);
        int calculo = base * altura / 2;

        System.out.println("Area de: " + calculo);
    }
}