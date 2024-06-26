
package ventanas;

import procesos.VectorObjetos;
import datos.*;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame
{
    VectorObjetos vectorDeCanales;
    CanalTV objCanal;
    int n;
    
    public FrmPrincipal()
    {
        initComponents();
        setLocationRelativeTo(this);
        
        n = 20;
        vectorDeCanales = new VectorObjetos(n);
    }
    
    public void mostrar(int i)  // método recursivo
    {
        if(i>=0){
            objCanal = vectorDeCanales.getElemento(i);
            txaResultado.append(objCanal.nro + "\t" + objCanal.nombre + "\n");
            mostrar(i-1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        btnAdicionar = new javax.swing.JButton();
        btnMostrarIterativo = new javax.swing.JButton();
        btnMostrarRecursivo = new javax.swing.JButton();
        btnBuscarIterativo = new javax.swing.JButton();
        btnBuscarRecursivo = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Canales de TV");

        jLabel1.setText("Número");

        jLabel2.setText("Nombre");

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnMostrarIterativo.setText("Iterativo");
        btnMostrarIterativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarIterativoActionPerformed(evt);
            }
        });

        btnMostrarRecursivo.setText("Recursivo");
        btnMostrarRecursivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRecursivoActionPerformed(evt);
            }
        });

        btnBuscarIterativo.setText("Iterativo");
        btnBuscarIterativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIterativoActionPerformed(evt);
            }
        });

        btnBuscarRecursivo.setText("Recursivo");
        btnBuscarRecursivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRecursivoActionPerformed(evt);
            }
        });

        jLabel3.setText("MOSTRAR");

        jLabel4.setText("BUSCAR");

        jLabel5.setText("Pais");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNombre)
                            .addComponent(txtPais))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostrarRecursivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarRecursivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarIterativo)
                            .addComponent(btnBuscarIterativo))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarRecursivo)
                            .addComponent(btnBuscarRecursivo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar()
    {
        txtNombre.setText("");
        txtPais.setText("");
        
        txtNro.setText("");
        txtNro.requestFocus();
    }
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        objCanal = new CanalTV();
        
        objCanal.nro = Integer.parseInt(txtNro.getText());
        objCanal.nombre = txtNombre.getText();
        objCanal.pais = txtPais.getText();
        
        vectorDeCanales.adicionar(objCanal);
        limpiar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnMostrarIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIterativoActionPerformed
        // TODO add your handling code here:
        int i;
        txaResultado.setText("");
        
        for(i=0; i<vectorDeCanales.getConta(); i=i+1)
        {
            objCanal = vectorDeCanales.getElemento(i);
            txaResultado.append(objCanal.nro + "\t" + objCanal.nombre + "\n");
        }
    }//GEN-LAST:event_btnMostrarIterativoActionPerformed
        
    private void btnMostrarRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRecursivoActionPerformed
        // TODO add your handling code here:
        txaResultado.setText("");
        mostrar(vectorDeCanales.getConta()-1);
    }//GEN-LAST:event_btnMostrarRecursivoActionPerformed

    private void btnBuscarIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIterativoActionPerformed
        // TODO add your handling code here:
        int aux;
        int pos;
        
        aux = Integer.parseInt(txtNro.getText());
        pos = vectorDeCanales.buscarPorNro(aux);
        
        if(pos != -1)
        {
            objCanal = vectorDeCanales.getElemento(pos);
            txtNombre.setText(objCanal.nombre);
            txtPais.setText(objCanal.pais);
        }
        else
            JOptionPane.showMessageDialog(this, "Canal no está en el Vector");
    }//GEN-LAST:event_btnBuscarIterativoActionPerformed

    private void btnBuscarRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRecursivoActionPerformed
        // TODO add your handling code here:
        int aux;
        int pos;
        
        aux = Integer.parseInt(txtNro.getText());
        pos = vectorDeCanales.buscarPorNro(vectorDeCanales.getConta()-1, aux);
        
        if(pos != -1)
        {
            objCanal = vectorDeCanales.getElemento(pos);
            txtNombre.setText(objCanal.nombre);
            txtPais.setText(objCanal.pais);
        }
        else
            JOptionPane.showMessageDialog(this, "Canal no está en el Vector");
    }//GEN-LAST:event_btnBuscarRecursivoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscarIterativo;
    private javax.swing.JButton btnBuscarRecursivo;
    private javax.swing.JButton btnMostrarIterativo;
    private javax.swing.JButton btnMostrarRecursivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaResultado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNro;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
