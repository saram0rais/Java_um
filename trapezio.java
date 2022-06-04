import java.util.Scanner;

public class trapezio {
    public static void main(String[] angs) {

        Scanner entrada_maior = new Scanner (System.in);
        System.out.println("Informe a medida da base maior");
        int maior = entrada_maior.nextInt();

        Scanner entrada_menor = new Scanner (System.in);
        System.out.println("Informe a medida da base menor");
        int menor = entrada_menor.nextInt();

        Scanner entrada_altura = new Scanner (System.in);
        System.out.println("Informe a altura do trapezio");
        int altura = entrada_altura.nextInt();


        Scanner calculo1 = new Scanner (System.in);
        int calculo = maior + menor * altura / 2;

        System.out.println("Area de: " + calculo);
    }
}