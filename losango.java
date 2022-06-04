import java.util.Scanner;

public class losango {
    public static void main(String[] angs) {

        Scanner entrada_maior = new Scanner (System.in);
        System.out.println("Informe a medida da diagonal maior");
        int maior = entrada_maior.nextInt();

        Scanner entrada_menor = new Scanner (System.in);
        System.out.println("Informe a medida da diagonal menor");
        int menor = entrada_menor.nextInt();

        Scanner calculo1 = new Scanner (System.in);
        int calculo = maior * menor / 2;

        System.out.println("Area de: " + calculo);
    }
}