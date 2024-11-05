package view;
import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;




public class MenuFrame extends javax.swing.JFrame {
    
    
    public MenuFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
    }

    public void setcLogin(ControllerLogin cLogin) {
        this.cLogin = cLogin;
    }

    public void setjLBitcoin(JLabel jLBitcoin) {
        this.jLBitcoin = jLBitcoin;
    }

    public void setjLCpf(JLabel jLCpf) {
        this.jLCpf = jLCpf;
    }

    public void setjLEthereum(JLabel jLEthereum) {
        this.jLEthereum = jLEthereum;
    }

    public void setjLNome(JLabel jLNome) {
        this.jLNome = jLNome;
    }

    public void setjLRipple(JLabel jLRipple) {
        this.jLRipple = jLRipple;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }
    
    

    public ControllerLogin getcLogin() {
        return cLogin;
    }

    public JLabel getjLBitcoin() {
        return jLBitcoin;
    }

    public JLabel getjLEthereum() {
        return jLEthereum;
    }

    public JLabel getjLRipple() {
        return jLRipple;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }
    
    
    
    public void setjLNome(String nome) {
        jLNome.setText(nome); 
    }

    public void setjLCpf(String cpf) {
        jLCpf.setText(cpf); 
    }

    public void setBuAtualizarCota(JButton buAtualizarCota) {
        this.buAtualizarCota = buAtualizarCota;
    }

    public void setBuComprarCri(JButton buComprarCri) {
        this.buComprarCri = buComprarCri;
    }

    public void setBuConsultarExtrato(JButton buConsultarExtrato) {
        this.buConsultarExtrato = buConsultarExtrato;
    }

    public void setBuConsultarSaldo(JButton buConsultarSaldo) {
        this.buConsultarSaldo = buConsultarSaldo;
    }

    public void setBuDepositar(JButton buDepositar) {
        this.buDepositar = buDepositar;
    }

    public void setBuSacar(JButton buSacar) {
        this.buSacar = buSacar;
    }

    public void setBuSair(JButton buSair) {
        this.buSair = buSair;
    }

    public void setBuVenderCri(JButton buVenderCri) {
        this.buVenderCri = buVenderCri;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }
    
    
    
    
    
    
    public JButton getBuAtualizarCota() {
        return buAtualizarCota;
    }

    public JButton getBuComprarCri() {
        return buComprarCri;
    }

    public JButton getBuConsultarExtrato() {
        return buConsultarExtrato;
    }

    public JButton getBuConsultarSaldo() {
        return buConsultarSaldo;
    }

    public JButton getBuDepositar() {
        return buDepositar;
    }

    public JButton getBuSacar() {
        return buSacar;
    }

    public JButton getBuSair() {
        return buSair;
    }

    public JButton getBuVenderCri() {
        return buVenderCri;
    }

    public JLabel getjLCpf() {
        return jLCpf;
    }

    public JLabel getjLNome() {
        return jLNome;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buConsultarSaldo = new javax.swing.JButton();
        buConsultarExtrato = new javax.swing.JButton();
        buDepositar = new javax.swing.JButton();
        buSacar = new javax.swing.JButton();
        buComprarCri = new javax.swing.JButton();
        buVenderCri = new javax.swing.JButton();
        buAtualizarCota = new javax.swing.JButton();
        buSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLCpf = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLBitcoin = new javax.swing.JLabel();
        jLEthereum = new javax.swing.JLabel();
        jLRipple = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        buConsultarSaldo.setBackground(new java.awt.Color(255, 255, 255));
        buConsultarSaldo.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buConsultarSaldo.setForeground(new java.awt.Color(255, 0, 0));
        buConsultarSaldo.setText("Consultar Saldo");
        buConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buConsultarSaldoActionPerformed(evt);
            }
        });

        buConsultarExtrato.setBackground(new java.awt.Color(255, 255, 255));
        buConsultarExtrato.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buConsultarExtrato.setForeground(new java.awt.Color(255, 0, 0));
        buConsultarExtrato.setText("Consultar extrato");
        buConsultarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buConsultarExtratoActionPerformed(evt);
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

        buSacar.setBackground(new java.awt.Color(255, 255, 255));
        buSacar.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buSacar.setForeground(new java.awt.Color(255, 0, 0));
        buSacar.setText("Sacar");
        buSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSacarActionPerformed(evt);
            }
        });

        buComprarCri.setBackground(new java.awt.Color(255, 255, 255));
        buComprarCri.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buComprarCri.setForeground(new java.awt.Color(255, 0, 0));
        buComprarCri.setText("Comprar Criptomoedas");

        buVenderCri.setBackground(new java.awt.Color(255, 255, 255));
        buVenderCri.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buVenderCri.setForeground(new java.awt.Color(255, 0, 0));
        buVenderCri.setText("Vender Criptomoedas");

        buAtualizarCota.setBackground(new java.awt.Color(255, 255, 255));
        buAtualizarCota.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buAtualizarCota.setForeground(new java.awt.Color(255, 0, 0));
        buAtualizarCota.setText("Atualizar cotações");

        buSair.setBackground(new java.awt.Color(255, 255, 255));
        buSair.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        buSair.setForeground(new java.awt.Color(255, 0, 0));
        buSair.setText("Sair");
        buSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CPF:");

        jLabel2.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Nome:");

        jLCpf.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        jLCpf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLNome.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        jLNome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Bitcoin:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Ethereum:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Ripple:");

        jLBitcoin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLBitcoin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLEthereum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLEthereum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLRipple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLRipple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel9.setText("R$");

        jLabel10.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel10.setText("R$");

        jLabel11.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel11.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jLNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLEthereum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLRipple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buConsultarExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buConsultarSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buComprarCri))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buVenderCri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buAtualizarCota, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)))
                .addGap(0, 99, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buSair, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLBitcoin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel1))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(2, 2, 2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buDepositar)
                                    .addGap(35, 35, 35)
                                    .addComponent(buSacar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(120, 120, 120)
                                    .addComponent(buVenderCri)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buConsultarSaldo)
                                .addGap(35, 35, 35)
                                .addComponent(buConsultarExtrato)
                                .addGap(29, 29, 29)
                                .addComponent(buComprarCri)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(buAtualizarCota)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buSair))))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buSairActionPerformed
        cLogin.sair();
    }//GEN-LAST:event_buSairActionPerformed

    private void buConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buConsultarSaldoActionPerformed
        cLogin.menuParaConsul();
    }//GEN-LAST:event_buConsultarSaldoActionPerformed

    private void buDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buDepositarActionPerformed
        cLogin.menuParaDepositar();
    }//GEN-LAST:event_buDepositarActionPerformed

    private void buConsultarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buConsultarExtratoActionPerformed
        cLogin.menuParaExtrato();
    }//GEN-LAST:event_buConsultarExtratoActionPerformed

    private void buSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buSacarActionPerformed
        cLogin.menuParaSacar();
    }//GEN-LAST:event_buSacarActionPerformed
    
    
    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buAtualizarCota;
    private javax.swing.JButton buComprarCri;
    private javax.swing.JButton buConsultarExtrato;
    private javax.swing.JButton buConsultarSaldo;
    private javax.swing.JButton buDepositar;
    private javax.swing.JButton buSacar;
    private javax.swing.JButton buSair;
    private javax.swing.JButton buVenderCri;
    private javax.swing.JLabel jLBitcoin;
    private javax.swing.JLabel jLCpf;
    private javax.swing.JLabel jLEthereum;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLRipple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
