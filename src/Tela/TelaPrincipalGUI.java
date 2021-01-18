/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

/**
 *
 * @author Familia Peçanha
 */
public class TelaPrincipalGUI extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipalGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelInterno = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        barra = new javax.swing.JMenuBar();
        sbkld = new javax.swing.JMenu();
        CadastroCli = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        CadastroLivros = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        CadastroDeFuncionario = new javax.swing.JMenuItem();
        movimentacao = new javax.swing.JMenu();
        devolucao = new javax.swing.JMenuItem();
        Emprestimo = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenu();
        SairDoPrograma = new javax.swing.JMenuItem();

        PainelInterno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelInterno.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/arvore-de-livros-png-2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 630, 590));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 540, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        jLabel3.setText("de Biblioteca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel4.setText("KnowLedge Doors");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 630);

        sbkld.setText("Cadastro");

        CadastroCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        CadastroCli.setText("Cadastro de Clientes");
        CadastroCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroCliActionPerformed(evt);
            }
        });
        sbkld.add(CadastroCli);
        sbkld.add(jSeparator2);

        CadastroLivros.setText("Cadastro de Livros");
        CadastroLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroLivrosActionPerformed(evt);
            }
        });
        sbkld.add(CadastroLivros);
        sbkld.add(jSeparator3);

        CadastroDeFuncionario.setText("Cadastro de Funcionários");
        CadastroDeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroDeFuncionarioActionPerformed(evt);
            }
        });
        sbkld.add(CadastroDeFuncionario);

        barra.add(sbkld);

        movimentacao.setText("Movimentação");

        devolucao.setText("Devolução");
        devolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucaoActionPerformed(evt);
            }
        });
        movimentacao.add(devolucao);

        Emprestimo.setText("Empréstimo");
        Emprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmprestimoActionPerformed(evt);
            }
        });
        movimentacao.add(Emprestimo);

        barra.add(movimentacao);

        Sair.setText("Sair");

        SairDoPrograma.setText("Sair do Programada");
        SairDoPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoProgramaActionPerformed(evt);
            }
        });
        Sair.add(SairDoPrograma);

        barra.add(Sair);

        setJMenuBar(barra);

        setSize(new java.awt.Dimension(1074, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void devolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolucaoActionPerformed
    DevolucaoLivroGUI tela = new DevolucaoLivroGUI ();
    tela.setVisible (true);
    dispose ();
    }//GEN-LAST:event_devolucaoActionPerformed

    private void CadastroLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroLivrosActionPerformed
        NovoLivroGUI tela = new NovoLivroGUI();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_CadastroLivrosActionPerformed

    private void EmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmprestimoActionPerformed
    EmprestimoLivroGUI tela = new EmprestimoLivroGUI();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_EmprestimoActionPerformed

    private void CadastroCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroCliActionPerformed
        NovoClienteGUI tela = new NovoClienteGUI();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_CadastroCliActionPerformed

    private void SairDoProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoProgramaActionPerformed
  dispose();
    }//GEN-LAST:event_SairDoProgramaActionPerformed

    private void CadastroDeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroDeFuncionarioActionPerformed
        ControleDeAcessoGUI tela = new ControleDeAcessoGUI();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_CadastroDeFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastroCli;
    private javax.swing.JMenuItem CadastroDeFuncionario;
    private javax.swing.JMenuItem CadastroLivros;
    private javax.swing.JMenuItem Emprestimo;
    private javax.swing.JPanel PainelInterno;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenuItem SairDoPrograma;
    private javax.swing.JMenuBar barra;
    private javax.swing.JMenuItem devolucao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu movimentacao;
    private javax.swing.JMenu sbkld;
    // End of variables declaration//GEN-END:variables
}
