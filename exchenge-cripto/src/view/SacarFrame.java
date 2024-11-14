package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SacarFrame extends javax.swing.JFrame {

    public SacarFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
    }

    public void setcLogin(ControllerLogin cLogin) {
        this.cLogin = cLogin;
    }

    public void setBuMenu(JButton buMenu) {
        this.buMenu = buMenu;
    }

    public void setBuSacar(JButton buSacar) {
        this.buSacar = buSacar;
    }

    public void setjLValorAtual(JLabel jLValorAtual) {
        this.jLValorAtual = jLValorAtual;
    }

    public void setjLValorAtualRef(JLabel jLValorAtualRef) {
        this.jLValorAtualRef = jLValorAtualRef;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setTextValorSaque(JTextField textValorSaque) {
        this.textValorSaque = textValorSaque;
    }
    

    public ControllerLogin getcLogin() {
        return cLogin;
    }

    public JButton getBuMenu() {
        return buMenu;
    }

    public JButton getBuSacar() {
        return buSacar;
    }

    public JLabel getjLValorAtual() {
        return jLValorAtual;
    }

    public JLabel getjLValorAtualRef() {
        return jLValorAtualRef;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JTextField getTextValorSaque() {
        return textValorSaque;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textValorSaque = new javax.swing.JTextField();
        jLValorAtualRef = new javax.swing.JLabel();
        jLValorAtual = new javax.swing.JLabel();
        buSacar = new javax.swing.JButton();
        buMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Valor do saque:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        textValorSaque.setBackground(new java.awt.Color(102, 102, 102));
        textValorSaque.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        textValorSaque.setForeground(new java.awt.Color(255, 255, 255));
        textValorSaque.setBorder(null);
        getContentPane().add(textValorSaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 190, -1));

        jLValorAtualRef.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLValorAtualRef.setForeground(new java.awt.Color(204, 204, 204));
        jLValorAtualRef.setText("Saldo atual:");
        getContentPane().add(jLValorAtualRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jLValorAtual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLValorAtual.setForeground(new java.awt.Color(255, 255, 255));
        jLValorAtual.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLValorAtual.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLValorAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 150, 21));

        buSacar.setBackground(new java.awt.Color(102, 255, 255));
        buSacar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        buSacar.setForeground(new java.awt.Color(0, 0, 51));
        buSacar.setText("Sacar");
        buSacar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSacarActionPerformed(evt);
            }
        });
        getContentPane().add(buSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 180, -1));

        buMenu.setBackground(new java.awt.Color(102, 255, 255));
        buMenu.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        buMenu.setForeground(new java.awt.Color(0, 0, 51));
        buMenu.setText("Menu");
        buMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buMenuActionPerformed(evt);
            }
        });
        getContentPane().add(buMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoSaldo .jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 467));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buMenuActionPerformed
        cLogin.sacarParaMenu();
    }//GEN-LAST:event_buMenuActionPerformed

    private void buSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buSacarActionPerformed
        cLogin.sacar();
    }//GEN-LAST:event_buSacarActionPerformed

    
   
    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buMenu;
    private javax.swing.JButton buSacar;
    private javax.swing.JLabel jLValorAtual;
    private javax.swing.JLabel jLValorAtualRef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textValorSaque;
    // End of variables declaration//GEN-END:variables
}
