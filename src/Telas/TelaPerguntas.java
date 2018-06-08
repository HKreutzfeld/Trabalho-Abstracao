package Telas;

import Classes.CadastrarJogador;
import Classes.Questao;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class TelaPerguntas extends javax.swing.JFrame {

    private ArrayList<Questao> aleatorias;
    private String respCorreta = "";
   
    private int acertos = 0, erros = 0, quantidadePular = 3;

    public void atualizaQuestoes() { // método pra atualizar os componentes do formulario
        labelAcertos.setText("Acertos: "+acertos);
        labelErro.setText("Erros: "+erros);
        respCorreta = aleatorias.get(0).getAlternativacerta();
        BotaoResposta1.setText(aleatorias.get(0).getAlternativaum());
        BotaoResposta2.setText(aleatorias.get(0).getAlternativadois());
        BotaoResposta3.setText(aleatorias.get(0).getAlternativatres());
        BotaoResposta4.setText(aleatorias.get(0).getAlternativaquatro());
        labelQuestao.setText(aleatorias.get(0).getPergunta());
        aleatorias.remove(0);
        buttonGroup1.clearSelection();

    }

    public ArrayList<Questao> geraQuestoes(ArrayList<Questao> lista) { // método pra gerar as questoes aleatorias
        ArrayList<Questao> ret = new ArrayList();
        Random r = new Random(); // gerar numero aleaotiro
        for (int i = 0; i < 13; i++) {

            boolean jaExiste = true;
            Questao temp = null;
            while (jaExiste) {
                jaExiste = false;
                int num = r.nextInt(20); // gera um numero aleatorio de 0 a 19
                temp = lista.get(num); // obtem a questao na posicao gerada
                if (ret.contains(temp)) { // verifica se a lista já possui a questao
                    // se sim, jaExiste = true e da break
                    jaExiste = true;
                }
            }
            ret.add(temp);
        }
        return ret; // retorna lista
    }

    public TelaPerguntas(ArrayList<Questao> lista) {
        initComponents();
        this.setLocationRelativeTo(null);
        aleatorias = geraQuestoes(lista);
        atualizaQuestoes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelQuestao = new javax.swing.JLabel();
        BotaoResposta1 = new javax.swing.JRadioButton();
        BotaoResposta2 = new javax.swing.JRadioButton();
        BotaoResposta3 = new javax.swing.JRadioButton();
        BotaoResposta4 = new javax.swing.JRadioButton();
        botaoPular = new javax.swing.JToggleButton();
        botaoResponder = new javax.swing.JButton();
        labelAcertos = new javax.swing.JLabel();
        labelErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perguntas");
        setResizable(false);

        labelQuestao.setText("jLabel1");

        buttonGroup1.add(BotaoResposta1);
        BotaoResposta1.setText("jRadioButton1");

        buttonGroup1.add(BotaoResposta2);
        BotaoResposta2.setText("jRadioButton2");

        buttonGroup1.add(BotaoResposta3);
        BotaoResposta3.setText("jRadioButton3");

        buttonGroup1.add(BotaoResposta4);
        BotaoResposta4.setText("jRadioButton4");

        botaoPular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoPular.setText("Pular");
        botaoPular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPularActionPerformed(evt);
            }
        });

        botaoResponder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoResponder.setText("Responder");
        botaoResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResponderActionPerformed(evt);
            }
        });

        labelAcertos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAcertos.setText("jLabel1");

        labelErro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelErro.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(BotaoResposta1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BotaoResposta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BotaoResposta3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BotaoResposta4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoResponder)
                                .addGap(26, 26, 26)
                                .addComponent(botaoPular)))
                        .addGap(81, 81, 81)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelErro)
                    .addComponent(labelAcertos))
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelQuestao)
                .addGap(21, 21, 21)
                .addComponent(BotaoResposta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoResposta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoResposta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoResposta4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(labelAcertos)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPular)
                    .addComponent(botaoResponder)
                    .addComponent(labelErro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResponderActionPerformed
        if (!BotaoResposta1.isSelected() && !BotaoResposta2.isSelected() && !BotaoResposta3.isSelected() && !BotaoResposta4.isSelected()) {
            JOptionPane.showMessageDialog(null, "Escolha pelo menos uma alternativa");
        } else {
            String alternativaEscolhida = "";
            if (BotaoResposta1.isSelected()) {
                alternativaEscolhida = BotaoResposta1.getText();
            } else if (BotaoResposta2.isSelected()) {
                alternativaEscolhida = BotaoResposta2.getText();
            } else if (BotaoResposta3.isSelected()) {
                alternativaEscolhida = BotaoResposta3.getText();
            } else if (BotaoResposta4.isSelected()) {
                alternativaEscolhida = BotaoResposta4.getText();
            }
            if (alternativaEscolhida.equals(respCorreta)) {
                acertos++;
            } else {
                erros++;
            }
            atualizaQuestoes();
        }
        if ((acertos + erros) == 10) {
             this.setVisible(false);
             CadastrarJogador.CadastrarJogador(acertos);
             this.dispose();
             TelaInicial tela = new TelaInicial();
             tela.setVisible(true);
        }


    }//GEN-LAST:event_botaoResponderActionPerformed

    private void botaoPularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPularActionPerformed
        quantidadePular--;
        atualizaQuestoes();
        if(quantidadePular == 0){
            botaoPular.setEnabled(false);
        }
    }//GEN-LAST:event_botaoPularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotaoResposta1;
    private javax.swing.JRadioButton BotaoResposta2;
    private javax.swing.JRadioButton BotaoResposta3;
    private javax.swing.JRadioButton BotaoResposta4;
    private javax.swing.JToggleButton botaoPular;
    private javax.swing.JButton botaoResponder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel labelAcertos;
    private javax.swing.JLabel labelErro;
    private javax.swing.JLabel labelQuestao;
    // End of variables declaration//GEN-END:variables
}
