public class MainApp {
    public static void main(String[] args) {
        Cartao c1 = new Cartao();
        Cartao c2 = new Cartao();
        c1.gerarCartao();
        c2.gerarCartao();
        Terminal.carregarCartao(c1);
        Terminal.carregarCartao(c2);
        Jogo.jogar(c1);
        Jogo.jogar(c2);
        Jogo.jogar(c1);
        Jogo.jogar(c2);
        Terminal.transferirSaldo(c1, c2);
        Premio.trocarTickets(c2);
        Jogo.jogar(c1);
        Premio.trocarTickets(c1);
    }
}
