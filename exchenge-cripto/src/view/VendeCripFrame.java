package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VendeCripFrame extends javax.swing.JFrame {

   
    public VendeCripFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
    }

    public void setBuMenu(JButton buMenu) {
        this.buMenu = buMenu;
    }

    public void setBuVenderBitcoin(JButton buVenderBitcoin) {
        this.buVenderBitcoin = buVenderBitcoin;
    }

    public void setBuVenderEthereum(JButton buVenderEthereum) {
        this.buVenderEthereum = buVenderEthereum;
    }

    public void setBuVenderRipple(JButton buVenderRipple) {
        this.buVenderRipple = buVenderRipple;
    }

    public void setjLValorBitcoin(JLabel jLValorBitcoin) {
        this.jLValorBitcoin = jLValorBitcoin;
    }

    public void setjLValorEtherium(JLabel jLValorEtherium) {
        this.jLValorEtherium = jLValorEtherium;
    }

    public void setjLValorRipple(JLabel jLValorRipple) {
        this.jLValorRipple = jLValorRipple;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setTextQuantidade(JTextField textQuantidade) {
        this.textQuantidade = textQuantidade;
    }
    
    
    
    public JButton getBuMenu() {
        return buMenu;
    }

    public JButton getBuVenderBitcoin() {
        return buVenderBitcoin;
    }

    public JButton getBuVenderEthereum() {
        return buVenderEthereum;
    }

    public JButton getBuVenderRipple() {
        return buVenderRipple;
    }

    public JLabel getjLValorBitcoin() {
        return jLValorBitcoin;
    }

    public JLabel getjLValorEtherium() {
        return jLValorEtherium;
    }

    public JLabel getjLValorRipple() {
        return jLValorRipple;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JTextField getTextQuantidade() {
        return textQuantidade;
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLValorEtherium = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLValorRipple = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLValorBitcoin = new javax.swing.JLabel();
        buVenderEthereum = new javax.swing.JButton();
        buVenderRipple = new javax.swing.JButton();
        buVenderBitcoin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textQuantidade = new javax.swing.JTextField();
        buMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ethreum:");

        jLabel2.setText("Ripple:");

        jLabel3.setText("Bitcoin:");

        buVenderEthereum.setBackground(new java.awt.Color(255, 255, 255));
        buVenderEthereum.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buVenderEthereum.setForeground(new java.awt.Color(255, 0, 0));
        buVenderEthereum.setText("Vender");
        buVenderEthereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVenderEthereumActionPerformed(evt);
            }
        });

        buVenderRipple.setBackground(new java.awt.Color(255, 255, 255));
        buVenderRipple.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buVenderRipple.setForeground(new java.awt.Color(255, 0, 0));
        buVenderRipple.setText("Vender");
        buVenderRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVenderRippleActionPerformed(evt);
            }
        });

        buVenderBitcoin.setBackground(new java.awt.Color(255, 255, 255));
        buVenderBitcoin.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buVenderBitcoin.setForeground(new java.awt.Color(255, 0, 0));
        buVenderBitcoin.setText("Vender");
        buVenderBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVenderBitcoinActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade:");

        buMenu.setBackground(new java.awt.Color(255, 255, 255));
        buMenu.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        buMenu.setForeground(new java.awt.Color(255, 0, 0));
        buMenu.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLValorBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLValorRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLValorEtherium, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buVenderEthereum)
                    .addComponent(buVenderRipple)
                    .addComponent(buVenderBitcoin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buMenu))
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLValorEtherium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buVenderEthereum)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLValorRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buVenderRipple, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLValorBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buVenderBitcoin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addComponent(buMenu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buVenderEthereumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buVenderEthereumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buVenderEthereumActionPerformed

    private void buVenderRippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buVenderRippleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buVenderRippleActionPerformed

    private void buVenderBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buVenderBitcoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buVenderBitcoinActionPerformed


    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buMenu;
    private javax.swing.JButton buVenderBitcoin;
    private javax.swing.JButton buVenderEthereum;
    private javax.swing.JButton buVenderRipple;
    private javax.swing.JLabel jLValorBitcoin;
    private javax.swing.JLabel jLValorEtherium;
    private javax.swing.JLabel jLValorRipple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textQuantidade;
    // End of variables declaration//GEN-END:variables
}
