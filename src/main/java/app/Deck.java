package app;

import java.util.ArrayList;

public class Deck {

    private double custoMedioElixir;

    private final int TAMANHO_MAXIMO = 8; //tamanho maximo que o deck pode chegar

    ArrayList<Carta> cartas = new ArrayList<>(); //Lista das cartas

    public Deck(double custoMedioElixir){
        this.custoMedioElixir = 0.0; //Inicializando o custo médio em 0.0
    }

    public void adicionarCarta(Carta adicionarCartas){

        if(cartas.size() < TAMANHO_MAXIMO){  //falta adicionar mais um if para as cartas não se repetirem
          cartas.add(adicionarCartas);
          this.atualizarElixir();
        }
        else{
           System.out.println("Não é possivel colocar mais de 8 cartas");
           //Botei como um placeholder para eu não ficar confuso, pode mudar carrion se quiser

        }
    }

    public void removerCarta(Carta removerCartas){
        cartas.remove(removerCartas);
        this.atualizarElixir();
    }

    public void atualizarElixir(){  //Atualizar o custo médio de elixir

        if(cartas.isEmpty()) {
            this.custoMedioElixir = 0.0;

        }
        else{

            double soma = 0;

          for(Carta carta : cartas){
              soma += carta.getCustoElixir();

          }

          this.custoMedioElixir = soma / cartas.size();

        }
    }
}
