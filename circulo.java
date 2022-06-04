import java.util.Scanner;

public class circulo {
    public static void main(String[] angs) {

        Scanner entrada_raio = new Scanner (System.in);
        System.out.println("Informe o valor do raio do circulo");
        int raio = entrada_raio.nextInt();

        Scanner calculo1 = new Scanner (System.in);
        double calculo = raio * 2 * 3.14;

        System.out.println("Area de: " + calculo);
    }
}