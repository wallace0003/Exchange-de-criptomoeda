package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;


public class ConsulSaldoFrame extends javax.swing.JFrame {

    
    public ConsulSaldoFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
    }

    public JPasswordField getTextSenha() {
        return textSenha;
    }

    public void setTextSenha(JPasswordField textSenha) {
        this.textSenha = textSenha;
    }

    public void setcLogin(ControllerLogin cLogin) {
        this.cLogin = cLogin;
    }

    public void setjBConsultarSaldo(JButton jBConsultarSaldo) {
        this.jBConsultarSaldo = jBConsultarSaldo;
    }

    public void setjBMenu(JButton jBMenu) {
        this.jBMenu = jBMenu;
    }

    public void setjLValorBitcoin(JLabel jLValorBitcoin) {
        this.jLValorBitcoin = jLValorBitcoin;
    }

    public void setjLValorEthereum(JLabel jLValorEthereum) {
        this.jLValorEthereum = jLValorEthereum;
    }

    public void setjLValorRipple(JLabel jLValorRipple) {
        this.jLValorRipple = jLValorRipple;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
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

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public void setjLvalorReais(JLabel jLvalorReais) {
        this.jLvalorReais = jLvalorReais;
    }

    public ControllerLogin getcLogin() {
        return cLogin;
    }

    public JButton getjBConsultarSaldo() {
        return jBConsultarSaldo;
    }

    public JButton getjBMenu() {
        return jBMenu;
    }

    public JLabel getjLValorBitcoin() {
        return jLValorBitcoin;
    }

    public JLabel getjLValorEthereum() {
        return jLValorEthereum;
    }

    public JLabel getjLValorRipple() {
        return jLValorRipple;
    }

    public JLabel getjLabel2() {
        return jLabel2;
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

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public JLabel getjLvalorReais() {
        return jLvalorReais;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jBMenu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jBConsultarSaldo = new javax.swing.JButton();
        textSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLvalorReais = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLValorBitcoin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLValorEthereum = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLValorRipple = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 376, -1, -1));

        jBMenu.setBackground(new java.awt.Color(51, 255, 255));
        jBMenu.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jBMenu.setForeground(new java.awt.Color(0, 0, 51));
        jBMenu.setText("Menu");
        jBMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jBMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 170, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Senha:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jBConsultarSaldo.setBackground(new java.awt.Color(51, 255, 255));
        jBConsultarSaldo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jBConsultarSaldo.setForeground(new java.awt.Color(0, 0, 51));
        jBConsultarSaldo.setText("Consultar saldo");
        jBConsultarSaldo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(jBConsultarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 170, -1));

        textSenha.setBackground(new java.awt.Color(102, 102, 102));
        textSenha.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        textSenha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 120, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Reais:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jLvalorReais.setBackground(new java.awt.Color(255, 255, 255));
        jLvalorReais.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLvalorReais.setForeground(new java.awt.Color(255, 255, 255));
        jLvalorReais.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLvalorReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 93, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Bitcoin:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLValorBitcoin.setBackground(new java.awt.Color(255, 255, 255));
        jLValorBitcoin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLValorBitcoin.setForeground(new java.awt.Color(255, 255, 255));
        jLValorBitcoin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLValorBitcoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 93, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Ethereum:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLValorEthereum.setBackground(new java.awt.Color(255, 255, 255));
        jLValorEthereum.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLValorEthereum.setForeground(new java.awt.Color(255, 255, 255));
        jLValorEthereum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLValorEthereum, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 93, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Ripple:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLValorRipple.setBackground(new java.awt.Color(255, 255, 255));
        jLValorRipple.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLValorRipple.setForeground(new java.awt.Color(255, 255, 255));
        jLValorRipple.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLValorRipple, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 93, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoSaldo (1).jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarSaldoActionPerformed
        cLogin.exibeSaldo();
    }//GEN-LAST:event_jBConsultarSaldoActionPerformed

    private void jBMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuActionPerformed
        cLogin.consulParaMenu();
    }//GEN-LAST:event_jBMenuActionPerformed


    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultarSaldo;
    private javax.swing.JButton jBMenu;
    private javax.swing.JLabel jLValorBitcoin;
    private javax.swing.JLabel jLValorEthereum;
    private javax.swing.JLabel jLValorRipple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLvalorReais;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
