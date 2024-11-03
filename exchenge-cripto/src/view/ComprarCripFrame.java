package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ComprarCripFrame extends javax.swing.JFrame {

    
    public ComprarCripFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
    }

    public void setBuComprarBitcoin(JButton buComprarBitcoin) {
        this.buComprarBitcoin = buComprarBitcoin;
    }

    public void setBuComprarEthereum(JButton buComprarEthereum) {
        this.buComprarEthereum = buComprarEthereum;
    }

    public void setBuComprarRipple(JButton buComprarRipple) {
        this.buComprarRipple = buComprarRipple;
    }

    public void setBuMenu(JButton buMenu) {
        this.buMenu = buMenu;
    }

    public void setjLValorBitcoin(JLabel jLValorBitcoin) {
        this.jLValorBitcoin = jLValorBitcoin;
    }

    public void setjLValorEtherium(JLabel jLValorEtherium) {
        this.jLValorEtherium = jLValorEtherium;
    }

    public void setjLValorRipple(JLabel jLValorRipple) {
        this.jLValorRipple = jLValorRipple;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setTextQuantidade(JTextField textQuantidade) {
        this.textQuantidade = textQuantidade;
    }
    
    
    
    public JButton getBuComprarBitcoin() {
        return buComprarBitcoin;
    }

    public JButton getBuComprarEthereum() {
        return buComprarEthereum;
    }

    public JButton getBuComprarRipple() {
        return buComprarRipple;
    }

    public JButton getBuMenu() {
        return buMenu;
    }

    public JLabel getjLValorBitcoin() {
        return jLValorBitcoin;
    }

    public JLabel getjLValorEtherium() {
        return jLValorEtherium;
    }

    public JLabel getjLValorRipple() {
        return jLValorRipple;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JTextField getTextQuantidade() {
        return textQuantidade;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLValorEtherium = new javax.swing.JLabel();
        jLValorRipple = new javax.swing.JLabel();
        jLValorBitcoin = new javax.swing.JLabel();
        buComprarEthereum = new javax.swing.JButton();
        buComprarRipple = new javax.swing.JButton();
        buComprarBitcoin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textQuantidade = new javax.swing.JTextField();
        buMenu = new javax.swing.JButton();

        jLabel1.setText("Ethreum:");

        jLabel2.setText("Ripple:");

        jLabel3.setText("Bitcoin:");

        buComprarEthereum.setBackground(new java.awt.Color(255, 255, 255));
        buComprarEthereum.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buComprarEthereum.setForeground(new java.awt.Color(255, 0, 0));
        buComprarEthereum.setText("Comprar");
        buComprarEthereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buComprarEthereumActionPerformed(evt);
            }
        });

        buComprarRipple.setBackground(new java.awt.Color(255, 255, 255));
        buComprarRipple.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buComprarRipple.setForeground(new java.awt.Color(255, 0, 0));
        buComprarRipple.setText("Comprar");
        buComprarRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buComprarRippleActionPerformed(evt);
            }
        });

        buComprarBitcoin.setBackground(new java.awt.Color(255, 255, 255));
        buComprarBitcoin.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buComprarBitcoin.setForeground(new java.awt.Color(255, 0, 0));
        buComprarBitcoin.setText("Comprar");
        buComprarBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buComprarBitcoinActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade:");

        buMenu.setBackground(new java.awt.Color(255, 255, 255));
        buMenu.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buMenu.setForeground(new java.awt.Color(255, 0, 0));
        buMenu.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLValorBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLValorRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLValorEtherium, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buComprarEthereum)
                            .addComponent(buComprarRipple)
                            .addComponent(buComprarBitcoin)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buMenu)
                            .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLValorRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLValorEtherium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buComprarEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(buComprarRipple, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(buComprarBitcoin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)))
                    .addComponent(jLValorBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(buMenu)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buComprarEthereumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buComprarEthereumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buComprarEthereumActionPerformed

    private void buComprarRippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buComprarRippleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buComprarRippleActionPerformed

    private void buComprarBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buComprarBitcoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buComprarBitcoinActionPerformed

   
 
    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buComprarBitcoin;
    private javax.swing.JButton buComprarEthereum;
    private javax.swing.JButton buComprarRipple;
    private javax.swing.JButton buMenu;
    private javax.swing.JLabel jLValorBitcoin;
    private javax.swing.JLabel jLValorEtherium;
    private javax.swing.JLabel jLValorRipple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textQuantidade;
    // End of variables declaration//GEN-END:variables
}
