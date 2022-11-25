import java.util.Scanner;

public class Terminal {
    public static void carregarCartao(Cartao cartao){
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Dados do Cartao: \nNúmero do Cartao: "+cartao.getNumeroCartao()+"\nCreditos: "+cartao.getSaldoCredito()+"\nTickets: "+cartao.getSaldoTicket());
        System.out.println("====================");
        System.out.println("Digite quantos dólares deseja carregar em creditos: ");
        int dolar = input.nextInt();
        cartao.setSaldoCredito(dolar*2);
        System.out.println("====================");
        System.out.println("Dados do Cartao: \nNúmero do Cartao: "+cartao.getNumeroCartao()+"\nCréditos: "+cartao.getSaldoCredito()+"\nTickets: "+cartao.getSaldoTicket());
    }

    public static void transferirSaldo(Cartao cartao1, Cartao cartao2){
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Digite a quantidade de créditos que deseja transferir: ");
        int creditos = input.nextInt();
        if(creditos>cartao1.getSaldoCredito()||creditos<=0){
            System.out.println("====================");
            System.out.println("Saldo de credito insuficiente para efetuar transferencia");
        }else{
            cartao1.setSaldoCredito(cartao1.getSaldoCredito()-creditos);
            cartao2.setSaldoCredito(cartao2.getSaldoCredito()+creditos);
            System.out.println("====================");
            System.out.println("Novo saldo de creditos: ");
            System.out.println("Cartao "+cartao1.getNumeroCartao()+":\nNovo Saldo: "+cartao1.getSaldoCredito());
            System.out.println("Cartao "+cartao2.getNumeroCartao()+":\nNovo Saldo: "+cartao2.getSaldoCredito());
        }

    }
    
}
