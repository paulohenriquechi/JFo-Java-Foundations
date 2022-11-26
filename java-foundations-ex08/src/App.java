public class App {
    public static void main(String[] args) throws Exception {
        Equipe arsenal = new Equipe("Arsenal");
        Equipe chelsea = new Equipe("Chelsea");
        Equipe manchesterunited = new Equipe("Manchester United");
        Equipe manchestercity = new Equipe("Manchester City");

        Jogo jogo1 = new Jogo();
        jogo1.iniciarPartida(manchesterunited, manchestercity);

        Jogo jogo2 = new Jogo();
        jogo2.iniciarPartida(arsenal, chelsea);
        
        System.out.println(arsenal.toString());
        System.out.println(chelsea.toString());
        System.out.println(manchesterunited.toString());
        System.out.println(manchestercity.toString());
    }
}
