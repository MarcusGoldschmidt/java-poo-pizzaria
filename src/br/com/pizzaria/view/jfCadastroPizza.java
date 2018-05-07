/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzaria.view;

import br.com.dao.PizzaDao;
import br.com.pizzaria.model.Pizza;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fábia Piovesan
 */
public class jfCadastroPizza extends javax.swing.JInternalFrame {

    /**
     * Creates new form jfCadastroO
     */
    public jfCadastroPizza() {
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

        JT_PrecoPequena = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlnome = new javax.swing.JLabel();
        JT_Nome = new javax.swing.JTextField();
        jbExcluir = new javax.swing.JButton();
        jltamanho = new javax.swing.JLabel();
        jbAlterar = new javax.swing.JButton();
        jbInserir = new javax.swing.JButton();
        jlprecopequena = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JT_ID_PIZZA = new javax.swing.JTextField();
        JT_Tamanho = new javax.swing.JTextField();
        jbConsultar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Pizza");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Pizza");

        jlnome.setText("Nome:");

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jltamanho.setText("Tamanho:");

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbInserir.setText("Inserir");
        jbInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirActionPerformed(evt);
            }
        });

        jlprecopequena.setText("Preço:");

        jLabel2.setText("Id Pizza:");

        jbConsultar.setText("Consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbAlterar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlprecopequena)
                        .addComponent(jltamanho)
                        .addComponent(jlnome)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JT_PrecoPequena, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addComponent(JT_Tamanho)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(JT_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addComponent(JT_ID_PIZZA))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbConsultar)
                        .addGap(28, 28, 28)
                        .addComponent(jbExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jbInserir)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JT_ID_PIZZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnome)
                    .addComponent(JT_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jltamanho)
                    .addComponent(JT_Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlprecopequena)
                    .addComponent(JT_PrecoPequena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar)
                    .addComponent(jbInserir)
                    .addComponent(jbExcluir)
                    .addComponent(jbConsultar))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirActionPerformed
        // TODO add your handling code here: Inserir

        Pizza pizza = new Pizza();
        PizzaDao pizzadao = new PizzaDao();

        pizza.setNome(JT_Nome.getText());
        pizza.setPreco(Integer.parseInt(JT_PrecoPequena.getText()));
        pizza.setTamanho(JT_Tamanho.getText());

        try {
            pizzadao.inserir(pizza);
        } catch (SQLException ex) {
            Logger.getLogger(jfCadastroPizza.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbInserirActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        Pizza pizza = new Pizza();
        PizzaDao pizzadao = new PizzaDao();

        pizza.setIdPizza(Integer.parseInt(JT_ID_PIZZA.getText()));

        try {
            pizzadao.remove(pizza);
        } catch (SQLException ex) {
            Logger.getLogger(jfCadastroPizza.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        // TODO add your handling code here:
        Pizza pizza = new Pizza();
        PizzaDao pizzadao = new PizzaDao();
        
        pizza.setIdPizza(Integer.parseInt(JT_ID_PIZZA.getText()));
        
        this.JT_Nome.setText(pizza.getNome());
        this.JT_PrecoPequena.setText(String.valueOf(pizza.getPreco()));
        this.JT_Tamanho.setText(pizza.getTamanho());
        
        try {
            pizzadao.ConsultarPizza(pizza);
                    
                    } catch (SQLException ex) {
            Logger.getLogger(jfCadastroPizza.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        Pizza pizza = new Pizza();
        PizzaDao pizzadao = new PizzaDao();
        

        pizza.setNome(JT_Nome.getText());
        pizza.setPreco(Integer.parseInt(JT_PrecoPequena.getText()));
        pizza.setTamanho(JT_Tamanho.getText());
        pizza.setIdPizza(Integer.parseInt(JT_ID_PIZZA.getText()));

        pizzadao.altera(pizza);
        
    }//GEN-LAST:event_jbAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JT_ID_PIZZA;
    private javax.swing.JTextField JT_Nome;
    private javax.swing.JTextField JT_PrecoPequena;
    private javax.swing.JTextField JT_Tamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbInserir;
    private javax.swing.JLabel jlnome;
    private javax.swing.JLabel jlprecopequena;
    private javax.swing.JLabel jltamanho;
    // End of variables declaration//GEN-END:variables
}
