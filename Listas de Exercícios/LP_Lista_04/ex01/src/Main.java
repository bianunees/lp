import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int n = in.nextInt();

        System.out.println("Tabuada do " + n + ":");

        for (int i = 0; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }
    }
}
