/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector2;

import javax.swing.JOptionPane;

/**
 *
 * @author liborio
 */
public class Ejercicio2 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio2
     */
    double v[];

    public Ejercicio2() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtLongitud = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenarM = new javax.swing.JButton();
        cmdLlenarA = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel1.setText("Vector N.2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, 30));

        jLabel8.setText("Longitud");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 12))); // NOI18N

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, 140));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, -1));

        cmdLlenarM.setText("Llenado Manual");
        cmdLlenarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarMActionPerformed(evt);
            }
        });
        cmdLlenarM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmdLlenarMKeyTyped(evt);
            }
        });
        jPanel4.add(cmdLlenarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        cmdLlenarA.setText("Llenado Automatico");
        cmdLlenarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 170, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed

        int l;
        if (txtLongitud.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El Valor De Longitud", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        } else if (Integer.parseInt(txtLongitud.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "La Longitud No Puedes 0, Por Favor Cambie Su Valor", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        } else {
            l = Integer.parseInt(txtLongitud.getText().trim());
            v = new double[l];
            JOptionPane.showMessageDialog(this, "Vector Creado Correctamente");
        }
            cmdCrear.setEnabled(false);
            cmdLlenarM.setEnabled(true);
            cmdLlenarA.setEnabled(true);
            cmdMostrar.setEnabled(false);
            cmdBorrar.setEnabled(true);
            txtLongitud.setEditable(false);

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarMActionPerformed

        double N;
        for (int i = 0; i < v.length; i++) {
            N = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite Por Favor El Elemente En Su Posicion" + i));
            v[i] = N;
        }
        cmdCrear.setEnabled(false);
        cmdLlenarM.setEnabled(false);
        cmdLlenarA.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(false);
    }//GEN-LAST:event_cmdLlenarMActionPerformed

    private void cmdLlenarMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdLlenarMKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_cmdLlenarMKeyTyped

    private void cmdLlenarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAActionPerformed

        double J;
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100 + 1);
        }

        JOptionPane.showMessageDialog(this, "Vector Llenado Con Exito");

        cmdCrear.setEnabled(false);
        cmdLlenarM.setEnabled(false);
        cmdLlenarA.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(false);
    }//GEN-LAST:event_cmdLlenarAActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed

        int P = 0, I = 0, PR = 0;
        for (int i = 0; i < v.length; i++) {
            txtResultado.append(v[i] + "\n");
        }
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                P++;
            } else {
                I++;
            }
            int Cont = 0;
            for (int j = 1; j <= v[i]; j++) {
                if (v[i] % j == 0) {
                    Cont++;
                }
            }
            if (Cont == 2) {
                PR++;
            }
        }
        JOptionPane.showMessageDialog(this, "El Vector Tiene " + P + " Numeros Pares");
        JOptionPane.showMessageDialog(this, "El Vector Tiene " + I + " Numeros Impares");
        JOptionPane.showMessageDialog(this, "El Vector Tiene " + PR+ " Numeros Primos");

        cmdCrear.setEnabled(false);
        cmdLlenarM.setEnabled(false);
        cmdLlenarA.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(false);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed

        txtLongitud.setText("");
        txtResultado.setText("");
        v = null;

        txtLongitud.requestFocusInWindow();
        cmdCrear.setEnabled(true);
        cmdLlenarM.setEnabled(false);
        cmdLlenarA.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(true);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped

         char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtLongitudKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenarA;
    private javax.swing.JButton cmdLlenarM;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
