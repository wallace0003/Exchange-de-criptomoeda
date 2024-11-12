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

    public void setcLogin(ControllerLogin cLogin) {
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

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
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

    public JLabel getjLabel2() {
        return jLabel2;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buComprarEthereum = new javax.swing.JButton();
        buComprarRipple = new javax.swing.JButton();
        buComprarBitcoin = new javax.swing.JButton();
        buMenu = new javax.swing.JButton();
        textValorRipple = new javax.swing.JTextField();
        textValorEthereum = new javax.swing.JTextField();
        textValorBitcoin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLBitcoin = new javax.swing.JLabel();
        jLEthereum = new javax.swing.JLabel();
        jLRipple = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Ethreum:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Ripple:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Bitcoin:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        buComprarEthereum.setBackground(new java.awt.Color(51, 255, 255));
        buComprarEthereum.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buComprarEthereum.setForeground(new java.awt.Color(0, 0, 51));
        buComprarEthereum.setText("Comprar");
        buComprarEthereum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buComprarEthereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buComprarEthereumActionPerformed(evt);
            }
        });
        getContentPane().add(buComprarEthereum, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        buComprarRipple.setBackground(new java.awt.Color(51, 255, 255));
        buComprarRipple.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buComprarRipple.setForeground(new java.awt.Color(0, 0, 51));
        buComprarRipple.setText("Comprar");
        buComprarRipple.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buComprarRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buComprarRippleActionPerformed(evt);
            }
        });
        getContentPane().add(buComprarRipple, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        buComprarBitcoin.setBackground(new java.awt.Color(51, 255, 255));
        buComprarBitcoin.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buComprarBitcoin.setForeground(new java.awt.Color(0, 0, 51));
        buComprarBitcoin.setText("Comprar");
        buComprarBitcoin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buComprarBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buComprarBitcoinActionPerformed(evt);
            }
        });
        getContentPane().add(buComprarBitcoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        buMenu.setBackground(new java.awt.Color(51, 255, 255));
        buMenu.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buMenu.setForeground(new java.awt.Color(0, 0, 51));
        buMenu.setText("Menu");
        buMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buMenuActionPerformed(evt);
            }
        });
        getContentPane().add(buMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 150, -1));

        textValorRipple.setBackground(new java.awt.Color(102, 102, 102));
        textValorRipple.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        textValorRipple.setForeground(new java.awt.Color(255, 255, 255));
        textValorRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorRippleActionPerformed(evt);
            }
        });
        getContentPane().add(textValorRipple, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 106, -1));

        textValorEthereum.setBackground(new java.awt.Color(102, 102, 102));
        textValorEthereum.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        textValorEthereum.setForeground(new java.awt.Color(255, 255, 255));
        textValorEthereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorEthereumActionPerformed(evt);
            }
        });
        getContentPane().add(textValorEthereum, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 106, -1));

        textValorBitcoin.setBackground(new java.awt.Color(102, 102, 102));
        textValorBitcoin.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        textValorBitcoin.setForeground(new java.awt.Color(255, 255, 255));
        textValorBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorBitcoinActionPerformed(evt);
            }
        });
        getContentPane().add(textValorBitcoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 106, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("R$");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Bitcoin:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ethereum:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Ripple:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLBitcoin.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLBitcoin.setForeground(new java.awt.Color(255, 255, 255));
        jLBitcoin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLBitcoin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLBitcoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 102, 20));

        jLEthereum.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLEthereum.setForeground(new java.awt.Color(255, 255, 255));
        jLEthereum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLEthereum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLEthereum, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 102, 20));

        jLRipple.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLRipple.setForeground(new java.awt.Color(255, 255, 255));
        jLRipple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLRipple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLRipple, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 102, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("R$");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 14));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("R$");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, 14));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Cotação de cada criptomoeda ->");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("R$");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("R$");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("R$");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoExchenge (1).jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buComprarEthereumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buComprarEthereumActionPerformed
        cLogin.comprarEthereum();
    }//GEN-LAST:event_buComprarEthereumActionPerformed

    private void buComprarRippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buComprarRippleActionPerformed
        cLogin.comprarRipple();
    }//GEN-LAST:event_buComprarRippleActionPerformed

    private void buComprarBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buComprarBitcoinActionPerformed
        cLogin.comprarBitcoin();
    }//GEN-LAST:event_buComprarBitcoinActionPerformed

    private void textValorRippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValorRippleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValorRippleActionPerformed

    private void textValorEthereumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValorEthereumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValorEthereumActionPerformed

    private void textValorBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValorBitcoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValorBitcoinActionPerformed

    private void buMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buMenuActionPerformed
        cLogin.comprarCripParaMenu();
    }//GEN-LAST:event_buMenuActionPerformed

   
 
    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buComprarBitcoin;
    private javax.swing.JButton buComprarEthereum;
    private javax.swing.JButton buComprarRipple;
    private javax.swing.JButton buMenu;
    private javax.swing.JLabel jLBitcoin;
    private javax.swing.JLabel jLEthereum;
    private javax.swing.JLabel jLRipple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
