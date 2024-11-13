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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Ethereum:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Bitcoin:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        buVenderEthereum.setBackground(new java.awt.Color(51, 255, 255));
        buVenderEthereum.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buVenderEthereum.setForeground(new java.awt.Color(0, 0, 51));
        buVenderEthereum.setText("Vender");
        buVenderEthereum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buVenderEthereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVenderEthereumActionPerformed(evt);
            }
        });
        getContentPane().add(buVenderEthereum, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 90, -1));

        buVenderRipple.setBackground(new java.awt.Color(51, 255, 255));
        buVenderRipple.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buVenderRipple.setForeground(new java.awt.Color(0, 0, 51));
        buVenderRipple.setText("Vender");
        buVenderRipple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buVenderRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVenderRippleActionPerformed(evt);
            }
        });
        getContentPane().add(buVenderRipple, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 90, -1));

        buVenderBitcoin.setBackground(new java.awt.Color(51, 255, 255));
        buVenderBitcoin.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buVenderBitcoin.setForeground(new java.awt.Color(0, 0, 51));
        buVenderBitcoin.setText("Vender");
        buVenderBitcoin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buVenderBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVenderBitcoinActionPerformed(evt);
            }
        });
        getContentPane().add(buVenderBitcoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 90, -1));

        buMenu.setBackground(new java.awt.Color(51, 255, 255));
        buMenu.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buMenu.setForeground(new java.awt.Color(0, 0, 51));
        buMenu.setText("Menu");
        buMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buMenuActionPerformed(evt);
            }
        });
        getContentPane().add(buMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 160, -1));

        textValorBitcoin.setBackground(new java.awt.Color(102, 102, 102));
        textValorBitcoin.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        textValorBitcoin.setForeground(new java.awt.Color(255, 255, 255));
        textValorBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorBitcoinActionPerformed(evt);
            }
        });
        getContentPane().add(textValorBitcoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 121, -1));

        textValorEthereum.setBackground(new java.awt.Color(102, 102, 102));
        textValorEthereum.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        textValorEthereum.setForeground(new java.awt.Color(255, 255, 255));
        textValorEthereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorEthereumActionPerformed(evt);
            }
        });
        getContentPane().add(textValorEthereum, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 121, -1));

        textValorRipple.setBackground(new java.awt.Color(102, 102, 102));
        textValorRipple.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        textValorRipple.setForeground(new java.awt.Color(255, 255, 255));
        textValorRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorRippleActionPerformed(evt);
            }
        });
        getContentPane().add(textValorRipple, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 121, -1));

        jLEthereum.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLEthereum.setForeground(new java.awt.Color(255, 255, 255));
        jLEthereum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLEthereum, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 102, 20));

        jLRipple.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLRipple.setForeground(new java.awt.Color(255, 255, 255));
        jLRipple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLRipple, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 102, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("R$");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 20));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("R$");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 3, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Cotação Criptomoedas → ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("R$");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, -1, 18));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("BTC:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("ETH:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("XRP:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        jLBitcoin.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLBitcoin.setForeground(new java.awt.Color(255, 255, 255));
        jLBitcoin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLBitcoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 102, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Ripple:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ETH");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("XRP");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("BTC");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoExchenge (1).jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void textValorEthereumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValorEthereumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValorEthereumActionPerformed


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
