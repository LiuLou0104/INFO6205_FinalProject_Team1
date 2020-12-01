package UserInterface.ViewReport;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: LiuLou
 * @Description:
 * @Date: Created in 2:39 2020/11/30
 * @Modified By:
 */
public class ChooseSimuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChooseSimuJPanel
     */
    private JPanel jplContainer;

    public ChooseSimuJPanel(JPanel jplContainer) {
        initComponents();
        this.jplContainer = jplContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        btnViewReport = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxChooseSimulationToViewReport = new javax.swing.JComboBox<>();
        btnBack1 = new javax.swing.JButton();

        btnViewReport.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        btnViewReport.setText("View Report");
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("微软雅黑", 1, 16)); // NOI18N
        jLabel6.setText("All Simulations You Have Made");

        jLabel5.setFont(new java.awt.Font("微软雅黑", 1, 12)); // NOI18N
        jLabel5.setText("Choose One Simulation");

        cbxChooseSimulationToViewReport.setFont(new java.awt.Font("微软雅黑", 2, 12)); // NOI18N
        cbxChooseSimulationToViewReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBack1.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        btnBack1.setText("<<Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbxChooseSimulationToViewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(btnViewReport))
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel6)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnViewReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxChooseSimulationToViewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(btnBack1)
                                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // TODO pass the simulation object to ViewReportJPanel
        ViewReportJPanel vrjp = new ViewReportJPanel(jplContainer);
        CardLayout cardLayout = (CardLayout) jplContainer.getLayout();
        jplContainer.add("ViewReportJPanel",vrjp);
        cardLayout.next(jplContainer);
    }

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jplContainer.remove(this);
        CardLayout layout = (CardLayout) jplContainer.getLayout();
        layout.previous(jplContainer);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JComboBox<String> cbxChooseSimulationToViewReport;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration
}