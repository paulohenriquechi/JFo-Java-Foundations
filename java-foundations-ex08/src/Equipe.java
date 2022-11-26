public class Equipe {
    private String nome;
    private int vitorias = 0;
    private int derrotas = 0;
    private int empates = 0;
    private int golsMarcados = 0;
    private int golsSofridos = 0;
    public Equipe(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getGolsMarcados() {
        return golsMarcados;
    }
    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }
    public int getGolsSofridos() {
        return golsSofridos;
    }
    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    // tostring
    @Override
    public String toString() {
        return "Equipe [nome=" + nome + ", vitorias=" + vitorias + ", derrotas=" + derrotas + ", empates=" + empates
                + ", golsMarcados=" + golsMarcados + ", golsSofridos=" + golsSofridos + "]";
    }
    
    
    

}
