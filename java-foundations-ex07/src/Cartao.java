import java.util.Random;

public class Cartao {
    private int saldoCredito;
    private int saldoTicket;
    private int numeroCartao;

    public void gerarCartao(){
        Random random = new Random();
        this.numeroCartao = 0;
        for (int i = 0; i < 10; i++) {
            this.numeroCartao += random.nextInt(1, 99);
        }
        this.saldoCredito = 0;
        this.saldoTicket = 0;
    }

    public int getSaldoCredito() {
        return saldoCredito;
    }

    public void setSaldoCredito(int saldoCredito) {
        this.saldoCredito = saldoCredito;
    }

    public int getSaldoTicket() {
        return saldoTicket;
    }

    public void setSaldoTicket(int saldoTicket) {
        this.saldoTicket = saldoTicket;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    
    

    

}
