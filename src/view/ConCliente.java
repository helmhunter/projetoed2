package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelBeans.Cliente;
import modelBeans.ModeloTabela;
import modelDao.ListaEncadeadaCliente;

public class ConCliente extends javax.swing.JFrame {

    boolean flag = false;
    ListaEncadeadaCliente listaClientes = new ListaEncadeadaCliente();
    long cpfSel;
    File arquivo;
    
    
    public ConCliente() {
        this.arquivo = new File("listaClientes.txt");
        initComponents();
        arquivoParaLista();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerIdade = new javax.swing.JSpinner();
        jButtonSair = new javax.swing.JButton();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jLabelCPF.setText("CPF:");

        jLabel4.setText("Endereço:");

        jLabelTelefone.setText("Telefone:");

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldCPF.setEnabled(false);
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });

        jTextFieldEndereco.setEnabled(false);

        jLabel8.setText("Idade:");

        jSpinnerIdade.setEnabled(false);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTextFieldTelefone.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabel4)
                    .addComponent(jLabelCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinnerIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCPF, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(325, 325, 325)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinnerIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableClientes);

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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                        .addComponent(jTextFieldPesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
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

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        listaParaArquivo();
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        cpfSel = (long) jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 1);
        Cliente model = listaClientes.buscaCpf(cpfSel).getElemento();
        if (model ==  null) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao selecionar");
        } else {
            jTextFieldNome.setText(model.getNome());
            jTextFieldCPF.setText(String.valueOf(model.getCpf()));
            jTextFieldEndereco.setText(model.getEndereco());
            jTextFieldTelefone.setText(String.valueOf(model.getTelefone()));
            jSpinnerIdade.setValue(model.getIdade());
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = true;
        jTextFieldNome.setEnabled(true);
        jTextFieldCPF.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jSpinnerIdade.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldNome.setText("");
        jTextFieldCPF.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldTelefone.setText("");
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisar.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            if (jTextFieldNome.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo do nome vazio.");
                jTextFieldNome.requestFocus();
            } else if (jTextFieldCPF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo de fabricante vazio.");
                jTextFieldCPF.requestFocus();
            } else if (jTextFieldEndereco.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo do verificador de receita vazio.");
                jTextFieldCPF.requestFocus();
            } else if (Integer.parseInt(jSpinnerIdade.getValue().toString())<0) {
                JOptionPane.showMessageDialog(null, "Quantidade menor que zero");
                jSpinnerIdade.requestFocus();
            } else if (jTextFieldTelefone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo do telefone vazio.");
                jTextFieldTelefone.requestFocus();
            } else {
                if (flag==true) {
                    Cliente novo = new Cliente();
                    novo.setNome(jTextFieldNome.getText().toLowerCase());
                    novo.setCpf((Long.parseLong(jTextFieldCPF.getText())));
                    novo.setEndereco(jTextFieldEndereco.getText());
                    novo.setTelefone(Long.parseLong(jTextFieldTelefone.getText()));
                    novo.setIdade((int) jSpinnerIdade.getValue());
                    listaClientes.adiciona(novo);
                } else {
                    listaClientes.buscaCpf(cpfSel).getElemento().setNome(jTextFieldNome.getText().toLowerCase());
                    listaClientes.buscaCpf(cpfSel).getElemento().setCpf(Long.parseLong(jTextFieldCPF.getText()));
                    listaClientes.buscaCpf(cpfSel).getElemento().setEndereco(jTextFieldEndereco.getText().toLowerCase());
                    listaClientes.buscaCpf(cpfSel).getElemento().setTelefone(Long.parseLong(jTextFieldTelefone.getText()));
                    listaClientes.buscaCpf(cpfSel).getElemento().setIdade((int) jSpinnerIdade.getValue());
                }
                jTextFieldNome.setText("");
                jTextFieldCPF.setText("");
                jTextFieldEndereco.setText("");
                jTextFieldTelefone.setText("");
                jSpinnerIdade.setValue(0);
                jTextFieldNome.setEnabled(false);
                jTextFieldCPF.setEnabled(false);
                jTextFieldEndereco.setEnabled(false);
                jTextFieldTelefone.setEnabled(false);
                jSpinnerIdade.setEnabled(false);
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

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(!true);
        jTextFieldCPF.setEnabled(!true);
        jTextFieldEndereco.setEnabled(!true);
        jTextFieldTelefone.setEnabled(!true);
        jSpinnerIdade.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldPesquisar.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jTextFieldNome.setText("");
        jTextFieldCPF.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldTelefone.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = false;
        jTextFieldNome.setEnabled(true);
        jTextFieldCPF.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jSpinnerIdade.setEnabled(true);
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
            listaClientes.removeCpf(cpfSel);
            jTextFieldNome.setText("");
            jTextFieldCPF.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldTelefone.setText("");
            jSpinnerIdade.setValue(0);
            jTextFieldNome.setEnabled(false);
            jTextFieldCPF.setEnabled(false);
            jTextFieldEndereco.setEnabled(false);
            jTextFieldTelefone.setEnabled(false);
            jSpinnerIdade.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            preencherTabela();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        preencherTabela();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    public void preencherTabela () {
        ArrayList dados =  new ArrayList();
        String[] colunas = new String[]{"Nome", "CPF", "Endereço", "Telefone", "Idade"};
        int i = 0;
        
        try{
            do {
                if (listaClientes.pega(i).getNome().contains(jTextFieldPesquisar.getText().toLowerCase())) {
                    dados.add(new Object[]{listaClientes.pega(i).getNome(),listaClientes.pega(i).getCpf(),listaClientes.pega(i).getEndereco(),listaClientes.pega(i).getTelefone(),listaClientes.pega(i).getIdade()});
                }
                i++;
            } while (listaClientes.pega(i)!=null);
        } catch (IllegalArgumentException ex) {
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableClientes.setModel(modelo);
        jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(232);
        jTableClientes.getColumnModel().getColumn(0).setResizable(false);
        jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableClientes.getColumnModel().getColumn(1).setResizable(false);
        jTableClientes.getColumnModel().getColumn(2).setPreferredWidth(230);
        jTableClientes.getColumnModel().getColumn(2).setResizable(false);
        jTableClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableClientes.getColumnModel().getColumn(3).setResizable(false);
        jTableClientes.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTableClientes.getColumnModel().getColumn(4).setResizable(false);
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jTableClientes.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
        jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    //escrever o metodo para salvar a lista no arquivo 
    public boolean listaParaArquivo() {
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter (arquivo));
            for (int i = 0; i<listaClientes.tamanho(); i++) {
                bf.write(listaClientes.pega(i).getNome()+";");
                bf.write(listaClientes.pega(i).getCpf()+";");
                bf.write(listaClientes.pega(i).getEndereco()+";");
                bf.write(listaClientes.pega(i).getIdade()+";");
                bf.write(listaClientes.pega(i).getIdade()+";");
                Integer aux[] = listaClientes.pega(i).getCompras();
                for (int j=0; j<aux.length; j++) {
                    bf.write(aux[j]+";");
                }
                bf.write("\n");
            }
            bf.close();
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar em arquivo."+ex.getMessage());
            return false;
        }
    }
    
    //escrever o metodo para puxar do arquivo pra lista
    public boolean arquivoParaLista () {
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("listaClientes.txt"));
            String linha = "";
            while ((linha = br.readLine()) != null){
                String array[] = linha.substring(0,linha.length()-1).split(";");
                Cliente aux = new Cliente();
                aux.setNome(array[0]);
                aux.setCpf(Long.parseLong(array[1]));
                aux.setEndereco(array[2]);
                aux.setTelefone(Long.parseLong(array[3]));
                aux.setIdade(Integer.parseInt(array[4]));
                Integer compras[] = new Integer[100];
                for (int i=0; i<compras.length;i++) {
                    if (array[i+5].equals("null")){
                        break;
                    }
                    compras[i] = Integer.parseInt(array[i+5]);
                }
                aux.setCompras(compras);
                listaClientes.adiciona(aux);
            }
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao ler em arquivo."+ex.getMessage());
            return false;
        }
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
            java.util.logging.Logger.getLogger(ConCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConCliente().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerIdade;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
