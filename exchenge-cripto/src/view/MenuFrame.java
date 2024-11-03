package view;
import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;




public class MenuFrame extends javax.swing.JFrame {
    
    
    public MenuFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
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

        jLabel1.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CPF:");

        jLabel2.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Nome:");

        jLCpf.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        jLCpf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLNome.setFont(new java.awt.Font("URW Bookman", 3, 14)); // NOI18N
        jLNome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buSair, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buConsultarExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buConsultarSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buComprarCri))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buVenderCri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(97, 97, 97))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buAtualizarCota, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(buAtualizarCota)
                .addGap(32, 32, 32)
                .addComponent(buSair)
                .addContainerGap())
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
    private javax.swing.JLabel jLCpf;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
