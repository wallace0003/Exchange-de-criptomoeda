package view;
import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class DepositarFrame extends javax.swing.JFrame {

    
    public DepositarFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
    }

    public void setcLogin(ControllerLogin cLogin) {
        this.cLogin = cLogin;
    }

    public void setBuDepositar(JButton buDepositar) {
        this.buDepositar = buDepositar;
    }

    public void setBuMenu(JButton buMenu) {
        this.buMenu = buMenu;
    }

    public void setjLValorAtual(JLabel jLValorAtual) {
        this.jLValorAtual = jLValorAtual;
    }

    public void setjLValorAtualRef(JLabel jLValorAtualRef) {
        this.jLValorAtualRef = jLValorAtualRef;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setTextValorDeposito(JTextField textValorDeposito) {
        this.textValorDeposito = textValorDeposito;
    }
    
    
    public ControllerLogin getcLogin() {
        return cLogin;
    }

    public JButton getBuDepositar() {
        return buDepositar;
    }

    public JButton getBuMenu() {
        return buMenu;
    }

    public JLabel getjLValorAtual() {
        return jLValorAtual;
    }

    public JLabel getjLValorAtualRef() {
        return jLValorAtualRef;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JTextField getTextValorDeposito() {
        return textValorDeposito;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buMenu = new javax.swing.JButton();
        buDepositar = new javax.swing.JButton();
        jLValorAtualRef = new javax.swing.JLabel();
        jLValorAtual = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textValorDeposito = new javax.swing.JTextField();

        buMenu.setBackground(new java.awt.Color(255, 255, 255));
        buMenu.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buMenu.setForeground(new java.awt.Color(255, 0, 0));
        buMenu.setText("Menu");
        buMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buMenuActionPerformed(evt);
            }
        });

        buDepositar.setBackground(new java.awt.Color(255, 255, 255));
        buDepositar.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buDepositar.setForeground(new java.awt.Color(255, 0, 0));
        buDepositar.setText("Depositar");
        buDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buDepositarActionPerformed(evt);
            }
        });

        jLValorAtualRef.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLValorAtualRef.setForeground(new java.awt.Color(0, 0, 0));
        jLValorAtualRef.setText("Saldo:");

        jLabel3.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Digite o valor de depósito no campo abaixo:");

        textValorDeposito.setBackground(new java.awt.Color(204, 204, 204));
        textValorDeposito.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLValorAtualRef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLValorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(buDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textValorDeposito))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLValorAtualRef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLValorAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(textValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buMenu)
                    .addComponent(buDepositar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buMenuActionPerformed
        cLogin.depositarParaMenu();
    }//GEN-LAST:event_buMenuActionPerformed

    private void buDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buDepositarActionPerformed
        cLogin.depositar();
    }//GEN-LAST:event_buDepositarActionPerformed


    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buDepositar;
    private javax.swing.JButton buMenu;
    private javax.swing.JLabel jLValorAtual;
    private javax.swing.JLabel jLValorAtualRef;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textValorDeposito;
    // End of variables declaration//GEN-END:variables
}
