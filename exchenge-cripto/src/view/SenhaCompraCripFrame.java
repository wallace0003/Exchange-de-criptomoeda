
package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SenhaCompraCripFrame extends javax.swing.JFrame {

    
    public SenhaCompraCripFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
    }

    public void setBuEntrar(JButton buEntrar) {
        this.buEntrar = buEntrar;
    }

    public void setBuVoltar(JButton buVoltar) {
        this.buVoltar = buVoltar;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setTextSenha(JTextField textSenha) {
        this.textSenha = textSenha;
    }
    

    public JButton getBuEntrar() {
        return buEntrar;
    }

    public JButton getBuVoltar() {
        return buVoltar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JTextField getTextSenha() {
        return textSenha;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textSenha = new javax.swing.JTextField();
        buEntrar = new javax.swing.JButton();
        buVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Senha:");

        buEntrar.setBackground(new java.awt.Color(255, 255, 255));
        buEntrar.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buEntrar.setForeground(new java.awt.Color(255, 0, 0));
        buEntrar.setText("Entrar");

        buVoltar.setBackground(new java.awt.Color(255, 255, 255));
        buVoltar.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buVoltar.setForeground(new java.awt.Color(255, 0, 0));
        buVoltar.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(buVoltar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(buEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buEntrar)
                    .addComponent(buVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buEntrar;
    private javax.swing.JButton buVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textSenha;
    // End of variables declaration//GEN-END:variables
}
