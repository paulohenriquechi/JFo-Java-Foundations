import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enten a color code: ");
        double onda = input.nextDouble();
        if (onda>=380&&onda<=450) {
            System.out.println("The Color is Violet");
        };
        if (onda>450&&onda<=495) {
            System.out.println("The color is Blue");
        };
        if (onda>495&&onda<=570) {
            System.out.println("The color is Green");
        };
        if (onda>570&&onda<=590) {
            System.out.println("The color is Yellow");
        };
        if (onda>590&&onda<=620) {
            System.out.println("The color is Orange");
        };
        if (onda>620&&onda<=750) {
            System.out.println("The color is Red");
        };
        if (onda<380||onda>750) {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
        input.close();
    }
}
