
package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class LoginFrame extends javax.swing.JFrame {
    
    public LoginFrame(ControllerLogin cLogin){
        initComponents();
        this.cLogin = cLogin;
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

    public void setTextSenha(JTextField textSenha) {
        this.textSenha = textSenha;
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

    public JTextField getTextSenha() {
        return textSenha;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buCadastro = new javax.swing.JButton();
        buEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        textSenha = new javax.swing.JTextField();

        buCadastro.setBackground(new java.awt.Color(255, 255, 255));
        buCadastro.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        buCadastro.setForeground(new java.awt.Color(255, 0, 0));
        buCadastro.setText("Cadastrar");
        buCadastro.setBorder(new javax.swing.border.MatteBorder(null));
        buCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buCadastroActionPerformed(evt);
            }
        });

        buEntrar.setBackground(new java.awt.Color(255, 255, 255));
        buEntrar.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        buEntrar.setForeground(new java.awt.Color(255, 0, 0));
        buEntrar.setText("Entrar");
        buEntrar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        buEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        jLabel1.setText("CPF:");

        jLabel2.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        jLabel2.setText("Senha:");

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(buCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(buEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buCadastroActionPerformed
        cLogin.irCadastrar();
    }//GEN-LAST:event_buCadastroActionPerformed

    private void buEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buEntrarActionPerformed
        cLogin.realizarLogin();
    }//GEN-LAST:event_buEntrarActionPerformed

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

    
    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buCadastro;
    private javax.swing.JButton buEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textSenha;
    // End of variables declaration//GEN-END:variables
}
