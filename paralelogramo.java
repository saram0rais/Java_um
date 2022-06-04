import java.util.Scanner;

public class paralelogramo {
    public static void main(String[] angs) {

        Scanner entrada_base = new Scanner (System.in);
        System.out.println("Informe o valor da base do parelelogramo");
        int base = entrada_base.nextInt();

        Scanner entrada_altura = new Scanner (System.in);
        System.out.println("Informe o valor da altura do paralelogramo");
        int altura = entrada_altura.nextInt();

        Scanner calculo1 = new Scanner(System.in);
        int calculo = base * altura;

        System.out.println("Area de: " + calculo);
    }
}