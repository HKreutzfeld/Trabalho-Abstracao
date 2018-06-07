package Classes;

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
    
    public static boolean CadastrarJogador(JTextField campoNome) {
       
        if(existeJogador(campoNome.getText().trim()) || campoNome.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Erro! Escolha outro nome");
            return false;
        }else{
            
            Jogador j = new Jogador(campoNome.getText().trim(), 0);
            Listas.listaJogador.add(j);
            
            campoNome.setText("");
            return true;
        }

    }

}
