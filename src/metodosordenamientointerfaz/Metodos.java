/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package metodosordenamientointerfaz;
import java.awt.FlowLayout;
import javax.swing.*;
public class Metodos extends javax.swing.JFrame {

    /**
     * Creates new form Metodos
     */
    InternalForm intForm = new InternalForm();
    InternalFormColas colas = new InternalFormColas();
    public Metodos() {
        initComponents();
        //Burbuja.setSelected(true);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Metodos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Burbuja = new javax.swing.JRadioButton();
        Insercion = new javax.swing.JRadioButton();
        MergeSort = new javax.swing.JRadioButton();
        QuickSort = new javax.swing.JRadioButton();
        ListSencillas = new javax.swing.JRadioButton();
        BurbujaMejorada = new javax.swing.JRadioButton();
        Pilas = new javax.swing.JRadioButton();
        Colas = new javax.swing.JRadioButton();
        ListLigadas = new javax.swing.JRadioButton();
        CBOther = new javax.swing.JComboBox();
        JPanelDesktop = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Metodos De Ordenamiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(153, 153, 255))); // NOI18N

        Metodos.add(Burbuja);
        Burbuja.setText("Burbuja Simple");
        Burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurbujaActionPerformed(evt);
            }
        });

        Metodos.add(Insercion);
        Insercion.setText("Inserción");
        Insercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsercionActionPerformed(evt);
            }
        });

        Metodos.add(MergeSort);
        MergeSort.setText("MergeSort");
        MergeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MergeSortActionPerformed(evt);
            }
        });

        Metodos.add(QuickSort);
        QuickSort.setText("QuickSort");
        QuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuickSortActionPerformed(evt);
            }
        });

        Metodos.add(ListSencillas);
        ListSencillas.setText("Listas Sencillas");
        ListSencillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListSencillasActionPerformed(evt);
            }
        });

        Metodos.add(BurbujaMejorada);
        BurbujaMejorada.setText("Burbuja Mejorada");
        BurbujaMejorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurbujaMejoradaActionPerformed(evt);
            }
        });

        Metodos.add(Pilas);
        Pilas.setText("Pilas");
        Pilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilasActionPerformed(evt);
            }
        });

        Metodos.add(Colas);
        Colas.setText("Colas");
        Colas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColasActionPerformed(evt);
            }
        });

        Metodos.add(ListLigadas);
        ListLigadas.setText("Listas Ligadas");
        ListLigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListLigadasActionPerformed(evt);
            }
        });

        CBOther.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Programa 1", "Programa 2", "Programa 3", "Programa 4" }));
        CBOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOtherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Burbuja)
                .addGap(18, 18, 18)
                .addComponent(BurbujaMejorada)
                .addGap(18, 18, 18)
                .addComponent(Insercion)
                .addGap(18, 18, 18)
                .addComponent(QuickSort)
                .addGap(18, 18, 18)
                .addComponent(MergeSort)
                .addGap(18, 18, 18)
                .addComponent(Pilas)
                .addGap(18, 18, 18)
                .addComponent(Colas)
                .addGap(18, 18, 18)
                .addComponent(ListSencillas)
                .addGap(18, 18, 18)
                .addComponent(ListLigadas)
                .addGap(18, 18, 18)
                .addComponent(CBOther, 0, 145, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Burbuja)
                    .addComponent(Insercion)
                    .addComponent(MergeSort)
                    .addComponent(QuickSort)
                    .addComponent(ListSencillas)
                    .addComponent(BurbujaMejorada)
                    .addComponent(Pilas)
                    .addComponent(Colas)
                    .addComponent(ListLigadas)
                    .addComponent(CBOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        JPanelDesktop.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 255, 204), java.awt.Color.darkGray));

        javax.swing.GroupLayout JPanelDesktopLayout = new javax.swing.GroupLayout(JPanelDesktop);
        JPanelDesktop.setLayout(JPanelDesktopLayout);
        JPanelDesktopLayout.setHorizontalGroup(
            JPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        JPanelDesktopLayout.setVerticalGroup(
            JPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurbujaActionPerformed
        colas.setVisible(false); 
        //JOptionPane.showMessageDialog(null, "Llamar a un poanel externo para correrjhgjh!!!");
        intForm.lbTittle.setText("Burbuja Simple");

	 // Se mete el internal en el JDesktopPane
	JPanelDesktop.add(intForm);
	// Se visualiza el JInternalFrame 
	intForm.setVisible(true);
    }//GEN-LAST:event_BurbujaActionPerformed

    private void InsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsercionActionPerformed
        colas.setVisible(false);   
        // Pasa el titulo del método
        intForm.lbTittle.setText("Inserción");
        // Se mete el internal en el JDesktopPane
	JPanelDesktop.add(intForm);
	// Se visualiza el JInternalFrame 
	intForm.setVisible(true);
    }//GEN-LAST:event_InsercionActionPerformed

    private void BurbujaMejoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurbujaMejoradaActionPerformed
        colas.setVisible(false);
        // Pasa el titulo del método
        intForm.lbTittle.setText("Burbuja Mejorada");
        // Se mete el internal en el JDesktopPane
	JPanelDesktop.add(intForm);
	// Se visualiza el JInternalFrame 
	intForm.setVisible(true);
    }//GEN-LAST:event_BurbujaMejoradaActionPerformed

    private void ListSencillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListSencillasActionPerformed
        intForm.setVisible(false);
        // Pasa el titulo del método
        colas.lbTittle.setText("Listas Sencillas");
        // Se mete el internal en el JDesktopPane
	JPanelDesktop.add(colas);
	// Se visualiza el JInternalFrame 
	colas.setVisible(true);
    }//GEN-LAST:event_ListSencillasActionPerformed

    private void QuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuickSortActionPerformed
        colas.setVisible(false);
        // Pasa el titulo del método
        intForm.lbTittle.setText("Quick Sort");
        // Se mete el internal en el JDesktopPane
	JPanelDesktop.add(intForm);
	// Se visualiza el JInternalFrame 
	intForm.setVisible(true);
    }//GEN-LAST:event_QuickSortActionPerformed

    private void MergeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MergeSortActionPerformed
        colas.setVisible(false);
        // Pasa el titulo del método
        intForm.lbTittle.setText("Merge Sort");
        // Se mete el internal en el JDesktopPane
	JPanelDesktop.add(intForm);
	// Se visualiza el JInternalFrame 
	intForm.setVisible(true);
    }//GEN-LAST:event_MergeSortActionPerformed

    private void PilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilasActionPerformed
        //intForm.setVisible(false);
        // Pasa el titulo del método
        intForm.lbTittle.setText("Pilas");
        // Se mete el internal en el JDesktopPane
	JPanelDesktop.add(intForm);
	// Se visualiza el JInternalFrame 
	intForm.setVisible(true);
    }//GEN-LAST:event_PilasActionPerformed

    private void ColasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColasActionPerformed
        intForm.setVisible(false);
        // Pasa el titulo del método
        colas.lbTittle.setText("Colas");
        // Se mete el internal en el JDesktopPane
	JPanelDesktop.add(colas);
	// Se visualiza el JInternalFrame 
	colas.setVisible(true);
    }//GEN-LAST:event_ColasActionPerformed

    private void ListLigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListLigadasActionPerformed
        intForm.setVisible(false);
        // Pasa el titulo del método
        colas.lbTittle.setText("Listas Ligadas");
        // Se mete el internal en el JDesktopPane
	JPanelDesktop.add(colas);
	// Se visualiza el JInternalFrame 
	colas.setVisible(true);
    }//GEN-LAST:event_ListLigadasActionPerformed

    private void CBOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOtherActionPerformed
       if(CBOther.getSelectedItem() != null){
        int select = CBOther.getSelectedIndex();
        switch(select){
           case 0:
             colas.setVisible(false);
            // Pasa el titulo del método
            intForm.lbTittle.setText("Programa 1");
            // Se mete el internal en el JDesktopPane
            JPanelDesktop.add(intForm);
            // Se visualiza el JInternalFrame 
            intForm.setVisible(true);
           break;
           case 1:
             colas.setVisible(false);
            // Pasa el titulo del método
            intForm.lbTittle.setText("Programa 2");
            // Se mete el internal en el JDesktopPane
            JPanelDesktop.add(intForm);
            // Se visualiza el JInternalFrame 
            intForm.setVisible(true);
           break;
           case 2:
             colas.setVisible(false);
            // Pasa el titulo del método
            intForm.lbTittle.setText("Programa 3");
            // Se mete el internal en el JDesktopPane
            JPanelDesktop.add(intForm);
            // Se visualiza el JInternalFrame 
            intForm.setVisible(true);
           break;
           case 3:
             colas.setVisible(false);
            // Pasa el titulo del método
            intForm.lbTittle.setText("Programa 4");
            // Se mete el internal en el JDesktopPane
            JPanelDesktop.add(intForm);
            // Se visualiza el JInternalFrame 
            intForm.setVisible(true);
           break;
        }
       }
        //CBOther.getSelectedItem();
    }//GEN-LAST:event_CBOtherActionPerformed

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
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Metodos().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Burbuja;
    private javax.swing.JRadioButton BurbujaMejorada;
    private javax.swing.JComboBox CBOther;
    private javax.swing.JRadioButton Colas;
    private javax.swing.JRadioButton Insercion;
    private javax.swing.JPanel JPanelDesktop;
    private javax.swing.JRadioButton ListLigadas;
    private javax.swing.JRadioButton ListSencillas;
    private javax.swing.JRadioButton MergeSort;
    private javax.swing.ButtonGroup Metodos;
    private javax.swing.JRadioButton Pilas;
    private javax.swing.JRadioButton QuickSort;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
