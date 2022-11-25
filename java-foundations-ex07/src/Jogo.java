import java.util.Random;

public class Jogo {
    public static void jogar(Cartao cartao){
        int valorJogada = 50;
        if (cartao.getSaldoCredito()<50) {
            System.out.println("====================");
            System.out.println("Você nao possui créditos suficientes para jogar");
        }else{
            System.out.println("====================");
            System.out.println("Você utilizou 50 Creditos para jogar");
            cartao.setSaldoCredito(cartao.getSaldoCredito() - valorJogada);
            System.out.println("Saldo de Creditos atual: "+ cartao.getSaldoCredito());
            Random random = new Random();
            int ticketsGanhos = random.nextInt(1, 100);
            cartao.setSaldoTicket(cartao.getSaldoTicket()+ticketsGanhos);
            System.out.println("Número do Cartao: "+cartao.getNumeroCartao()+"\nTickets Ganhos: "+ticketsGanhos+"\nNovo total: "+cartao.getSaldoTicket());
        }
    }
}
