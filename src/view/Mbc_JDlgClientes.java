/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import bean.Clientes;
import dao.ClientesDAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
/**
 *
 * @author vodka
 */
public class Mbc_JDlgClientes extends javax.swing.JFrame {
    
    boolean incluindo;
    private MaskFormatter maskCpf,maskData;
    private ClientesDAO clientesDAO;
    public Clientes clientes;
    /**
     * Creates new form TelaUsuario
     */
    public Mbc_JDlgClientes() {
        initComponents();
        setTitle("Clientes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas este JFrame
        
        setLocationRelativeTo(null);
        try {
            maskCpf = new MaskFormatter ("###.###.###-##");
            maskData = new MaskFormatter ("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(Mbc_JDlgClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(maskCpf));
        jFmtNacimento.setFormatterFactory(new DefaultFormatterFactory(maskData));
        
        Util.habilitar(false, jFmtCodigo, jTxtNome, jTxtEmail, jTxtUser, jPswSenha, jFmtCpf, jFmtNacimento, 
                jTxtEndereco, jTxtDescricao, jTxtCidade, jTxtEstado, jFmtCep, jTxtTelefone, jCboNivel, jCboStatus,
                jBtnConfirmar, jBtnCancelar);
    }
    
    public Clientes viewBean(){
        Clientes clientes = new Clientes();
        
        clientes.setIdclientes(Util.strToInt(jFmtCodigo.getText()));
        clientes.setNome(jTxtNome.getText());
        clientes.setEmail(jTxtEmail.getText());
        clientes.setUsername(jTxtUser.getText());
        clientes.setSenha(jPswSenha.getText());
        clientes.setCpf(jFmtCpf.getText());
        clientes.setEndereco(jTxtEndereco.getText());
        clientes.setCidade(jTxtCidade.getText());
        clientes.setEstado(jTxtEstado.getText());
        clientes.setCep(jFmtCep.getText());
        clientes.setTelefone(jTxtTelefone.getText());
        clientes.setNivel(jCboNivel.getSelectedIndex());
        clientes.setStatus(jCboStatus.getSelectedIndex());
        
        return clientes;
    }
    
    public void beanView(Clientes clientes) {
        jFmtCodigo.setText(Util.intToString(clientes.getIdclientes()));
        jTxtNome.setText(clientes.getNome());
        jTxtEmail.setText(clientes.getEmail());
        jTxtUser.setText(clientes.getUsername());
        jPswSenha.setText(clientes.getSenha());
        jFmtCpf.setText(clientes.getCpf());
        jTxtEndereco.setText(clientes.getEndereco());
        jTxtCidade.setText(clientes.getCidade());
        jTxtEstado.setText(clientes.getEstado());
        jFmtCep.setText(clientes.getCep());
        jTxtTelefone.setText(clientes.getTelefone());
        jCboNivel.setSelectedIndex(clientes.getNivel());
        jCboStatus.setSelectedIndex(clientes.getStatus());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFmtCodigo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPswSenha = new javax.swing.JPasswordField();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTxtUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jFmtNacimento = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxtEstado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxtDescricao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jFmtCep = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jCboNivel = new javax.swing.JComboBox<>();
        jCboStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 55, 54));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");

        jTxtNome.setFont(new java.awt.Font("Nexa Heavy", 0, 12)); // NOI18N
        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");

        jFmtCodigo.setFont(new java.awt.Font("Nexa Heavy", 0, 12)); // NOI18N
        jFmtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCodigoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");

        jTxtEmail.setFont(new java.awt.Font("Nexa Heavy", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha");

        jPswSenha.setFont(new java.awt.Font("Nexa Heavy", 0, 12)); // NOI18N

        jBtnIncluir.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add1.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmar1.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar2.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisa.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jBtnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pesquisar-15.png"))); // NOI18N
        jBtnPesquisa.setText("Pesquisar");
        jBtnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");

        jLabel8.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CPF");

        jLabel9.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Data de Nascimento");

        jLabel10.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Endereço");

        jLabel11.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cidade");

        jLabel12.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descrição");

        jLabel13.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Estado");

        jLabel14.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CEP");

        jLabel15.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Status");

        jLabel16.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nível");

        jLabel17.setFont(new java.awt.Font("Nexa Heavy", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefone");

        jTxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTelefoneActionPerformed(evt);
            }
        });

        jCboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Artista", "Admin" }));

        jCboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxtDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtEstado)
                                .addComponent(jTxtEndereco)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFmtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtUser, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFmtCpf, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(309, 309, 309))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel15)
                                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPswSenha)
                                    .addComponent(jTxtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jFmtCep, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jFmtNacimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFmtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(jTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtNacimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addGap(3, 3, 3)
                        .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jFmtCodigo, jTxtNome, jTxtEmail, jTxtUser, jPswSenha, jFmtCpf, jFmtNacimento, 
                jTxtEndereco, jTxtDescricao, jTxtCidade, jTxtEstado, jFmtCep, jTxtTelefone, jCboNivel, jCboStatus,
                jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisa);

        jFmtCodigo.grabFocus();
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jFmtCodigo, jTxtNome, jTxtEmail, jTxtUser, jPswSenha, jFmtCpf, jFmtNacimento, 
                jTxtEndereco, jTxtDescricao, jTxtCidade, jTxtEstado, jFmtCep, jTxtTelefone, jCboNivel, jCboStatus,
                jBtnConfirmar, jBtnCancelar); 
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisa);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisaActionPerformed
        Mbc_JDlgClientesPesquisa jDlgCliPesq = new Mbc_JDlgClientesPesquisa (null, true);
        jDlgCliPesq.setTelaAnterior(this);
        jDlgCliPesq.setVisible (true);
    }//GEN-LAST:event_jBtnPesquisaActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        System.out.println("Código: " + jFmtCodigo.getText());  // Verificando o valor do campo

        
        Util.habilitar(false, jFmtCodigo, jTxtNome, jTxtEmail, jTxtUser, jPswSenha, jFmtCpf, jFmtNacimento, 
                jTxtEndereco, jTxtDescricao, jTxtCidade, jTxtEstado, jFmtCep, jTxtTelefone, jCboNivel, jCboStatus,
                jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisa);
        Util.limpar(jFmtCodigo, jTxtNome, jTxtEmail, jTxtUser, jPswSenha, jFmtCpf, jFmtNacimento, 
                jTxtEndereco, jTxtDescricao, jTxtCidade, jTxtEstado, jFmtCep, jTxtTelefone, jCboNivel, jCboStatus);

        if (Util.perguntar("Deseja excluir?") == true) {
            
            clientes = viewBean();
            clientesDAO = new ClientesDAO();
            clientesDAO.delete(clientes);
            Util.mensagem("Registro Excluído com sucesso");
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        ClientesDAO clientesDAO = new ClientesDAO();
        Clientes clientes = viewBean();
        clientesDAO.insert(clientes);
        
        Util.habilitar(false, jFmtCodigo, jTxtNome, jTxtEmail, jTxtUser, jPswSenha, jFmtCpf, jFmtNacimento, 
                jTxtEndereco, jTxtDescricao, jTxtCidade, jTxtEstado, jFmtCep, jTxtTelefone, jCboNivel, jCboStatus,
                jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisa);
        Util.limpar(jFmtCodigo, jTxtNome, jTxtEmail, jTxtUser, jPswSenha, jFmtCpf, jFmtNacimento, 
                jTxtEndereco, jTxtDescricao, jTxtCidade, jTxtEstado, jFmtCep, jTxtTelefone, jCboNivel, jCboStatus);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jFmtCodigo, jTxtNome, jTxtEmail, jTxtUser, jPswSenha, jFmtCpf, jFmtNacimento, 
                jTxtEndereco, jTxtDescricao, jTxtCidade, jTxtEstado, jFmtCep, jTxtTelefone, jCboNivel, jCboStatus,
                jBtnConfirmar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisa);
        Util.limpar(jFmtCodigo, jTxtNome, jTxtEmail, jTxtUser, jPswSenha, jFmtCpf, jFmtNacimento, 
                jTxtEndereco, jTxtDescricao, jTxtCidade, jTxtEstado, jFmtCep, jTxtTelefone, jCboNivel, jCboStatus);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jFmtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCodigoActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(Mbc_JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mbc_JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mbc_JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mbc_JDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mbc_JDlgClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisa;
    private javax.swing.JComboBox<String> jCboNivel;
    private javax.swing.JComboBox<String> jCboStatus;
    private javax.swing.JFormattedTextField jFmtCep;
    private javax.swing.JFormattedTextField jFmtCodigo;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtNacimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPswSenha;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtDescricao;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtEstado;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtTelefone;
    private javax.swing.JTextField jTxtUser;
    // End of variables declaration//GEN-END:variables
}
