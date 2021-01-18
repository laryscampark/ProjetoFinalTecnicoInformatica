package Tela;

import Banco.DadosCliente;
import Banco.ExcluirDados;
import Classes.NovoCliente;
import javax.swing.JOptionPane;

import java.sql.SQLException;

/**
 *
 * @author Familia Peçanha
 */
public class NovoClienteGUI extends javax.swing.JFrame {
   
NovoCliente obj;
String acao="";
    /**
     * Creates new form NovoCliente
     */
    public NovoClienteGUI() {
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

        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        CPF = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nomecompleto = new javax.swing.JTextField();
        pesquisa = new javax.swing.JButton();
        endereco = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        status = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        novo = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        uf = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        telefone = new javax.swing.JFormattedTextField();
        celular = new javax.swing.JFormattedTextField();
        cep = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        cpf = new javax.swing.JFormattedTextField();

        jFormattedTextField4.setText("jFormattedTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo _Cliente");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 24))); // NOI18N
        jPanel1.setLayout(null);

        CPF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CPF.setText("CPF");
        jPanel1.add(CPF);
        CPF.setBounds(30, 40, 33, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Telefone");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 300, 70, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Nome Completo ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 40, 160, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Endereço ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 120, 80, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("E-mail");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 310, 47, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Data de Nascimento");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(870, 120, 146, 22);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Cidade");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(140, 210, 50, 22);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Status");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1050, 40, 100, 22);

        nomecompleto.setEditable(false);
        nomecompleto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(nomecompleto);
        nomecompleto.setBounds(440, 70, 560, 30);

        pesquisa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pesquisa.setText("Pesquisa");
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(pesquisa);
        pesquisa.setBounds(260, 70, 140, 30);

        endereco.setEditable(false);
        endereco.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(endereco);
        endereco.setBounds(30, 150, 370, 30);

        email.setEditable(false);
        email.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(510, 340, 540, 30);

        cidade.setEditable(false);
        cidade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(cidade);
        cidade.setBounds(140, 240, 170, 30);

        status.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "     Selecione", "     Ativo", "     Desativado" }));
        status.setEnabled(false);
        jPanel1.add(status);
        status.setBounds(1050, 70, 140, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/arvore-de-livros-png-2.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1080, 0, 450, 550);

        novo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        jPanel1.add(novo);
        novo.setBounds(100, 430, 90, 30);

        editar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        editar.setText("Editar");
        editar.setEnabled(false);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanel1.add(editar);
        editar.setBounds(250, 430, 100, 30);

        salvar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        salvar.setText("Salvar");
        salvar.setEnabled(false);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        jPanel1.add(salvar);
        salvar.setBounds(420, 430, 120, 30);

        limpar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        limpar.setText("Limpar");
        limpar.setDoubleBuffered(true);
        limpar.setEnabled(false);
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        jPanel1.add(limpar);
        limpar.setBounds(790, 430, 90, 30);

        excluir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        excluir.setText("Excluir");
        excluir.setEnabled(false);
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        jPanel1.add(excluir);
        excluir.setBounds(620, 430, 100, 30);

        voltar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar);
        voltar.setBounds(940, 430, 90, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("UF");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(340, 200, 23, 22);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("CEP");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 210, 34, 22);

        uf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        uf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufActionPerformed(evt);
            }
        });
        jPanel1.add(uf);
        uf.setBounds(350, 240, 110, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Celular");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(270, 310, 60, 22);

        data.setEditable(false);
        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(data);
        data.setBounds(870, 150, 150, 30);

        telefone.setEditable(false);
        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(telefone);
        telefone.setBounds(30, 340, 210, 30);

        celular.setEditable(false);
        try {
            celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(celular);
        celular.setBounds(260, 340, 210, 30);

        cep.setEditable(false);
        try {
            cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });
        jPanel1.add(cep);
        cep.setBounds(30, 240, 90, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Bairro");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(560, 120, 80, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Nº");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(440, 120, 80, 22);

        bairro.setEditable(false);
        bairro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(bairro);
        bairro.setBounds(560, 150, 260, 30);

        numero.setEditable(false);
        numero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(numero);
        numero.setBounds(440, 150, 90, 30);

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });
        jPanel1.add(cpf);
        cpf.setBounds(30, 70, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
      if(ValidarExcluir()){
            try {
                if(PreencherObjExcluir()){
                    ExcluirDados EXCLUIR = new ExcluirDados();
                    obj.setCpf(cpf.getText());
                    obj = EXCLUIR.PesquisarExcluir(cpf.getText());
                    // obj = EXCLUIR.PesquisarExcluir(cpf.getText());
                     //cpf.setText(obj.getCpf());
                     if(obj == null){
                         JOptionPane.showMessageDialog(null, "Usuário não encontrado");
                     }else{
                         cpf.setText(obj.getCpf());
                         nomecompleto.setText(obj.getNomecompleto());
                         status.setSelectedIndex(obj.getStatus());
                         endereco.setText(obj.getEndereco());
                         String NUMERO = Integer.toString(obj.getNumero());
                         numero.setText(NUMERO);
                         bairro.setText(obj.getBairro());
                         data.setText(obj.getData());;
                         cep.setText(obj.getCep());
                         cidade.setText(obj.getCidade());
                         uf.setSelectedIndex(obj.getUf());
                         telefone.setText(obj.getTelefone());
                         celular.setText(obj.getCelular());
                         email.setText(obj.getEmail());
                         // colocar os outros itens
                         
                         
                         
                         
                         cpf.requestFocus();
                         cpf.setEditable(true);
                         nomecompleto.setEditable(true);
                         status.setEnabled(true);
                         endereco.setEditable(true);
                         numero.setEditable(true);
                         bairro.setEditable(true);
                         data.setEditable(true);
                         cep.setEditable(true);
                         cidade.setEditable(true);
                         uf.setEnabled(true);
                         telefone.setEditable(true);
                         celular.setEditable(true);
                         email.setEditable(true);

                         
                         //String CODIGO = Integer.toString(obj.getCodigo());                         
                         //codigo.setText(CODIGO
                         
                         editar.setEnabled(true);
                         excluir.setEnabled(true);
                     }                                                  
                }
            } catch (Exception Erro) {               
                JOptionPane.showMessageDialog(null, "Erro na Conexão");
            }               
    /*    
    ConsultarClienteGUI tela = new ConsultarClienteGUI();
    tela.setVisible(true);
    dispose();
    */
        }
    
    }//GEN-LAST:event_pesquisaActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
    cpf.requestFocus();
    cpf.setEditable(true);
    nomecompleto.setEditable(true);
    status.setEnabled(true);
    endereco.setEditable(true);
    numero.setEditable(true);
    bairro.setEditable(true);
    data.setEditable(true);
    cep.setEditable(true);
    cidade.setEditable(true);
    uf.setEnabled(true);
    telefone.setEditable(true);
    celular.setEditable(true);
    email.setEditable(true);
    
    salvar.setEnabled(true);
    pesquisa.setEnabled(true);
    
    acao = "INCLUIR";
    
    Limpar ();
    }//GEN-LAST:event_novoActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
    Limpar ();
    }//GEN-LAST:event_limparActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
    TelaPrincipalGUI tela = new TelaPrincipalGUI();
    tela.setVisible(true);
    dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
    try{
        if(ValidarSalvar());
        if(Preencherobj()){
            //Salvar no banco
            DadosCliente alterar = new DadosCliente();
            alterar.ALTERAR(obj);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        }
        
    }catch (Exception erro){
        JOptionPane.showMessageDialog(null, "Não Alterado" + erro);
    }
       cpf.setEditable(true);
       data.setEditable(true);
       limpar.setEnabled(true);
       Limpar();
        
        /**if(ValidarEditar ()){
            try{
                if(PreencherobjEditar()){
                    EditarDados Editar = new EditarDados();
                    if (acao.equals("Editar")){

                    JOptionPane.showMessageDialog(null, "Registro não editado");
                }}
            }catch (Exception Erro){
                JOptionPane.showMessageDialog(null, "Registro não Editador" + Erro);
            }
        }
        Limpar();  
        
        
    cpf.setEditable(true);
    nomecompleto.setEditable(true);
    status.setEnabled(true);
    endereco.setEditable(true);
    numero.setEditable(true);
    bairro.setEditable(true);
    data.setEditable(true);
    cep.setEditable(true);
    cidade.setEditable(true);
    uf.setEnabled(true);
    telefone.setEditable(true);
    celular.setEditable(true);
    email.setEditable(true);
    
 
    
    novo.setEnabled(false);
    editar.setEnabled(false);
    salvar.setEnabled(true);
    excluir.setEnabled(false);
    cancelar.setEnabled(true);
    
    acao = "Editar";*/
        
    }//GEN-LAST:event_editarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if(ValidarSalvar ()){
            try{
                if(Preencherobj()){
                    DadosCliente INSERIR = new DadosCliente();
                    INSERIR.Salvar(obj);
                    JOptionPane.showMessageDialog(null, "Registro Salvo");
                }
            }catch (Exception Erro){
                JOptionPane.showMessageDialog(null, "Registro não salvo" + Erro);
            }
        }
        Limpar ();
        novo.setEnabled(true);
        editar.setEnabled(true);
        excluir.setEnabled(true);
    }//GEN-LAST:event_salvarActionPerformed
 
    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
     
    }//GEN-LAST:event_emailActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
     ExcluirDados Apagar = new ExcluirDados();
    try {
        if(Apagar.ConfirmarExcluir(cpf.getText())){
            JOptionPane.showMessageDialog(null, "Registro Apagado");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Registro Não Apagado");
    }
    Limpar ();
    }//GEN-LAST:event_excluirActionPerformed

    private void ufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufActionPerformed

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
   
    }//GEN-LAST:event_emailFocusLost

    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

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
            java.util.logging.Logger.getLogger(NovoClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JTextField bairro;
    private javax.swing.JFormattedTextField celular;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JButton editar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton excluir;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField nomecompleto;
    private javax.swing.JButton novo;
    private javax.swing.JTextField numero;
    private javax.swing.JButton pesquisa;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox status;
    private javax.swing.JFormattedTextField telefone;
    private javax.swing.JComboBox uf;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

public void Limpar(){
    cpf.setText("");
    nomecompleto.setText("");
    status.setSelectedIndex(0);
    endereco.setText("");
    numero.setText("");
    bairro.setText("");
    data.setText("");
    cep.setText("");
    cidade.setText("");
    uf.setSelectedIndex(0);
    telefone.setText("");
    celular.setText("");
    email.setText("");
                    
}
 private boolean ValidarSalvar (){
    if (cpf.getText(). equals("")){
    JOptionPane.showMessageDialog(null,"Digite o cpf!");
    cpf.requestFocus();
    return false;
     }
    if (nomecompleto.getText(). equals("")){
    JOptionPane.showMessageDialog(null,"Digite o nome!");
    nomecompleto.requestFocus();
    return false;
    }
    if (status.getSelectedIndex () == (0)){
    JOptionPane.showMessageDialog(null,"Selecione o Status");
    status.requestFocus();
    return false;
      }
    if (endereco.getText(). equals("")){
    JOptionPane.showMessageDialog(null,"Digite o endereço!");
    endereco.requestFocus();
    return false;
    }
    if(numero.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Informe o número referente a sua casa!");
    numero.requestFocus();
    return false;
       }
    if(bairro.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Informe seu bairro!");
    bairro.requestFocus();
    return false;
    }
    if (data.getText(). equals("")){
    JOptionPane.showMessageDialog(null,"Digite a data!");
    data.requestFocus();
    return false;
    }
    if (cep.getText(). equals("")){
    JOptionPane.showMessageDialog(null,"Digite seu cep!");
    cep.requestFocus();
    return false;
    }
    if (cidade.getText(). equals("")){
    JOptionPane.showMessageDialog(null,"Digite a cidade!");
    cidade.requestFocus();
    return false;
    }
    if (uf.getSelectedIndex () == (0)){
    JOptionPane.showMessageDialog(null,"Informe seu estado!");
    uf.requestFocus();
    return false;
    }
     if (telefone.getText(). equals("")){
    JOptionPane.showMessageDialog(null,"Digite o telefone!");
    telefone.requestFocus();
    return false;
    }
     if (celular.getText(). equals("")){
     JOptionPane.showMessageDialog(null,"Digite o número do seu celular!");
     celular.requestFocus();
     return false;
     }
     if(email.getText().equals("")){
     JOptionPane.showMessageDialog(null,"Informe o seu email!");
     email.requestFocus();
     return false;
     }
     
    return true;
    }
 
 private boolean Preencherobj()throws Exception{
    obj = new NovoCliente();
    
    obj.setNomecompleto(nomecompleto.getText());
    obj.setCpf(cpf.getText());
    obj.setData(data.getText());
    obj.setBairro(bairro.getText());
    obj.setStatus(status.getSelectedIndex());
    obj.setCep(cep.getText());
    obj.setEndereco(endereco.getText());
    int NUMERO;
    NUMERO = Integer.parseInt(numero.getText());
    obj.setNumero(NUMERO);
    obj.setCidade(cidade.getText());
    obj.setUf(uf.getSelectedIndex());
    obj.setTelefone(telefone.getText());
    obj.setCelular(celular.getText());
    obj.setEmail(email.getText());
    return true;
 }
 
 private boolean ValidarExcluir(){
     if(cpf.getText(). equals("")){
     JOptionPane.showMessageDialog(null,"Digite o seu CPF!");
     cpf.requestFocus();
    return false;
}
    return true;
 }   

     
private boolean PreencherObjExcluir()throws Exception{
   obj = new NovoCliente();
   obj.setCpf(cpf.getText());
    return true;

}
}