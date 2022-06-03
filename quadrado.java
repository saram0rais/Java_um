import java.util.Scanner;

public class quadrado {
    public static void main(String[] angs) {

        Scanner entrada_altura= new Scanner(System.in);
        System.out.println("Informe a medida dos lados do quadrado");
        int altura = entrada_altura.nextInt();

        Scanner calculo1 = new Scanner(System.in);
        int calculo = altura * 2;

        System.out.print("area = " + calculo);
    }
}