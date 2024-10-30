
package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;




public class MenuFrame extends javax.swing.JFrame {
    
    
    public MenuFrame() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buConsultarSaldo.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 14)); // NOI18N
        buConsultarSaldo.setText("Consultar Saldo");

        buConsultarExtrato.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 14)); // NOI18N
        buConsultarExtrato.setText("Consultar extrato");

        buDepositar.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 14)); // NOI18N
        buDepositar.setText("Depositar");

        buSacar.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 14)); // NOI18N
        buSacar.setText("Sacar");

        buComprarCri.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 14)); // NOI18N
        buComprarCri.setText("Comprar Criptomoedas");

        buVenderCri.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 14)); // NOI18N
        buVenderCri.setText("Vender Criptomoedas");

        buAtualizarCota.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 14)); // NOI18N
        buAtualizarCota.setText("Atualizar cotações");

        buSair.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 14)); // NOI18N
        buSair.setText("Sair");
        buSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel1.setText("CPF:");

        jLabel2.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLCpf.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLCpf.setText("Nome:");

        jLNome.setFont(new java.awt.Font("URW Bookman", 1, 12)); // NOI18N
        jLNome.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLCpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLNome)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 86, Short.MAX_VALUE)
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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLNome))
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
    }// </editor-fold>//GEN-END:initComponents

    private void buSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buSairActionPerformed

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
