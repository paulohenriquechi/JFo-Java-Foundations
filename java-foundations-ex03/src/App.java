import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = input.nextLine();
        System.out.println("Bem vindo "+nome+" "+sobrenome+"!");

        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();
        System.out.println("A soma dos números "+n1+" e "+n2+" é "+(n1+n2));

        System.out.println("Agora digite o primeiro número com virgula: ");
        double n3 = input.nextDouble();
        System.out.println("Agora digite o segundo número com virgula: ");
        double n4 = input.nextDouble();
        System.out.println("A multiplicação dos números "+n3+" e "+n4+" é "+(n3*n4));

        System.out.println("Calculo da média de 4 números!");
        System.out.println("Digite o primeiro número: ");
        double nota1 = input.nextDouble();
        System.out.println("Digite o segundo número: ");
        double nota2 = input.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double nota3 = input.nextDouble();
        System.out.println("Digite o quarto número: ");
        double nota4 = input.nextDouble();
        System.out.println("A média dos números informados acima é de: "+(nota1+nota2+nota3+nota4)/4);
        input.close();
    }
}
