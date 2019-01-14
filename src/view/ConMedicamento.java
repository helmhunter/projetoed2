package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelDao.ListaEncadeadaMedicamento;
import modelBeans.Medicamento;
import modelBeans.ModeloTabela;

public class ConMedicamento extends javax.swing.JFrame {

    ListaEncadeadaMedicamento listaMedicamentos = new ListaEncadeadaMedicamento();
    int registroMSSel;
    boolean flag = false;
    
    public ConMedicamento() {
        initComponents();
        arquivoParaLista();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldFabricante = new javax.swing.JTextField();
        jTextFieldVerificador = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jComboBoxAcao = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerQnt = new javax.swing.JSpinner();
        jLabelID = new javax.swing.JLabel();
        jTextFieldRegistroMS = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMedicamentos = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jLabel3.setText("Fabricante:");

        jLabel4.setText("Verificador de Receita:");

        jLabel5.setText("Tipo de Ação:");

        jLabel6.setText("Tipo de Medicamento:");

        jTextFieldNome.setEnabled(false);

        jTextFieldFabricante.setEnabled(false);
        jTextFieldFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFabricanteActionPerformed(evt);
            }
        });

        jTextFieldVerificador.setEnabled(false);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fitoterápico", "Alopático", "Homeopático", "Similar", "Genérico", "Referência", "Manipulado" }));
        jComboBoxTipo.setEnabled(false);
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jComboBoxAcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "Sistêmica", "Remota", "Loca/Geral" }));
        jComboBoxAcao.setEnabled(false);

        jLabel8.setText("Quantidade em estoque:");

        jSpinnerQnt.setEnabled(false);

        jLabelID.setText("Registro MS:");

        jTextFieldRegistroMS.setEnabled(false);

        jLabelPreco.setText("Preço:");

        jTextFieldPreco.setEnabled(false);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelID))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelPreco)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldRegistroMS)
                                    .addComponent(jTextFieldPreco)))
                            .addComponent(jTextFieldVerificador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxAcao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldRegistroMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPreco)
                    .addComponent(jTextFieldPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldVerificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSair)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jSpinnerQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cadastro de medicamento");

        jTableMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMedicamentos);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(736, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFabricanteActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            if (jTextFieldNome.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo do nome vazio.");
                jTextFieldNome.requestFocus();
            } else if (jTextFieldFabricante.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo de fabricante vazio.");
                jTextFieldFabricante.requestFocus();
            } else if (jTextFieldVerificador.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo do verificador de receita vazio.");
                jTextFieldFabricante.requestFocus();
            } else if (Integer.parseInt(jSpinnerQnt.getValue().toString())<0) {
                JOptionPane.showMessageDialog(null, "Quantidade menor que zero");
                jSpinnerQnt.requestFocus();
            } else if (jTextFieldPreco.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo de preço vazio.");
                jTextFieldPreco.requestFocus();
            } else {
                if (flag==true) {
                    Medicamento novo = new Medicamento();
                    novo.setNome(jTextFieldNome.getText().toLowerCase());
                    novo.setFabricante(jTextFieldFabricante.getText().toLowerCase());
                    novo.setVerificador(jTextFieldVerificador.getText().toLowerCase());
                    novo.setAcao((String) jComboBoxAcao.getSelectedItem());
                    novo.setTipo((String) jComboBoxTipo.getSelectedItem());
                    novo.setQnt((int) jSpinnerQnt.getValue());
                    novo.setRegistroRS((Integer.parseInt(jTextFieldRegistroMS.getText())));
                    novo.setPreco(Double.parseDouble(jTextFieldPreco.getText()));
                    listaMedicamentos.adiciona(novo);
                } else {
                    listaMedicamentos.buscaCodigo(registroMSSel).getElemento().setRegistroRS(Integer.parseInt(jTextFieldRegistroMS.getText()));
                    listaMedicamentos.buscaCodigo(registroMSSel).getElemento().setNome(jTextFieldNome.getText().toLowerCase());
                    listaMedicamentos.buscaCodigo(registroMSSel).getElemento().setFabricante(jTextFieldFabricante.getText());
                    listaMedicamentos.buscaCodigo(registroMSSel).getElemento().setVerificador(jTextFieldVerificador.getText());
                    listaMedicamentos.buscaCodigo(registroMSSel).getElemento().setAcao((String) jComboBoxAcao.getSelectedItem());
                    listaMedicamentos.buscaCodigo(registroMSSel).getElemento().setTipo((String) jComboBoxTipo.getSelectedItem());
                    listaMedicamentos.buscaCodigo(registroMSSel).getElemento().setQnt((int) jSpinnerQnt.getValue());
                    listaMedicamentos.buscaCodigo(registroMSSel).getElemento().setPreco(Double.parseDouble(jTextFieldPreco.getText()));
                }
                jTextFieldRegistroMS.setText("");
                jTextFieldNome.setText("");
                jTextFieldFabricante.setText("");
                jTextFieldVerificador.setText("");
                jSpinnerQnt.setValue(0);
                jTextFieldPreco.setText("");
                jTextFieldPreco.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                jTextFieldFabricante.setEnabled(false);
                jTextFieldVerificador.setEnabled(false);
                jComboBoxAcao.setEnabled(false);
                jComboBoxTipo.setEnabled(false);
                jSpinnerQnt.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jButtonCancelar.setEnabled(false);
                preencherTabela();
                jButtonPesquisar.setEnabled(true);
                jTextFieldPesquisar.setEnabled(true);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Entrada(s) inválidas.");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = true;
        jTextFieldNome.setEnabled(true);
        jTextFieldFabricante.setEnabled(true);
        jTextFieldVerificador.setEnabled(true);
        jComboBoxAcao.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jSpinnerQnt.setEnabled(true);
        jTextFieldRegistroMS.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldNome.setText("");
        jTextFieldFabricante.setText("");
        jTextFieldVerificador.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldPreco.setText("");
        jTextFieldRegistroMS.setText("");
        jTextFieldPreco.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisar.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        
        preencherTabela();
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(!true);
        jTextFieldFabricante.setEnabled(!true);
        jTextFieldVerificador.setEnabled(!true);
        jComboBoxAcao.setEnabled(!true);
        jComboBoxTipo.setEnabled(!true);
        jSpinnerQnt.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisar.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jTextFieldPreco.setEnabled(false);
        jTextFieldRegistroMS.setText("");
        jTextFieldNome.setText("");
        jTextFieldFabricante.setText("");
        jTextFieldVerificador.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldPreco.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = false;
        jTextFieldNome.setEnabled(true);
        jTextFieldFabricante.setEnabled(true);
        jTextFieldVerificador.setEnabled(true);
        jComboBoxAcao.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jSpinnerQnt.setEnabled(true);
        jTextFieldPreco.setEnabled(true);
        jTextFieldRegistroMS.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Confirmar exclusão?");
        if (resposta == JOptionPane.YES_OPTION) {
            listaMedicamentos.removeRegistroMS(registroMSSel);
            jTextFieldRegistroMS.setText("");
            jTextFieldNome.setText("");
            jTextFieldFabricante.setText("");
            jTextFieldVerificador.setText("");
            jSpinnerQnt.setValue(0);
            jTextFieldNome.setEnabled(false);
            jTextFieldFabricante.setEnabled(false);
            jTextFieldVerificador.setEnabled(false);
            jComboBoxAcao.setEnabled(false);
            jComboBoxTipo.setEnabled(false);
            jSpinnerQnt.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            preencherTabela();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicamentosMouseClicked
        registroMSSel = (int) jTableMedicamentos.getValueAt(jTableMedicamentos.getSelectedRow(), 0);
        Medicamento model = listaMedicamentos.buscaCodigo(registroMSSel).getElemento();
        if (model ==  null) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao selecionar");
        } else {
            jTextFieldNome.setText(model.getNome());
            jTextFieldRegistroMS.setText(String.valueOf(model.getRegistroMS()));
            jTextFieldFabricante.setText(model.getFabricante());
            jTextFieldVerificador.setText(model.getVerificador());
            jComboBoxAcao.setSelectedItem(model.getAcao());
            jComboBoxTipo.setSelectedItem(model.getTipo());
            jSpinnerQnt.setValue(model.getQnt());
            jTextFieldPreco.setText(String.valueOf(model.getPreco()));
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_jTableMedicamentosMouseClicked

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        listaParaArquivo();
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed
    
    public void preencherTabela () {
        ArrayList dados =  new ArrayList();
        String[] colunas = new String[]{"Registro MS", "Nome", "Fabricante", "Verificador", "Tipo de Ação", "Tipo de Medicamento", "Quantidade", "Preço"};
        int i = 0;
        
        try {
            do {
                if (listaMedicamentos.pega(i).getNome().contains(jTextFieldPesquisar.getText().toLowerCase())) {
                    dados.add(new Object[]{listaMedicamentos.pega(i).getRegistroMS(),listaMedicamentos.pega(i).getNome(),listaMedicamentos.pega(i).getFabricante(),listaMedicamentos.pega(i).getVerificador(),listaMedicamentos.pega(i).getAcao(),listaMedicamentos.pega(i).getTipo(),listaMedicamentos.pega(i).getQnt(),listaMedicamentos.pega(i).getPreco()});
                }
                i++;
            } while (listaMedicamentos.pega(i)!=null);
        } catch (IllegalArgumentException ex) {
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableMedicamentos.setModel(modelo);
        jTableMedicamentos.getColumnModel().getColumn(0).setPreferredWidth(52);
        jTableMedicamentos.getColumnModel().getColumn(0).setResizable(false);
        jTableMedicamentos.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableMedicamentos.getColumnModel().getColumn(1).setResizable(false);
        jTableMedicamentos.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableMedicamentos.getColumnModel().getColumn(2).setResizable(false);
        jTableMedicamentos.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableMedicamentos.getColumnModel().getColumn(3).setResizable(false);
        jTableMedicamentos.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableMedicamentos.getColumnModel().getColumn(4).setResizable(false);
        jTableMedicamentos.getColumnModel().getColumn(5).setPreferredWidth(130);
        jTableMedicamentos.getColumnModel().getColumn(5).setResizable(false);
        jTableMedicamentos.getColumnModel().getColumn(6).setPreferredWidth(80);
        jTableMedicamentos.getColumnModel().getColumn(6).setResizable(false);
        jTableMedicamentos.getColumnModel().getColumn(7).setPreferredWidth(50);
        jTableMedicamentos.getColumnModel().getColumn(7).setResizable(false);
        jTableMedicamentos.getTableHeader().setReorderingAllowed(false);
        jTableMedicamentos.setAutoResizeMode(jTableMedicamentos.AUTO_RESIZE_OFF);
        jTableMedicamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    
   //escrever o metodo para salvar a lista no arquivo 
    public void listaParaArquivo() {
                
    }
    
    //escrever o metodo para puxar do arquivo pra lista
    public void arquivoParaLista () {
        
    }
    
        public static void main(String args[]) {

        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConMedicamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxAcao;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerQnt;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableMedicamentos;
    private javax.swing.JTextField jTextFieldFabricante;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldRegistroMS;
    private javax.swing.JTextField jTextFieldVerificador;
    // End of variables declaration//GEN-END:variables
}
