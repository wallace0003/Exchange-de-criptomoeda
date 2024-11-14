package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ConsulExtratoFrame extends javax.swing.JFrame {

    public ConsulExtratoFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
    }

    public void setTextSenha(JPasswordField textSenha) {
        this.textSenha = textSenha;
    }

    public JPasswordField getTextSenha() {
        return textSenha;
    }
    

    public void setBuConsultarExtrato(JButton buConsultarExtrato) {
        this.buConsultarExtrato = buConsultarExtrato;
    }

    public void setBuMenu(JButton buMenu) {
        this.buMenu = buMenu;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public void setTextAreaExtrato(JTextArea textAreaExtrato) {
        this.textAreaExtrato = textAreaExtrato;
    }

    public JButton getBuConsultarExtrato() {
        return buConsultarExtrato;
    }

    public JButton getBuMenu() {
        return buMenu;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public JTextArea getTextAreaExtrato() {
        return textAreaExtrato;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        buConsultarExtrato = new javax.swing.JButton();
        buMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaExtrato = new javax.swing.JTextArea();
        textSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Senha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 24));

        buConsultarExtrato.setBackground(new java.awt.Color(102, 255, 255));
        buConsultarExtrato.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        buConsultarExtrato.setForeground(new java.awt.Color(0, 0, 51));
        buConsultarExtrato.setText("Consultar extrato");
        buConsultarExtrato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buConsultarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buConsultarExtratoActionPerformed(evt);
            }
        });
        getContentPane().add(buConsultarExtrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 188, -1));

        buMenu.setBackground(new java.awt.Color(102, 255, 255));
        buMenu.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        buMenu.setForeground(new java.awt.Color(0, 0, 51));
        buMenu.setText("Menu");
        buMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buMenuActionPerformed(evt);
            }
        });
        getContentPane().add(buMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 188, -1));

        textAreaExtrato.setBackground(new java.awt.Color(0, 0, 51));
        textAreaExtrato.setColumns(20);
        textAreaExtrato.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textAreaExtrato.setForeground(new java.awt.Color(255, 255, 255));
        textAreaExtrato.setRows(5);
        textAreaExtrato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setViewportView(textAreaExtrato);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 303, 290));

        textSenha.setBackground(new java.awt.Color(102, 102, 102));
        textSenha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textSenha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 193, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoSaldo .jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 487));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buMenuActionPerformed
        cLogin.extratoParaMenu();
    }//GEN-LAST:event_buMenuActionPerformed

    private void buConsultarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buConsultarExtratoActionPerformed
        cLogin.consulExtrato();
    }//GEN-LAST:event_buConsultarExtratoActionPerformed


    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buConsultarExtrato;
    private javax.swing.JButton buMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea textAreaExtrato;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
