package Views;

import DAL.TbAlunosDAL;
import DTO.TbAlunos;

public class frmNovoAluno extends javax.swing.JFrame {
    
    private TbAlunos dtoCompleto ;
    private frmInicial pai;

    public frmNovoAluno(frmInicial pai) {
        this.pai = pai;
        initComponents();
    }
    
     public frmNovoAluno(frmInicial pai, int idAlunoAlterar) {
        this.dtoCompleto = new TbAlunosDAL().buscarAluno(idAlunoAlterar);
        this.pai = pai;
        initComponents();
        lblAcao.setText("Editar Aluno");
        txtNomeAluno.setText(dtoCompleto.getNome());
        txtAlturaAluno.setText(String.valueOf(dtoCompleto.getAltura()));
        txtPesoAluno.setText(String.valueOf(dtoCompleto.getPeso()));
        txtLogin.setText(dtoCompleto.getLogin());
        txtSenhaAluno.setText(dtoCompleto.getSenha());
        calcularIMC();
        btnCadastrar.setText("Alterar");
    }
    
    private void calcularIMC(){
        float peso = Float.parseFloat(txtPesoAluno.getText());
        float altura = Float.parseFloat(txtAlturaAluno.getText());
        float imc = (peso / (altura * altura)) * 10000;
        txtImcAluno.setText(String.valueOf(imc));
        if(imc < 18.5)
            txtCondicaoImc.setText("Baixo");
        else if(imc >= 18.5 && imc < 25)
            txtCondicaoImc.setText("Saudável");
        else if(imc >= 25 && imc < 30)
            txtCondicaoImc.setText("Sobrepeso");
        else
            txtCondicaoImc.setText("Obeso");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAcao = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        txtPesoAluno = new javax.swing.JTextField();
        txtAlturaAluno = new javax.swing.JTextField();
        txtImcAluno = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        txtSenhaAluno = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCondicaoImc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblAcao.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblAcao.setText("Novo Aluno");

        txtNomeAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNomeAluno.setToolTipText("Nome");

        txtPesoAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtAlturaAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAlturaAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAlturaAlunoFocusLost(evt);
            }
        });

        txtImcAluno.setEditable(false);
        txtImcAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtSenhaAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setText("Nome:");

        jLabel3.setText("Peso:");

        jLabel4.setText("Altura:");

        jLabel5.setText("IMC:");

        jLabel6.setText("Login:");

        jLabel7.setText("Senha:");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Kg");

        jLabel9.setText("cm");

        txtCondicaoImc.setText("Condição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAcao, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNomeAluno)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAlturaAluno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPesoAluno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtImcAluno)
                                .addGap(18, 18, 18)
                                .addComponent(txtCondicaoImc))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAcao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlturaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImcAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCondicaoImc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(btnCadastrar.getText().equals("Cadastrar")){
            dtoCompleto = new TbAlunos();
            dtoCompleto.setNome(txtNomeAluno.getText());
            dtoCompleto.setPeso(Float.parseFloat(txtPesoAluno.getText()));
            dtoCompleto.setAltura(Float.parseFloat(txtAlturaAluno.getText()));
            dtoCompleto.setImc(Float.parseFloat(txtImcAluno.getText()));
            dtoCompleto.setLogin(txtLogin.getText());
            dtoCompleto.setSenha(txtSenhaAluno.getText());
            dtoCompleto.setId(new TbAlunosDAL().salvarAluno(dtoCompleto));
        } else {
            dtoCompleto.setNome(txtNomeAluno.getText());
            dtoCompleto.setPeso(Float.parseFloat(txtPesoAluno.getText()));
            dtoCompleto.setAltura(Float.parseFloat(txtAlturaAluno.getText()));
            dtoCompleto.setImc(Float.parseFloat(txtImcAluno.getText()));
            dtoCompleto.setLogin(txtLogin.getText());
            dtoCompleto.setSenha(txtSenhaAluno.getText());
            new TbAlunosDAL().updateAluno(dtoCompleto);
        }
            frmExercicios frm = new frmExercicios(this.pai, dtoCompleto);
            frm.setVisible(true);
            dispose();
      
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtAlturaAlunoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlturaAlunoFocusLost
        calcularIMC();
    }//GEN-LAST:event_txtAlturaAlunoFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAcao;
    private javax.swing.JTextField txtAlturaAluno;
    private javax.swing.JLabel txtCondicaoImc;
    private javax.swing.JTextField txtImcAluno;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtPesoAluno;
    private javax.swing.JPasswordField txtSenhaAluno;
    // End of variables declaration//GEN-END:variables
}
