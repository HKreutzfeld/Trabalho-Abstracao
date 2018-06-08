package Classes;

import Telas.TelaInicial;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastrarJogador {

    
    private static boolean existeJogador(String nome) {
        boolean existe = false;
        for (Jogador j : Listas.listaJogador) {
            if (j.getNome().equals(nome)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    public static void CadastrarJogador(int pontuacao) {
       boolean nomeCorreto = false;
       String nome = "";
       while(!nomeCorreto){
           nomeCorreto = true;
           nome = JOptionPane.showInputDialog("Informe seu nome");
           if(nome.trim().equals("")){
               JOptionPane.showMessageDialog(null, "Erro! O nome não pode estar vazio");
               nomeCorreto = false;     
           }else{
               for(Jogador j : Listas.listaJogador){
                   if(j.getNome().equals(nome)){
                       nomeCorreto = false;
                       JOptionPane.showMessageDialog(null, "Erro! O nome informado já existe");
                       break;
                   }
               }
           }
       }
       String resultado = "Jogador: " +nome+ "\nPontuação: "+pontuacao;
       JOptionPane.showMessageDialog(null, resultado);
       String tempo = LocalDateTime.now().getDayOfMonth()+"/"+LocalDateTime.now().getMonth().getValue()+"/"+LocalDateTime.now().getYear();
       Listas.listaJogador.add(new Jogador(tempo, nome, pontuacao));
        for (int i = 0; i < Listas.listaJogador.size(); i++) {
            for (int j = 0; j < Listas.listaJogador.size()-1; j++) {
                if(Listas.listaJogador.get(j).getPontuacao() < Listas.listaJogador.get(j+1).getPontuacao()){
                    Jogador tmp = Listas.listaJogador.get(j);
                    Listas.listaJogador.set(j, Listas.listaJogador.get(j+1));
                    Listas.listaJogador.set(j+1, tmp);
                }
            }
        }
       
       
    }
    

}
