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
        jLValorAtualRef1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buMenu.setBackground(new java.awt.Color(51, 255, 255));
        buMenu.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        buMenu.setForeground(new java.awt.Color(0, 0, 51));
        buMenu.setText("Menu");
        buMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buMenuActionPerformed(evt);
            }
        });
        getContentPane().add(buMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 131, -1));

        buDepositar.setBackground(new java.awt.Color(51, 255, 255));
        buDepositar.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        buDepositar.setForeground(new java.awt.Color(0, 0, 51));
        buDepositar.setText("Depositar");
        buDepositar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buDepositarActionPerformed(evt);
            }
        });
        getContentPane().add(buDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 131, -1));

        jLValorAtualRef.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLValorAtualRef.setForeground(new java.awt.Color(204, 204, 204));
        jLValorAtualRef.setText("Saldo:");
        getContentPane().add(jLValorAtualRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLValorAtual.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLValorAtual.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLValorAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 110, 21));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Digite o valor de depósito no campo abaixo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        textValorDeposito.setBackground(new java.awt.Color(102, 102, 102));
        textValorDeposito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textValorDeposito.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textValorDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 333, -1));

        jLValorAtualRef1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLValorAtualRef1.setForeground(new java.awt.Color(204, 204, 204));
        jLValorAtualRef1.setText("OBS: utilize \".\" para números com vírgula.");
        getContentPane().add(jLValorAtualRef1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoMenu.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

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
    private javax.swing.JLabel jLValorAtualRef1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textValorDeposito;
    // End of variables declaration//GEN-END:variables
}
