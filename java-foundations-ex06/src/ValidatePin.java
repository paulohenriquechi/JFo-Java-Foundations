import java.util.Scanner;

public class ValidatePin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 1379;
        System.out.println("Digite o PIN de 4 digitos: ");
        int userPin = input.nextInt();
        while(userPin!=pin){
            System.out.println("PIN inserido inválido, por favor tente novamente");
            System.out.println("Digite o PIN de 4 digitos: ");
            userPin = input.nextInt();
        }
        System.out.println("Autenticação validada, acesso a conta liberado.");
        input.close();
    }
}
