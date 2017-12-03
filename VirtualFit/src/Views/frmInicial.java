package Views;

import java.util.List;
import DAL.*;
import DTO.*;
import javax.swing.table.DefaultTableModel;

public class frmInicial extends javax.swing.JFrame {

    private int idAlunoExcluirOuAlterar;

    public frmInicial() {
        initComponents();
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        carregarTabela();
        btnEditarAluno.setVisible(false);
        btnExcluirAluno.setVisible(false);
    }
    
    public void carregarTabela(){
        List<TbAlunos> lista = new TbAlunosDAL().buscarTodos();
        DefaultTableModel modeloTable = (DefaultTableModel) jTbAlunos.getModel();
        while(modeloTable.getRowCount() > 0){
            modeloTable.removeRow(0);
        }
        for(TbAlunos aluno : lista){
            modeloTable.addRow(new Object[]{
               String.valueOf(aluno.getId()),
                aluno.getNome(),
                aluno.getLogin()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarAluno1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrarAluno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbAlunos = new javax.swing.JTable();
        btnEditarAluno = new javax.swing.JButton();
        btnExcluirAluno = new javax.swing.JButton();

        btnCadastrarAluno1.setText("Cadastrar Aluno");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Virtual Fit");

        btnCadastrarAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCadastrarAluno.setText("Cadastrar Aluno");
        btnCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAlunoActionPerformed(evt);
            }
        });

        jTbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbAlunos);

        btnEditarAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarAluno.setText("Editar Aluno");
        btnEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAlunoActionPerformed(evt);
            }
        });

        btnExcluirAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluirAluno.setText("Excluir Aluno");
        btnExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirAluno)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarAluno)
                    .addComponent(btnEditarAluno)
                    .addComponent(btnExcluirAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAlunoActionPerformed
        frmNovoAluno frm = new frmNovoAluno(frmInicial.this);
        frm.setVisible(true);
        carregarTabela();
    }//GEN-LAST:event_btnCadastrarAlunoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        carregarTabela();
    }//GEN-LAST:event_formFocusGained

    private void jTbAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbAlunosMouseClicked
        int linha = jTbAlunos.rowAtPoint(evt.getPoint());
        idAlunoExcluirOuAlterar = Integer.parseInt(jTbAlunos.getModel().getValueAt(linha, 0).toString());
        btnEditarAluno.setVisible(true);
        btnExcluirAluno.setVisible(true);
    }//GEN-LAST:event_jTbAlunosMouseClicked

    private void btnExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlunoActionPerformed
        new TbAlunosDAL().excluir(idAlunoExcluirOuAlterar);
        new tbExerciciosDAL().excluirTodosDoAluno(idAlunoExcluirOuAlterar);
        carregarTabela();
    }//GEN-LAST:event_btnExcluirAlunoActionPerformed

    private void btnEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAlunoActionPerformed
        frmNovoAluno frm = new frmNovoAluno(frmInicial.this, idAlunoExcluirOuAlterar);
        frm.setVisible(true);
        carregarTabela();
    }//GEN-LAST:event_btnEditarAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAluno;
    private javax.swing.JButton btnCadastrarAluno1;
    private javax.swing.JButton btnEditarAluno;
    private javax.swing.JButton btnExcluirAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbAlunos;
    // End of variables declaration//GEN-END:variables
}