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
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buConsultarSaldo.setBackground(new java.awt.Color(0, 255, 255));
        buConsultarSaldo.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        buConsultarSaldo.setForeground(new java.awt.Color(0, 0, 51));
        buConsultarSaldo.setText("Consultar Saldo");
        buConsultarSaldo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buConsultarSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(buConsultarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 188, -1));

        buConsultarExtrato.setBackground(new java.awt.Color(0, 255, 255));
        buConsultarExtrato.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        buConsultarExtrato.setForeground(new java.awt.Color(0, 0, 51));
        buConsultarExtrato.setText("Consultar extrato");
        buConsultarExtrato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buConsultarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buConsultarExtratoActionPerformed(evt);
            }
        });
        getContentPane().add(buConsultarExtrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 188, -1));

        buDepositar.setBackground(new java.awt.Color(0, 255, 255));
        buDepositar.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        buDepositar.setForeground(new java.awt.Color(0, 0, 51));
        buDepositar.setText("Depositar");
        buDepositar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buDepositarActionPerformed(evt);
            }
        });
        getContentPane().add(buDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 212, -1));

        buSacar.setBackground(new java.awt.Color(0, 255, 255));
        buSacar.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        buSacar.setForeground(new java.awt.Color(0, 0, 51));
        buSacar.setText("Sacar");
        buSacar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSacarActionPerformed(evt);
            }
        });
        getContentPane().add(buSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 212, -1));

        buComprarCri.setBackground(new java.awt.Color(0, 255, 255));
        buComprarCri.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        buComprarCri.setForeground(new java.awt.Color(0, 0, 51));
        buComprarCri.setText("Comprar Criptomoedas");
        buComprarCri.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buComprarCri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buComprarCriActionPerformed(evt);
            }
        });
        getContentPane().add(buComprarCri, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        buVenderCri.setBackground(new java.awt.Color(0, 255, 255));
        buVenderCri.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        buVenderCri.setForeground(new java.awt.Color(0, 0, 51));
        buVenderCri.setText("Vender Criptomoedas");
        buVenderCri.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buVenderCri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVenderCriActionPerformed(evt);
            }
        });
        getContentPane().add(buVenderCri, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 212, -1));

        buAtualizarCota.setBackground(new java.awt.Color(0, 255, 255));
        buAtualizarCota.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        buAtualizarCota.setForeground(new java.awt.Color(0, 0, 51));
        buAtualizarCota.setText("Atualizar cotações");
        buAtualizarCota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buAtualizarCota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buAtualizarCotaActionPerformed(evt);
            }
        });
        getContentPane().add(buAtualizarCota, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 207, -1));

        buSair.setBackground(new java.awt.Color(0, 255, 255));
        buSair.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        buSair.setForeground(new java.awt.Color(0, 0, 51));
        buSair.setText("Sair");
        buSair.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSairActionPerformed(evt);
            }
        });
        getContentPane().add(buSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 94, -1));

        jLabel1.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("CPF:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("URW Bookman", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLCpf.setBackground(new java.awt.Color(102, 102, 102));
        jLCpf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLCpf.setForeground(new java.awt.Color(255, 255, 255));
        jLCpf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 126, 19));

        jLNome.setBackground(new java.awt.Color(102, 102, 102));
        jLNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLNome.setForeground(new java.awt.Color(255, 255, 255));
        jLNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 126, 19));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Bitcoin:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Ethereum:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Ripple:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jLBitcoin.setBackground(new java.awt.Color(102, 102, 102));
        jLBitcoin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLBitcoin.setForeground(new java.awt.Color(255, 255, 255));
        jLBitcoin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLBitcoin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLBitcoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 102, 18));

        jLEthereum.setBackground(new java.awt.Color(102, 102, 102));
        jLEthereum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLEthereum.setForeground(new java.awt.Color(255, 255, 255));
        jLEthereum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLEthereum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLEthereum, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 102, 18));

        jLRipple.setBackground(new java.awt.Color(102, 102, 102));
        jLRipple.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLRipple.setForeground(new java.awt.Color(255, 255, 255));
        jLRipple.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLRipple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLRipple, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 102, 18));

        jLabel9.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel9.setText("R$");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, 18));

        jLabel10.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel10.setText("R$");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, 18));

        jLabel11.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel11.setText("R$");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, 18));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoMenu.jpeg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void buComprarCriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buComprarCriActionPerformed
        cLogin.menuParaCompraCrip();
    }//GEN-LAST:event_buComprarCriActionPerformed

    private void buVenderCriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buVenderCriActionPerformed
        cLogin.menuParaVenderCripto();
    }//GEN-LAST:event_buVenderCriActionPerformed

    private void buAtualizarCotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buAtualizarCotaActionPerformed
        cLogin.novaCotacao();
    }//GEN-LAST:event_buAtualizarCotaActionPerformed
    
    
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
