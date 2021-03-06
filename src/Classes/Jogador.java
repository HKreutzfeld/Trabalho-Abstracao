package Classes;

public class Jogador {
    private String nome;
    private int pontuacao;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public Jogador(String data, String nome, int pontuacao) {
        this.data = data;
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    
}
