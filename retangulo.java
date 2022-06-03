import java.util.Scanner;

public class retangulo {
    public static void main(String[] angs) {

        Scanner entrada_base = new Scanner(System.in);
        System.out.println("Informe a base do retangulo");
        int base = entrada_base.nextInt();

        Scanner entrada_altura = new Scanner(System.in);
        System.out.println("Informe a altura do retangulo");
        int altura = entrada_altura.nextInt();

        Scanner calculo1 = new Scanner(System.in);
        int calculo = base * altura;

        System.out.print("area = " + calculo);
    }
}