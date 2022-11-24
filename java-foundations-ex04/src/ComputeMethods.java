import java.util.Random;
import java.util.Scanner;

public class ComputeMethods {
    public double fToC(double degreesF){
        double cToF = (degreesF-32)/1.8;
        System.out.println("Temp in celsius is "+cToF);
        return cToF;
    }
    public double hipotenuse(int a, int b){
        double quadrado = (Math.pow(a, 2)+Math.pow(b, 2));
        double raiz = Math.sqrt(quadrado);
        System.out.println("Hypotenuse is "+raiz);
        return raiz;
    }
    public int roll(){
        Random dado = new Random();
        int dado1 = dado.nextInt(1, 7);
        int dado2 = dado.nextInt(1, 7);
        int soma = dado1+dado2;
        System.out.println("The sum of the dice values is "+soma);
        return soma;
    }
    public void name(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String nome = input.nextLine();
        int espaco = nome.indexOf(" ");
        char primeiroNome = nome.charAt(0);
        String ultimoNome = nome.substring(espaco+1);
        System.out.println("Your name is: "+ultimoNome+", "+primeiroNome+".");
        input.close();
    }
}
