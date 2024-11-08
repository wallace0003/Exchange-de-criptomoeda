package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VendeCripFrame extends javax.swing.JFrame {

   
    public VendeCripFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
    }

    public void setcLogin(ControllerLogin cLogin) {
        this.cLogin = cLogin;
    }

    public void setBuMenu(JButton buMenu) {
        this.buMenu = buMenu;
    }

    public void setBuVenderBitcoin(JButton buVenderBitcoin) {
        this.buVenderBitcoin = buVenderBitcoin;
    }

    public void setBuVenderEthereum(JButton buVenderEthereum) {
        this.buVenderEthereum = buVenderEthereum;
    }

    public void setBuVenderRipple(JButton buVenderRipple) {
        this.buVenderRipple = buVenderRipple;
    }

    public void setjLBitcoin(JLabel jLBitcoin) {
        this.jLBitcoin = jLBitcoin;
    }

    public void setjLEthereum(JLabel jLEthereum) {
        this.jLEthereum = jLEthereum;
    }

    public void setjLRipple(JLabel jLRipple) {
        this.jLRipple = jLRipple;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public void setTextValorBitcoin(JTextField textValorBitcoin) {
        this.textValorBitcoin = textValorBitcoin;
    }

    public void setTextValorEthereum(JTextField textValorEthereum) {
        this.textValorEthereum = textValorEthereum;
    }

    public void setTextValorRipple(JTextField textValorRipple) {
        this.textValorRipple = textValorRipple;
    }
    

    public ControllerLogin getcLogin() {
        return cLogin;
    }

    public JButton getBuMenu() {
        return buMenu;
    }

    public JButton getBuVenderBitcoin() {
        return buVenderBitcoin;
    }

    public JButton getBuVenderEthereum() {
        return buVenderEthereum;
    }

    public JButton getBuVenderRipple() {
        return buVenderRipple;
    }

    public JLabel getjLBitcoin() {
        return jLBitcoin;
    }

    public JLabel getjLEthereum() {
        return jLEthereum;
    }

    public JLabel getjLRipple() {
        return jLRipple;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public JTextField getTextValorBitcoin() {
        return textValorBitcoin;
    }

    public JTextField getTextValorEthereum() {
        return textValorEthereum;
    }

    public JTextField getTextValorRipple() {
        return textValorRipple;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buVenderEthereum = new javax.swing.JButton();
        buVenderRipple = new javax.swing.JButton();
        buVenderBitcoin = new javax.swing.JButton();
        buMenu = new javax.swing.JButton();
        textValorBitcoin = new javax.swing.JTextField();
        textValorEthereum = new javax.swing.JTextField();
        textValorRipple = new javax.swing.JTextField();
        jLEthereum = new javax.swing.JLabel();
        jLRipple = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLBitcoin = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("URW Bookman", 1, 13)); // NOI18N
        jLabel1.setText("Ethereum:");

        jLabel3.setFont(new java.awt.Font("URW Bookman", 1, 13)); // NOI18N
        jLabel3.setText("Bitcoin:");

        buVenderEthereum.setBackground(new java.awt.Color(255, 255, 255));
        buVenderEthereum.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buVenderEthereum.setForeground(new java.awt.Color(255, 0, 0));
        buVenderEthereum.setText("Vender");
        buVenderEthereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVenderEthereumActionPerformed(evt);
            }
        });

        buVenderRipple.setBackground(new java.awt.Color(255, 255, 255));
        buVenderRipple.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buVenderRipple.setForeground(new java.awt.Color(255, 0, 0));
        buVenderRipple.setText("Vender");
        buVenderRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVenderRippleActionPerformed(evt);
            }
        });

        buVenderBitcoin.setBackground(new java.awt.Color(255, 255, 255));
        buVenderBitcoin.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buVenderBitcoin.setForeground(new java.awt.Color(255, 0, 0));
        buVenderBitcoin.setText("Vender");
        buVenderBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVenderBitcoinActionPerformed(evt);
            }
        });

        buMenu.setBackground(new java.awt.Color(255, 255, 255));
        buMenu.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buMenu.setForeground(new java.awt.Color(255, 0, 0));
        buMenu.setText("Menu");
        buMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buMenuActionPerformed(evt);
            }
        });

        textValorBitcoin.setFont(new java.awt.Font("URW Bookman", 0, 15)); // NOI18N
        textValorBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorBitcoinActionPerformed(evt);
            }
        });

        textValorEthereum.setFont(new java.awt.Font("URW Bookman", 0, 15)); // NOI18N

        textValorRipple.setFont(new java.awt.Font("URW Bookman", 0, 15)); // NOI18N
        textValorRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorRippleActionPerformed(evt);
            }
        });

        jLEthereum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLEthereum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLRipple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLRipple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel9.setText("R$");

        jLabel10.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel10.setText("R$");

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("URW Bookman", 1, 18)); // NOI18N
        jLabel7.setText("Cotação de cada criptomoeda ->");

        jLabel11.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel11.setText("R$");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Bitcoin:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Ethereum:");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Ripple:");

        jLBitcoin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLBitcoin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("URW Bookman", 1, 13)); // NOI18N
        jLabel8.setText("Ripple:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGap(1, 1, 1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textValorEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textValorRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textValorBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buVenderRipple)
                                    .addComponent(buVenderBitcoin)
                                    .addComponent(buVenderEthereum)))
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLEthereum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLRipple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLBitcoin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                .addComponent(jLRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buVenderEthereum)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textValorEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buVenderRipple)
                    .addComponent(textValorRipple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buVenderBitcoin)
                    .addComponent(textValorBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(71, 71, 71)
                .addComponent(buMenu))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buVenderEthereumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buVenderEthereumActionPerformed
        cLogin.venderEthereum();
    }//GEN-LAST:event_buVenderEthereumActionPerformed

    private void buVenderRippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buVenderRippleActionPerformed
        cLogin.venderRipple();
    }//GEN-LAST:event_buVenderRippleActionPerformed

    private void buVenderBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buVenderBitcoinActionPerformed
        cLogin.venderBitcoin();
    }//GEN-LAST:event_buVenderBitcoinActionPerformed

    private void textValorBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValorBitcoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValorBitcoinActionPerformed

    private void textValorRippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValorRippleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValorRippleActionPerformed

    private void buMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buMenuActionPerformed
        cLogin.venderCripParaMenu();
    }//GEN-LAST:event_buMenuActionPerformed


    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buMenu;
    private javax.swing.JButton buVenderBitcoin;
    private javax.swing.JButton buVenderEthereum;
    private javax.swing.JButton buVenderRipple;
    private javax.swing.JLabel jLBitcoin;
    private javax.swing.JLabel jLEthereum;
    private javax.swing.JLabel jLRipple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField textValorBitcoin;
    private javax.swing.JTextField textValorEthereum;
    private javax.swing.JTextField textValorRipple;
    // End of variables declaration//GEN-END:variables
}
