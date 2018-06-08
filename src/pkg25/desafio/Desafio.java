package pkg25.desafio;

import Classes.GeraQuestao;
import Classes.Listas;
import Telas.TelaInicial;

public class Desafio {

    public static void main(String[] args) {
        Listas.carros = GeraQuestao.geraQuestaoCarros();
        Listas.esporte = GeraQuestao.geraQuestaoEsportes();
        Listas.geografia = GeraQuestao.geraQuestaoGeografia();
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        
    }
    
}
