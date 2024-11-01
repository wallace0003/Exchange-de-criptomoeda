
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ConsulExtratoView extends javax.swing.JFrame {

    public ConsulExtratoView() {
        initComponents();
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

    public void setTextSenha(JTextField textSenha) {
        this.textSenha = textSenha;
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

    public JTextField getTextSenha() {
        return textSenha;
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        textSenha = new javax.swing.JTextField();
        buConsultarExtrato = new javax.swing.JButton();
        buMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaExtrato = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        jLabel1.setText("Senha:");

        buConsultarExtrato.setBackground(new java.awt.Color(255, 255, 255));
        buConsultarExtrato.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buConsultarExtrato.setForeground(new java.awt.Color(255, 0, 0));
        buConsultarExtrato.setText("Consultar extrato");

        buMenu.setBackground(new java.awt.Color(255, 255, 255));
        buMenu.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buMenu.setForeground(new java.awt.Color(255, 0, 0));
        buMenu.setText("Menu");

        textAreaExtrato.setColumns(20);
        textAreaExtrato.setRows(5);
        textAreaExtrato.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setViewportView(textAreaExtrato);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(buConsultarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buConsultarExtrato)
                    .addComponent(buMenu))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buConsultarExtrato;
    private javax.swing.JButton buMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea textAreaExtrato;
    private javax.swing.JTextField textSenha;
    // End of variables declaration//GEN-END:variables
}
