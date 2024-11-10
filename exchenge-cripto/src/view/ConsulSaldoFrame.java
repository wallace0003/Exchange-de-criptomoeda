package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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

    

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
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

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
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

    public JLabel getjLabel11() {
        return jLabel11;
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

    public JPanel getjPanel1() {
        return jPanel1;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLvalorReais = new javax.swing.JLabel();
        jLValorRipple = new javax.swing.JLabel();
        jLValorEthereum = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLValorBitcoin = new javax.swing.JLabel();
        jBMenu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jBConsultarSaldo = new javax.swing.JButton();
        textSenha = new javax.swing.JPasswordField();

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Reais:");

        jLabel5.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Bitcoin:");

        jLabel6.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ethereum:");

        jLabel7.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ripple:");

        jLvalorReais.setBackground(new java.awt.Color(255, 255, 255));
        jLvalorReais.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N

        jLValorRipple.setBackground(new java.awt.Color(255, 255, 255));
        jLValorRipple.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N

        jLValorEthereum.setBackground(new java.awt.Color(255, 255, 255));
        jLValorEthereum.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));

        jLValorBitcoin.setBackground(new java.awt.Color(255, 255, 255));
        jLValorBitcoin.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLValorBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLValorEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(30, 30, 30)
                            .addComponent(jLValorRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(24, 24, 24)
                            .addComponent(jLvalorReais, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(190, 190, 190)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLvalorReais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLValorBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLValorEthereum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLValorRipple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );

        jBMenu.setBackground(new java.awt.Color(255, 255, 255));
        jBMenu.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jBMenu.setForeground(new java.awt.Color(255, 0, 0));
        jBMenu.setText("Menu");
        jBMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Senha:");

        jBConsultarSaldo.setBackground(new java.awt.Color(255, 255, 255));
        jBConsultarSaldo.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jBConsultarSaldo.setForeground(new java.awt.Color(255, 0, 0));
        jBConsultarSaldo.setText("Consultar saldo");
        jBConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarSaldoActionPerformed(evt);
            }
        });

        textSenha.setBackground(new java.awt.Color(204, 204, 204));
        textSenha.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBConsultarSaldo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMenu)
                    .addComponent(jBConsultarSaldo)))
        );

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLvalorReais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
