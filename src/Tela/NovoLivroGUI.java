/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Banco.DadosLivro;
import Banco.EnviarDadosLivros;
import Banco.ExcluirDadosLivros;
import javax.swing.JOptionPane;
import Classes.NovoLivro;
import java.sql.SQLException;
/**
 *
 * @author Familia Peçanha
 */
public class NovoLivroGUI extends javax.swing.JFrame {

    NovoLivro OBJE;
    /**
     * Creates new form NovoLivro
     */
    public NovoLivroGUI() {
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

        jPanel6 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        editora = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        autor = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox();
        novo = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        codigolivro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        anodeedicao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lancamento = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        numeropaginas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        statuslivros = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        classificacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Livro");
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        voltar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel6.add(voltar);
        voltar.setBounds(990, 470, 80, 31);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Editora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanel3.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Editora");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(20, 30, 70, 22);

        editora.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        editora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "          Selecione", "      Rocco", "      Saraiva", "      Outro Planeta", "      Intrínseca", "      Novo Conceito", "      Seguinte", "      Bertrand Brasil", "      Fábrica 231", "      Cia Das  Letras", "      Mundo Cristão", "      Ática", "      Relume Dumará", "      HarperCollins Brasil", "      Escala", "      Novo Século", "      Arqueiro", "      Edioro", "      BestSeller", "      Nova Fronteira", "      Penguim e companhia das letras", "      Minoutaro", "      L&PM", "      Globo Livros", "      Estrela Cultural", "      Editora Valentina ltda", "      Editora Morro Branco", "      Companhia Editora Nacional", "      Astral Cultural", "      Alta Books", "      Verus", "      DVS Editora", "      Record", "      EME", "      Draco Editora", "      New Pop", "      HarperCollins", "      Atlas", "      HAGNOS", "      Guanabara Koogan", "      Literare Books", "      Sextante / Gmt", "      VOZES", "      Mythos Editora " }));
        editora.setEnabled(false);
        editora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editoraActionPerformed(evt);
            }
        });
        jPanel3.add(editora);
        editora.setBounds(10, 60, 230, 28);

        jPanel6.add(jPanel3);
        jPanel3.setBounds(20, 230, 310, 110);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Autor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanel4.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Autor(a)");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(20, 30, 70, 22);

        autor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        autor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "      Selecione  ", "      John Green", "      Jay Asher ", "      Max Lucado", "      Claude Pouzadoux", "      Daniel Wallace", "      Pedro", "      Nicholas Spark", "      Fabricio Carpinejar", "      Antônio Celso", "      Gail Garson Levine", "      Nick Vujicic", "      Douglas Adams", "      Pedro Antônio Gabriel Anhorn", "      Rainbow Rowell", "      Jasmine Warga", "      Antoine de Saint-Exupéry", "      Guilherme Pinto", "      Neil Gaiman", "      R.J.Palacio", "      Khaled Hosseini", "      Danny White", "      Luiza A.P. Victoria", "     Jennifer Niven", "     Clarice Lispector", "     Frederico Elboni", "     C.S. Lewis", "Ausgusto Cury", "J.K. Rowling", "Paula Pimenta", "Fernando Pessoa", "Lima Barreto", "Neil Gaiman", "Paulo Coelho", "Thalita Rebouças", " " }));
        autor.setEnabled(false);
        jPanel4.add(autor);
        autor.setBounds(20, 60, 290, 28);

        jPanel6.add(jPanel4);
        jPanel4.setBounds(350, 230, 340, 110);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Gênero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanel5.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Gênero");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(20, 30, 53, 22);

        categoria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "       Selecione ", "       Romance", "       Comédia", "       Drama", "       Drama Policial", "       Terror", "       Infantil", "       Adulto ", "       Fantasia", "       Ficção Científica", " " }));
        categoria.setEnabled(false);
        jPanel5.add(categoria);
        categoria.setBounds(20, 60, 180, 28);

        jPanel6.add(jPanel5);
        jPanel5.setBounds(720, 230, 340, 110);

        novo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        jPanel6.add(novo);
        novo.setBounds(30, 470, 80, 31);

        editar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        editar.setText("Editar");
        editar.setEnabled(false);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanel6.add(editar);
        editar.setBounds(220, 470, 80, 31);

        salvar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        salvar.setText("Salvar");
        salvar.setEnabled(false);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        jPanel6.add(salvar);
        salvar.setBounds(450, 470, 120, 31);

        cancelar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cancelar.setText("Limpar");
        cancelar.setEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel6.add(cancelar);
        cancelar.setBounds(830, 470, 90, 31);

        excluir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        excluir.setText("Excluir");
        excluir.setEnabled(false);
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        jPanel6.add(excluir);
        excluir.setBounds(650, 470, 100, 31);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dado dos Livros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Código ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 30, 60, 22);

        codigolivro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(codigolivro);
        codigolivro.setBounds(10, 60, 70, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Titulo");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(350, 30, 70, 22);

        titulo.setEditable(false);
        titulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });
        jPanel2.add(titulo);
        titulo.setBounds(350, 60, 370, 30);

        pesquisar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pesquisar.setText("Pesquisar Código do Livro");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(pesquisar);
        pesquisar.setBounds(90, 60, 240, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Ano de Edição");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 110, 106, 22);

        anodeedicao.setEditable(false);
        anodeedicao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(anodeedicao);
        anodeedicao.setBounds(10, 140, 110, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Lançamento");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(150, 110, 100, 22);

        lancamento.setEditable(false);
        lancamento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(lancamento);
        lancamento.setBounds(150, 140, 180, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("Número Páginas");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(350, 110, 130, 22);

        numeropaginas.setEditable(false);
        numeropaginas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(numeropaginas);
        numeropaginas.setBounds(350, 140, 130, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Status");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(510, 110, 44, 22);

        statuslivros.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        statuslivros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "           Selecione ", "           Disponivel", "           Ocupado" }));
        statuslivros.setEnabled(false);
        jPanel2.add(statuslivros);
        statuslivros.setBounds(510, 140, 180, 28);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Classificação");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(740, 30, 100, 22);

        classificacao.setEditable(false);
        classificacao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(classificacao);
        classificacao.setBounds(740, 60, 220, 30);

        jPanel6.add(jPanel2);
        jPanel2.setBounds(20, 10, 1050, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
    TelaPrincipalGUI tela = new TelaPrincipalGUI();
    tela.setVisible(true);
    dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
    Limpar ();
    }//GEN-LAST:event_cancelarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        codigolivro.requestFocus();
        codigolivro.setEditable(true);
        classificacao.setEditable(true);
        titulo.setEditable(true);
        anodeedicao.setEditable(true);
        lancamento.setEditable(true);
        numeropaginas.setEditable(true);
        statuslivros.setEnabled(true);
        

        
        editora.setEnabled(true);;
        autor.setEnabled(true);;
        categoria.setEnabled(true);

        salvar.setEnabled(true);
        pesquisar.setEnabled(true);

        Limpar();

    }//GEN-LAST:event_novoActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
    if(ValidarSalvarNovoLivro ()){
       try{
           if(PreencherOBJEtoLivros()){
           EnviarDadosLivros INSERIR = new EnviarDadosLivros();
           INSERIR.Salvar(OBJE);
           JOptionPane.showMessageDialog(null,"Registro Salvo");
           }
       } catch (Exception Erro){
           JOptionPane.showMessageDialog(null,"não salvo" + Erro);
       }
    }  
     novo.setEnabled(true);
     editar.setEnabled(true);
     excluir.setEnabled(true);
     Limpar ();
    }//GEN-LAST:event_salvarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try{
        if(ValidarSalvarNovoLivro());
        if(PreencherOBJEtoLivros()){
            //Salvar no banco
            DadosLivro alterar = new DadosLivro();
            alterar.ALTERAR(OBJE);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        }
        
    }catch (Exception erro){
        JOptionPane.showMessageDialog(null, "Não Alterado" + erro);
    }
    novo.setEnabled(true);
    editar.setEnabled(false);
    salvar.setEnabled(true);
    excluir.setEnabled(true);
    cancelar.setEnabled(true);
    codigolivro.setEditable(false);
    Limpar ();
    }//GEN-LAST:event_editarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
    ExcluirDadosLivros APAGA = new ExcluirDadosLivros();
    try{
        if(APAGA.ConfirmarExcluirLivro(codigolivro.getText())){
            JOptionPane.showMessageDialog(null,"Registro Apagado");
        }
    } catch (SQLException Erro) {
      JOptionPane.showMessageDialog(null,"Registro Não Apagado!");
    }
    Limpar();
    }//GEN-LAST:event_excluirActionPerformed

    private void editoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editoraActionPerformed
     
    }//GEN-LAST:event_editoraActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
   
         if(ValidarExcluirLivros()){
            try{
                if(PreencherOBJEExcluirLivros()){
                    ExcluirDadosLivros deletado = new ExcluirDadosLivros();
                    OBJE.setCodigolivro(codigolivro.getText());
                    OBJE = deletado.PesquisarExcluirLivro(codigolivro.getText());

                    if(OBJE == null){
                        JOptionPane.showMessageDialog(null, "Por favor, digite um código válido");
                        
                    }else{
                        codigolivro.setText(OBJE.getCodigolivro());
                        titulo.setText(OBJE.getTitulo());
                        classificacao.setText(OBJE.getClassificacao());
                        String ANODEEDICAO = Integer.toString(OBJE.getAnodeedicao());
                        anodeedicao.setText(ANODEEDICAO);
                        lancamento.setText(OBJE.getLancamento());
                        String NUMEROPAGINAS = Integer.toString(OBJE.getNumeropaginas());
                        numeropaginas.setText(NUMEROPAGINAS);
                        statuslivros.setSelectedIndex(OBJE.getStatuslivros());
                        editora.setSelectedIndex(OBJE.getEditora());
                        categoria.setSelectedIndex(OBJE.getCategoria());;
                        autor.setSelectedIndex(OBJE.getAutor());

                        
                        codigolivro.setEditable(false);
                        classificacao.setEditable(true);
                        titulo.setEditable(true);
                        anodeedicao.setEditable(true);
                        lancamento.setEditable(true);
                        numeropaginas.setEditable(true);
                        statuslivros.setEnabled(true);
        

        
                        editora.setEnabled(true);;
                        autor.setEnabled(true);;
                        categoria.setEnabled(true);
                        
                        
                        
                        editar.setEnabled(true);
                        excluir.setEnabled(true);
                        
                    }
                }
            } catch (Exception Erro){
                JOptionPane.showMessageDialog(null,"Erro na Conexão " + Erro);
            }
        }
    }//GEN-LAST:event_pesquisarActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

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
            java.util.logging.Logger.getLogger(NovoLivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoLivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoLivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoLivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoLivroGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anodeedicao;
    private javax.swing.JComboBox autor;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox categoria;
    private javax.swing.JTextField classificacao;
    private javax.swing.JTextField codigolivro;
    private javax.swing.JButton editar;
    private javax.swing.JComboBox editora;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField lancamento;
    private javax.swing.JButton novo;
    private javax.swing.JTextField numeropaginas;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox statuslivros;
    private javax.swing.JTextField titulo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
private void Limpar (){
    codigolivro.setText("");
    titulo.setText("");
    classificacao.setText("");
    anodeedicao.setText("");
    lancamento.setText("");
    numeropaginas.setText("");
    statuslivros.setSelectedIndex(0);
    editora.setSelectedIndex(0);
    autor.setSelectedIndex(0);
    categoria.setSelectedIndex(0);
    
} 
private boolean ValidarSalvarNovoLivro (){
    if(codigolivro.getText(). equals("")){
        JOptionPane.showMessageDialog(null,"Informe o código do livro!");
        codigolivro.requestFocus();
        return false;
    }
    if(titulo.getText(). equals("")){
        JOptionPane.showMessageDialog(null,"Informe o Tipo do Livro!");
        titulo.requestFocus();
        return false;
    }
    if(classificacao.getText(). equals("")){
        JOptionPane.showMessageDialog(null,"Informe o titulo do livro!");
        classificacao.requestFocus();
        return false;
    }
    if(anodeedicao.getText(). equals("")){
        JOptionPane.showMessageDialog(null,"Informe o ano de edição do livro!");
        anodeedicao.requestFocus();
        return false;
    }
    if(lancamento.getText(). equals("")){
        JOptionPane.showMessageDialog(null,"Informe quando foi lançado o livro!");
        lancamento.requestFocus();
        return false;
    }
    if(numeropaginas.getText(). equals("")){
        JOptionPane.showMessageDialog(null,"Informe o número de páginas");
        numeropaginas.requestFocus();
        return false;
    }
    if(statuslivros.getSelectedIndex  () == (0)){
        JOptionPane.showMessageDialog(null,"Selecione o status do livro!");
        statuslivros.requestFocus();
        return false;
    }
    if(editora.getSelectedIndex () == (0)){
        JOptionPane.showMessageDialog(null,"Selecione uma Editora");
        editora.requestFocus();
        return false;
   
    }
    if(categoria.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null,"Selecione uma categoria!");
        categoria.requestFocus();
        return false;
    
    }
    if(autor.getSelectedIndex() == (0)){
        JOptionPane.showMessageDialog(null,"Selecione um autor!");
        autor.requestFocus();
        return false;
    
    }
    return true;
}
private boolean PreencherOBJEtoLivros() throws Exception{
    OBJE = new  NovoLivro();
    
    OBJE.setCodigolivro(codigolivro.getText());
    OBJE.setTitulo(titulo.getText());
    OBJE.setClassificacao(classificacao.getText());
    int ANODEEDICAO;
    ANODEEDICAO = Integer.parseInt(anodeedicao.getText());
    OBJE.setAnodeedicao(ANODEEDICAO);
    OBJE.setLancamento(lancamento.getText());
    int NUMEROPAGINAS;
    NUMEROPAGINAS = Integer.parseInt(numeropaginas.getText());
    OBJE.setNumeropaginas(NUMEROPAGINAS);
    OBJE.setStatuslivros(statuslivros.getSelectedIndex());
    OBJE.setEditora(editora.getSelectedIndex());
    OBJE.setCategoria(categoria.getSelectedIndex());
    OBJE.setAutor(autor.getSelectedIndex());    
        return true;
   
}
private boolean ValidarExcluirLivros(){
    if(codigolivro.getText(). equals("")){
        JOptionPane.showMessageDialog(null,"Informe o codigo do livro!");
        codigolivro.requestFocus();
        return false;
    }
    return true;
}
private boolean PreencherOBJEExcluirLivros()throws Exception{
    OBJE = new  NovoLivro();
    OBJE.setCodigolivro(codigolivro.getText());
   return true;
}
}

