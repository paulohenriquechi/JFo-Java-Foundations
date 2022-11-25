import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color code");
        int currentColor = input.nextInt();
        System.out.println("=======IF=======");
        if (currentColor==1) {
            System.out.println("Next Traffic Light is green");
        };
        if (currentColor==2) {
            System.out.println("Next Traffic Light is yellow");
        };
        if (currentColor==3) {
            System.out.println("Next Traffic Light is red");
        };
        if(currentColor!=1&&currentColor!=2&&currentColor!=3){
            System.out.println("Invalid color");
        };
        System.out.println("=====SWITCH=====");
        switch (currentColor) {
            case 1:
                System.out.println("Next Traffic Light is green");
                break;
            case 2:
                System.out.println("Next Traffic Light is yellow");
                break;
            case 3:
                System.out.println("Next Traffic Light is red");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
        input.close();
    }
}
