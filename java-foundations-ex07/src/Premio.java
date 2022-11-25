import java.util.Scanner;

public class Premio {
    public static void trocarTickets(Cartao cartao){
        Scanner scan = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Selecione uma opcao: \nPremios disponiveis: \n1 - Urso de Pelúcia (100 Tickets)\n2 - Carrinho de Controle Remoto (50 Tickets)\n3 - Arma Nerf (250 Tickets)");
        int opcao = scan.nextInt();
        
        switch (opcao) {
            case 1:
                if (cartao.getSaldoTicket()<100) {
                    System.out.println("====================");
                    System.out.println("Tickets Insuficientes");
                }else{
                    cartao.setSaldoTicket(cartao.getSaldoTicket()-100);
                    System.out.println("====================");
                    System.out.println("Você recebeu: Urso de Pelúcia\nObrigado!!");
                }
                break;
            case 2:
                if (cartao.getSaldoTicket()<50) {
                    System.out.println("====================");
                    System.out.println("Tickets Insuficientes");
                }else{
                    cartao.setSaldoTicket(cartao.getSaldoTicket()-50);
                    System.out.println("====================");
                    System.out.println("Você recebeu: Carrinho de Controle Remoto\nObrigado!!");
                }
                break;
            case 3:
                if (cartao.getSaldoTicket()<250) {
                    System.out.println("====================");
                    System.out.println("Tickets Insuficientes");
                }else{
                    cartao.setSaldoTicket(cartao.getSaldoTicket()-250);
                    System.out.println("====================");
                    System.out.println("Você recebeu: Arma Nerf\nObrigado!!");
                }
                break;
            default:
                System.out.println("====================");
                System.out.println("Opçao invalida, tente novamente");
                break;
        }
    }
}
