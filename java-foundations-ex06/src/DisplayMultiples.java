import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para saber todos seus multiplos até 12: ");
        int numero = input.nextInt();
        for (int i = 1; i < 13 ; i++) {
            int r = numero*i;
            System.out.println(numero+"x"+i+" = "+r);
        }
        input.close();
    }
}
