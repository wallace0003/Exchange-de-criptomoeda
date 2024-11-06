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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor do saque:");

        jLValorAtualRef.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLValorAtualRef.setText("Saldo atual:");

        buSacar.setBackground(new java.awt.Color(255, 255, 255));
        buSacar.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buSacar.setForeground(new java.awt.Color(255, 0, 0));
        buSacar.setText("Sacar");
        buSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSacarActionPerformed(evt);
            }
        });

        buMenu.setBackground(new java.awt.Color(255, 255, 255));
        buMenu.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buMenu.setForeground(new java.awt.Color(255, 0, 0));
        buMenu.setText("Menu");
        buMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(buSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLValorAtualRef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLValorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLValorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLValorAtualRef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buSacar)
                    .addComponent(buMenu))
                .addContainerGap())
        );

        pack();
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
    private javax.swing.JTextField textValorSaque;
    // End of variables declaration//GEN-END:variables
}
