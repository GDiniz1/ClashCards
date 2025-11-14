package app;

public class Carta {

    private String nome;
    private int nivel;
    private int custoElixir;
    private TipoCarta tipoCarta;
    private Raridade raridade;
    private String imagem;
    private int dano;
    private int danoSegundo;
    private double vida;
    private String alvo;
    private String alcance;
    private String velocidade;
    private double velocidadeImpacto;

    public Carta(){


    }

    public Carta(String nome, int nivel, int custoElixir, TipoCarta tipoCarta, Raridade raridade, String imagem, int dano, int danoSegundo, double vida, String alvo, String alcance, String velocidade, double velocidadeImpacto){
        this.nome = nome;
        this.nivel = nivel;
        this.custoElixir = custoElixir;
        this.imagem = imagem;
        this.dano = dano;
        this.danoSegundo = danoSegundo;
        this.vida = vida;
        this.alvo = alvo;
        this.alcance = alcance;
        this.velocidade = velocidade;
        this.velocidadeImpacto = velocidadeImpacto;
        this.tipoCarta = tipoCarta;
        this.raridade = raridade;

    }

    public enum Raridade{
        COMUM,
        RARA,
        EPICO,
        LENDARIA,
    }

    public enum TipoCarta{
        TROPA,
        FEITICO,
        CONSTRUCAO,
    }

    public String getNome(){
        return nome;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public void setCustoElixir(int custoElixir){
        this.custoElixir = custoElixir;
    }

    public int getCustoElixir() {
        return custoElixir;
    }

    public TipoCarta getTipoCarta(){
        return tipoCarta;
    }

    public Raridade getRaridade(){
        return raridade;
    }

    public String getImagem(){
        return imagem;
    }

    public int getDano(){
        return dano;
    }

    public int getDanoSegundo(){
        return danoSegundo;
    }

    public double getVida(){
        return vida;
    }

    public String getAlvo(){
        return alvo;
    }

   public String getAlcance(){
        return alcance;
   }

   public String getVelocidade(){
        return velocidade;
   }

   public void setVelocidadeImpacto(double velocidadeImpacto){
        this.velocidadeImpacto = velocidadeImpacto;
   }

}
