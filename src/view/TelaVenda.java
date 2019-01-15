/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelBeans.ModeloTabela;
import modelBeans.Venda;
import modelDao.ListaEncadeadaCliente;
import modelDao.ListaEncadeadaMedicamento;
import modelDao.ListaEncadeadaVenda;

/**
 *
 * @author igorh
 */
public class TelaVenda extends javax.swing.JFrame {

    ListaEncadeadaCliente listaClientes = new ListaEncadeadaCliente();
    ListaEncadeadaMedicamento listaMedicamentos = new ListaEncadeadaMedicamento();
    long cpfSel;
    int registroMSSel;
    ListaEncadeadaVenda listaVendas = new ListaEncadeadaVenda();
    Venda nova = new Venda();
    Date data = new Date();
    
    public TelaVenda() {
        this.registroMSSel = -1;
        this.cpfSel = -1;
        initComponents();
        arquivoParaListaVenda();
        arquivoParaListaCliente();
        arquivoParaListaMedicamentos();
        preencherTabelaClientes();
        preencherTabelaMedicamentos();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMedicamentos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerQnt = new javax.swing.JSpinner();
        jButtonVender = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonPesquisarCliente = new javax.swing.JButton();
        jButtonPesquisarMedicamento = new javax.swing.JButton();
        jTextFieldPesquisarCliente = new javax.swing.JTextField();
        jTextFieldPesquisarMedicamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Realizar venda");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cliente:");

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
        jScrollPane1.setViewportView(jTableClientes);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Medicamento:");

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

        jLabel4.setText("Quantidade:");

        jButtonVender.setText("Vender");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonPesquisarCliente.setText("Pesquisar");

        jButtonPesquisarMedicamento.setText("Pesquisar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonPesquisarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPesquisarCliente))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPesquisarMedicamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesquisarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinnerQnt)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVender)
                        .addGap(284, 284, 284))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisarCliente)
                    .addComponent(jButtonPesquisarMedicamento)
                    .addComponent(jTextFieldPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesquisarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(736, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        if (cpfSel==-1) {
            JOptionPane.showMessageDialog(rootPane,"É preciso selecionar um cliente.");
        } else if (registroMSSel==-1) {
            JOptionPane.showMessageDialog(rootPane,"É preciso selecionar um cliente.");
        } else if (Integer.parseInt((String) jSpinnerQnt.getValue())<1) {
            JOptionPane.showMessageDialog(rootPane,"É preciso selecionar ao menos 1 item.");
        } else if (Integer.parseInt((String) jSpinnerQnt.getValue())>listaMedicamentos.buscaRegistroMS(registroMSSel).getElemento().getQnt()) {
            JOptionPane.showMessageDialog(rootPane,"Quantidade Indisponível.");
        } else {
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(rootPane,"Confirmar Venda?");
            if (resposta == JOptionPane.YES_OPTION) {
                int[] aux=listaClientes.buscaCpf(cpfSel).getElemento().getCompras();
                for (int i=0; i<=aux.length; i++){
                    if (i<=aux.length) {
                        aux[i]=registroMSSel;
                        break;
                    }
                }
                listaClientes.buscaCpf(cpfSel).getElemento().setCompras(aux);
                listaMedicamentos.buscaRegistroMS(registroMSSel).getElemento().setQnt(listaMedicamentos.buscaRegistroMS(registroMSSel).getElemento().getQnt()-Integer.parseInt((String) jSpinnerQnt.getValue()));
                nova.setData(data.getDate());
                nova.setCodigo(gerarCodigo());
                nova.setCpf(cpfSel);;
                nova.setRegistroMS(registroMSSel);
                listaVendas.adiciona(nova);
                JOptionPane.showMessageDialog(rootPane, "Venda realizada com sucesso.");
            }
        }
    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        cpfSel = (long) jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 1);        
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jTableMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicamentosMouseClicked
        registroMSSel = (int) jTableMedicamentos.getValueAt(jTableMedicamentos.getSelectedRow(), 0);
    }//GEN-LAST:event_jTableMedicamentosMouseClicked

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        listaParaArquivoVenda();
        listaParaArquivoCliente();
        listaParaArquivoMedicamento();
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    public void preencherTabelaClientes () {
        ArrayList dados =  new ArrayList();
        String[] colunas = new String[]{"Nome", "CPF"};
        int i = 0;
        
        try{
            do {
                if (listaClientes.pega(i).getNome().contains(jTextFieldPesquisarCliente.getText().toLowerCase())) {
                    dados.add(new Object[]{listaClientes.pega(i).getNome(),listaClientes.pega(i).getCpf()});
                }
                i++;
            } while (listaClientes.pega(i)!=null);
        } catch (IllegalArgumentException ex) {
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableClientes.setModel(modelo);
        jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(138);
        jTableClientes.getColumnModel().getColumn(0).setResizable(false);
        jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(138);
        jTableClientes.getColumnModel().getColumn(1).setResizable(false);
        jTableClientes.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
        jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void preencherTabelaMedicamentos () {
        ArrayList dados =  new ArrayList();
        String[] colunas = new String[]{"Nome","Registro MS"};
        int i = 0;
        
        try {
            do {
                if (listaMedicamentos.pega(i).getNome().contains(jTextFieldPesquisarMedicamento.getText().toLowerCase())) {
                    dados.add(new Object[]{listaMedicamentos.pega(i).getNome(),listaMedicamentos.pega(i).getRegistroMS()});
                }
                i++;
            } while (listaMedicamentos.pega(i)!=null);
        } catch (IllegalArgumentException ex) {
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableMedicamentos.setModel(modelo);
        jTableMedicamentos.getColumnModel().getColumn(0).setPreferredWidth(151);
        jTableMedicamentos.getColumnModel().getColumn(0).setResizable(false);
        jTableMedicamentos.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableMedicamentos.getColumnModel().getColumn(1).setResizable(false);
        jTableMedicamentos.getTableHeader().setReorderingAllowed(false);
        jTableMedicamentos.setAutoResizeMode(jTableMedicamentos.AUTO_RESIZE_OFF);
        jTableMedicamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    
    public int gerarCodigo () {
        int aux=1;
        while (true) {
        if (listaVendas.contem(1)){
            aux++;
        } else {
            break;
        }
        }
        return aux;
    }
    
    public void arquivoParaListaVenda() {
        
    }
    
    public void arquivoParaListaCliente() {
        
    }
    public void arquivoParaListaMedicamentos() {
        
    }
    
    public void listaParaArquivoVenda(){
        
    }
    
    public void listaParaArquivoCliente(){
        
    }
    public void listaParaArquivoMedicamento() {
        
    }
    
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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisarCliente;
    private javax.swing.JButton jButtonPesquisarMedicamento;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerQnt;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableMedicamentos;
    private javax.swing.JTextField jTextFieldPesquisarCliente;
    private javax.swing.JTextField jTextFieldPesquisarMedicamento;
    // End of variables declaration//GEN-END:variables
}
