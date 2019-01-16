/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelBeans.Cliente;
import modelBeans.ModeloTabela;
import modelBeans.Venda;
import modelDao.ListaEncadeadaCliente;
import modelDao.ListaEncadeadaVenda;

/**
 *
 * @author igorh
 */
public class Relatorio extends javax.swing.JFrame {

    ListaEncadeadaVenda listaVendas = new ListaEncadeadaVenda();
    ListaEncadeadaCliente listaClientes = new ListaEncadeadaCliente();
    long cpfSel=-1;
    
    public Relatorio() {
        arquivoParaListaVenda();
        arquivoParaListaCliente();
        initComponents();
        preencherTabelaVendas();
        preencherTabelaClientes();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Relatório de vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableVendas);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Vendas realizadas");

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Busca por cliente");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 225, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscar)
                            .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
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

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        cpfSel = (long) jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 1);
        preencherTabelaVendas();
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (jTextFieldBuscar.getText().equals("")) {
            cpfSel=-1;
            preencherTabelaVendas();
        } else {            
            preencherTabelaClientes();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    public boolean arquivoParaListaVenda () {
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("listaVendas.txt"));
            String linha = "";
            while ((linha = br.readLine()) != null){
                String array[] = linha.substring(0,linha.length()-1).split(";");
                Venda aux = new Venda();
                aux.setData(array[0]);
                aux.setCpf(Long.parseLong(array[1]));
                aux.setRegistroMS(Integer.parseInt(array[2]));
                aux.setCodigo(Integer.parseInt(array[3]));
                listaVendas.adiciona(aux);
            }
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao ler em arquivo."+ex.getMessage());
            return false;
        }
    }
    
    public boolean arquivoParaListaCliente () {
        
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
    
    public void preencherTabelaClientes () {
        ArrayList dados =  new ArrayList();
        String[] colunas = new String[]{"Nome", "CPF"};
        int i = 0;
        
        try{
            do {
                if (listaClientes.pega(i).getNome().contains(jTextFieldBuscar.getText().toLowerCase())) {
                    dados.add(new Object[]{listaClientes.pega(i).getNome(),listaClientes.pega(i).getCpf()});
                }
                i++;
            } while (listaClientes.pega(i)!=null);
        } catch (IllegalArgumentException ex) {
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableClientes.setModel(modelo);
        jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(168);
        jTableClientes.getColumnModel().getColumn(0).setResizable(false);
        jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(168);
        jTableClientes.getColumnModel().getColumn(1).setResizable(false);
        jTableClientes.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
        jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void preencherTabelaVendas () {
        ArrayList dados =  new ArrayList();
        String[] colunas = new String[]{"Código","Registro MS","CPF","Data"};
        int i = 0;
        
        try{
            do {
                if (cpfSel==-1) {
                    dados.add(new Object[]{listaVendas.pega(i).getCodigo(),listaVendas.pega(i).getRegistroMS(),listaVendas.pega(i).getCpf(),listaVendas.pega(i).getData()});
                }
                else if (String.valueOf(listaVendas.pega(i).getCpf()).equals(String.valueOf(cpfSel))) {
                    dados.add(new Object[]{listaVendas.pega(i).getCodigo(),listaVendas.pega(i).getRegistroMS(),listaVendas.pega(i).getCpf(),listaVendas.pega(i).getData()});
                }
                i++;
            } while (listaVendas.pega(i)!=null);
        } catch (IllegalArgumentException ex) {
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableVendas.setModel(modelo);
        jTableVendas.getColumnModel().getColumn(0).setPreferredWidth(35);
        jTableVendas.getColumnModel().getColumn(0).setResizable(false);
        jTableVendas.getColumnModel().getColumn(1).setPreferredWidth(85);
        jTableVendas.getColumnModel().getColumn(1).setResizable(false);
        jTableVendas.getColumnModel().getColumn(2).setPreferredWidth(86);
        jTableVendas.getColumnModel().getColumn(2).setResizable(false);
        jTableVendas.getColumnModel().getColumn(3).setPreferredWidth(136);
        jTableVendas.getColumnModel().getColumn(3).setResizable(false);
        jTableVendas.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
        jTableVendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
