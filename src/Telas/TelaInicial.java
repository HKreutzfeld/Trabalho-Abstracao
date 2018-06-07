package Telas;

import Classes.CadastrarJogador;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escolhaCategoria = new javax.swing.JLabel();
        BotaoCarro = new javax.swing.JButton();
        BotaoEsporte = new javax.swing.JButton();
        BotaoGeografia = new javax.swing.JButton();
        BotaoRanking = new javax.swing.JToggleButton();
        BotaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo");
        setResizable(false);

        escolhaCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        escolhaCategoria.setText("Para iniciar, escolha uma categoria");

        BotaoCarro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoCarro.setText("CARROS");
        BotaoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCarroActionPerformed(evt);
            }
        });

        BotaoEsporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoEsporte.setText("ESPORTES");
        BotaoEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEsporteActionPerformed(evt);
            }
        });

        BotaoGeografia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoGeografia.setText("GEOGRAFIA");
        BotaoGeografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGeografiaActionPerformed(evt);
            }
        });

        BotaoRanking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoRanking.setText("Ranking");

        BotaoSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(escolhaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoEsporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoGeografia))
                    .addComponent(BotaoRanking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escolhaCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCarro)
                    .addComponent(BotaoEsporte)
                    .addComponent(BotaoGeografia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(BotaoRanking)
                .addGap(18, 18, 18)
                .addComponent(BotaoSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCarroActionPerformed
      
        this.dispose();
        TelaPerguntas tela = new TelaPerguntas();
        tela.setVisible(true);
    }//GEN-LAST:event_BotaoCarroActionPerformed

    private void BotaoEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEsporteActionPerformed
      
            this.dispose();
            TelaPerguntas tela = new TelaPerguntas();
            tela.setVisible(true);
        
    }//GEN-LAST:event_BotaoEsporteActionPerformed

    private void BotaoGeografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGeografiaActionPerformed

        this.dispose();
        TelaPerguntas tela = new TelaPerguntas();
        tela.setVisible(true);
    }//GEN-LAST:event_BotaoGeografiaActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSairActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCarro;
    private javax.swing.JButton BotaoEsporte;
    private javax.swing.JButton BotaoGeografia;
    private javax.swing.JToggleButton BotaoRanking;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel escolhaCategoria;
    // End of variables declaration//GEN-END:variables
}
