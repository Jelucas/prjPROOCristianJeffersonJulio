/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatec.poo.view;

import fatec.poo.dao.Conexao;
import fatec.poo.dao.DaoProduto;
import fatec.poo.model.Produto;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class GuiProduto extends javax.swing.JFrame {

    /**
     * Creates new form GuiProduto
     */
    public GuiProduto() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQtdeDisp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecoUnit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEstoqueMin = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Descrição:");

        txtDescricao.setEnabled(false);

        jLabel3.setText("Qtde. Disponível:");

        txtQtdeDisp.setEnabled(false);

        jLabel4.setText("Preço Unitário:");

        txtPrecoUnit.setEnabled(false);

        jLabel5.setText("Estoque Mínimo:");

        txtEstoqueMin.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/consultar.png"))); // NOI18N
        btnConsultar.setMnemonic('C');
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/incluir.png"))); // NOI18N
        btnIncluir.setMnemonic('I');
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/alterar.png"))); // NOI18N
        btnAlterar.setMnemonic('A');
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/excluir.png"))); // NOI18N
        btnExcluir.setMnemonic('E');
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/sair.png"))); // NOI18N
        btnSair.setMnemonic('S');
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtQtdeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        produto = null;
        
    if(!campoNumerico(txtCodigo.getText())){
        JOptionPane.showMessageDialog(rootPane, "Somente números !");
        txtCodigo.setText("");
    }else{
       produto = daoProduto.consultar(Integer.parseInt( txtCodigo.getText()));
       
       if (produto == null){
           txtCodigo.setEnabled(false);
           txtDescricao.setEnabled(true);
           txtEstoqueMin.setEnabled(true);
           txtPrecoUnit.setEnabled(true);
           txtQtdeDisp.setEnabled(true);
           txtDescricao.requestFocus();
           
           btnConsultar.setEnabled(false);
           btnIncluir.setEnabled(true);
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
       }
       else{
          txtDescricao.setText(produto.getDescricao());
          txtEstoqueMin.setText(String.valueOf(produto.getEstoqueMin()));
          txtPrecoUnit.setText(String.valueOf(produto.getPrecoUnit()));
          txtQtdeDisp.setText(String.valueOf(produto.getQtdDisponivel()));
          
       
          txtCodigo.setEnabled(false); 
          txtDescricao.setEnabled(true);
          txtEstoqueMin.setEnabled(true);
          txtPrecoUnit.setEnabled(true);
          txtQtdeDisp.setEnabled(true);
          
          txtDescricao.requestFocus();
          
          btnConsultar.setEnabled(false);
          btnIncluir.setEnabled(false);
          btnAlterar.setEnabled(true);
          btnExcluir.setEnabled(true);
       }
    }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("JEFFERSON","jefferson");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoProduto = new DaoProduto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        produto = new Produto(Integer.parseInt(txtCodigo.getText()), txtDescricao.getText() );
        produto.setQtdDisponivel(Integer.parseInt(txtQtdeDisp.getText()));
        produto.setEstoqueMin(Integer.parseInt(txtEstoqueMin.getText()));
        produto.setPrecoUnit(Double.parseDouble(txtPrecoUnit.getText()));
        
        daoProduto.inserir(produto);
         
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtEstoqueMin.setText("");
        txtQtdeDisp.setText("");
        txtPrecoUnit.setText("");
        
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtQtdeDisp.setEnabled(false);
        txtPrecoUnit.setEnabled(false);
        txtCodigo.requestFocus();
        
        btnIncluir.setEnabled(false);
        btnConsultar.setEnabled(true);

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){//Sim
           produto.setDescricao(txtDescricao.getText());
           produto.setQtdDisponivel(Integer.parseInt(txtQtdeDisp.getText()));
           produto.setEstoqueMin(Integer.parseInt(txtEstoqueMin.getText()));
           produto.setPrecoUnit(Double.parseDouble(txtPrecoUnit.getText()));
           daoProduto.alterar(produto);
        } 
        
        txtCodigo.setText("");
        txtEstoqueMin.setText("");
        txtPrecoUnit.setText("");
        txtQtdeDisp.setText("");
        txtDescricao.setText("");
        
        txtCodigo.setEnabled(true); 
        txtEstoqueMin.setEnabled(false);
        txtQtdeDisp.setEnabled(false);
        txtPrecoUnit.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtCodigo.requestFocus();
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoProduto.excluir(produto);

            txtCodigo.setText("");
            txtEstoqueMin.setText("");
            txtPrecoUnit.setText("");
            txtQtdeDisp.setText("");
            txtDescricao.setText("");

            txtCodigo.setEnabled(true); 
            txtEstoqueMin.setEnabled(false);
            txtQtdeDisp.setEnabled(false);
            txtPrecoUnit.setEnabled(false);
            txtDescricao.setEnabled(false);
            txtCodigo.requestFocus();
            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    private boolean campoNumerico(String campo){             
        return campo.matches("[0-9]+");     
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtPrecoUnit;
    private javax.swing.JTextField txtQtdeDisp;
    // End of variables declaration//GEN-END:variables

    private DaoProduto daoProduto=null;
    private Produto produto=null;
    private Conexao conexao=null;
    
    private void setIcon() {
        URL url = this.getClass().getResource("/fatec/poo/view/icon/produto.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }
    
    
}
