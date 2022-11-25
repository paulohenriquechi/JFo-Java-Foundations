public class LoopShape {
    public static void createRetangle(int l, int a){
        for (int i = 0; i < l; i++) {
            if(i==l-1){
                System.out.println("#");
            }else{
                System.out.print("#");
            }
        }
        for (int i = 0; i < a-2; i++) {
            System.out.print("#");
            for (int j = 0; j < l-2; j++) {
                String space = " ";
                System.out.print(space);
            }
            System.out.println("#");
        }

        for (int i = 0; i < l; i++) {
            if(i==l-1){
                System.out.println("#");
            }else{
                System.out.print("#");
            }
        }
    }
    public static void createTriangle(int a){
        System.out.println("#");
        for (int i = 0; i < a-2; i++) {
            System.out.print("#");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if(i!=a-1){
                System.out.println("#");
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print("#");
        }
        System.out.println("");
    }
}
