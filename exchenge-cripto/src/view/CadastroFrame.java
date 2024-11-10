package view;
import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class CadastroFrame extends javax.swing.JFrame {

    
    public CadastroFrame(ControllerLogin cLogin) {
        initComponents();
        this.cLogin = cLogin;
    }

    public JPasswordField getTextSenha() {
        return textSenha;
    }

    public void setTextSenha(JPasswordField textSenha) {
        this.textSenha = textSenha;
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

    public void setJbCadastrar(JButton jbCadastrar) {
        this.jbCadastrar = jbCadastrar;
    }

    public void setJbvoltarLogar(JButton jbvoltarLogar) {
        this.jbvoltarLogar = jbvoltarLogar;
    }

    public void setTextCpf(JTextField textCpf) {
        this.textCpf = textCpf;
    }

    public void setTextNome(JTextField textNome) {
        this.textNome = textNome;
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

    public JButton getJbCadastrar() {
        return jbCadastrar;
    }

    public JButton getJbvoltarLogar() {
        return jbvoltarLogar;
    }

    public JTextField getTextCpf() {
        return textCpf;
    }

    public JTextField getTextNome() {
        return textNome;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jbvoltarLogar = new javax.swing.JButton();
        textSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Nome:");

        textNome.setBackground(new java.awt.Color(102, 102, 102));
        textNome.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textNome.setForeground(new java.awt.Color(255, 255, 255));
        textNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("CPF:");

        textCpf.setBackground(new java.awt.Color(102, 102, 102));
        textCpf.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textCpf.setForeground(new java.awt.Color(255, 255, 255));
        textCpf.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Senha:");

        jbCadastrar.setBackground(new java.awt.Color(0, 255, 255));
        jbCadastrar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jbCadastrar.setForeground(new java.awt.Color(0, 0, 51));
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbvoltarLogar.setBackground(new java.awt.Color(0, 255, 255));
        jbvoltarLogar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jbvoltarLogar.setForeground(new java.awt.Color(0, 0, 51));
        jbvoltarLogar.setText("Voltar");
        jbvoltarLogar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbvoltarLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvoltarLogarActionPerformed(evt);
            }
        });

        textSenha.setBackground(new java.awt.Color(102, 102, 102));
        textSenha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textSenha.setForeground(new java.awt.Color(255, 255, 255));
        textSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.jpeg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoAzul.jpeg"))); // NOI18N
        jLabel4.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jbvoltarLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jbCadastrar))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jbvoltarLogar))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel4.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cLogin.cadastrarInvestido();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbvoltarLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbvoltarLogarActionPerformed
        cLogin.cadastroParaLogin();
    }//GEN-LAST:event_jbvoltarLogarActionPerformed


    private ControllerLogin cLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbvoltarLogar;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textNome;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
