
package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class LoginFrame extends javax.swing.JFrame {
    
    public LoginFrame(ControllerLogin cLogin){
        initComponents();
        this.cLogin = cLogin;
    }

    public void setTextSenha(JPasswordField textSenha) {
        this.textSenha = textSenha;
    }
    
    public JPasswordField getTextSenha() {
        return textSenha;
    }

    public void setBuCadastro(JButton buCadastro) {
        this.buCadastro = buCadastro;
    }

    public void setBuEntrar(JButton buEntrar) {
        this.buEntrar = buEntrar;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setTextCpf(JTextField textCpf) {
        this.textCpf = textCpf;
    }

    public JButton getBuCadastro() {
        return buCadastro;
    }

    public JButton getBuEntrar() {
        return buEntrar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JTextField getTextCpf() {
        return textCpf;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buCadastro = new javax.swing.JButton();
        buEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textSenha.setBackground(new java.awt.Color(102, 102, 102));
        textSenha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textSenha.setForeground(new java.awt.Color(255, 255, 255));
        textSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Senha:");

        textCpf.setBackground(new java.awt.Color(102, 102, 102));
        textCpf.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textCpf.setForeground(new java.awt.Color(255, 255, 255));
        textCpf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("CPF:");

        buCadastro.setBackground(new java.awt.Color(51, 255, 255));
        buCadastro.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        buCadastro.setForeground(new java.awt.Color(0, 0, 51));
        buCadastro.setText("Cadastrar");
        buCadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buCadastroActionPerformed(evt);
            }
        });

        buEntrar.setBackground(new java.awt.Color(51, 255, 255));
        buEntrar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        buEntrar.setForeground(new java.awt.Color(0, 0, 51));
        buEntrar.setText("Entrar");
        buEntrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buEntrarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/0c6307cb-2ec6-4094-abb2-9af091bd5d84.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(buCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(buEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(buCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(buEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buEntrarActionPerformed
        cLogin.realizarLogin();
    }//GEN-LAST:event_buEntrarActionPerformed

    private void buCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buCadastroActionPerformed
        cLogin.irCadastrar();
    }//GEN-LAST:event_buCadastroActionPerformed

    private void textCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCpfActionPerformed

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

    
    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buCadastro;
    private javax.swing.JButton buEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textCpf;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
