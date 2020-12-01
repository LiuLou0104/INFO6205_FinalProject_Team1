package UserInterface.SingleSimu;

import UserInterface.ViewReport.ChooseSimuJPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: LiuLou
 * @Description:
 * @Date: Created in 2:38 2020/11/30
 * @Modified By:
 */
public class SingleSimuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SingleSimuJPanel
     */
    private JPanel jplContainer;

    public SingleSimuJPanel(JPanel jplContainer) {
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

        jplCanvas = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnGoToChooseReportPage = new javax.swing.JButton();
        txtPopulationDensity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbtnMaskYes = new javax.swing.JRadioButton();
        rbtnMaskNo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rbtnTestYes = new javax.swing.JRadioButton();
        rbtnTestNo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rbtnQuarantineYes = new javax.swing.JRadioButton();
        rbtnQuarantineNo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cbxPathogen = new javax.swing.JComboBox<>();
        btnStartSimu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jplCanvas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jplCanvasLayout = new javax.swing.GroupLayout(jplCanvas);
        jplCanvas.setLayout(jplCanvasLayout);
        jplCanvasLayout.setHorizontalGroup(
                jplCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 457, Short.MAX_VALUE)
        );
        jplCanvasLayout.setVerticalGroup(
                jplCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 316, Short.MAX_VALUE)
        );

        btnBack.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.setEnabled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnGoToChooseReportPage.setBackground(new java.awt.Color(255, 153, 51));
        btnGoToChooseReportPage.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        btnGoToChooseReportPage.setText("See All Reports");
        btnGoToChooseReportPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToChooseReportPageActionPerformed(evt);
            }
        });

        txtPopulationDensity.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 12)); // NOI18N
        jLabel1.setText("Population Density");

        jLabel2.setFont(new java.awt.Font("微软雅黑", 1, 12)); // NOI18N
        jLabel2.setText("Wearing Masks");

        rbtnMaskYes.setText("yes");

        rbtnMaskNo.setText("no");
        rbtnMaskNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaskNoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("微软雅黑", 1, 12)); // NOI18N
        jLabel3.setText("Testing and Contact Tracing");

        rbtnTestYes.setText("yes");

        rbtnTestNo.setText("no");
        rbtnTestNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTestNoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("微软雅黑", 1, 12)); // NOI18N
        jLabel4.setText("Quarantining");

        rbtnQuarantineYes.setText("yes");

        rbtnQuarantineNo.setText("no");
        rbtnQuarantineNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnQuarantineNoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("微软雅黑", 1, 12)); // NOI18N
        jLabel5.setText("Pathogen Type");

        cbxPathogen.setFont(new java.awt.Font("微软雅黑", 2, 12)); // NOI18N
        cbxPathogen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnStartSimu.setBackground(new java.awt.Color(0, 0, 0));
        btnStartSimu.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        btnStartSimu.setForeground(new java.awt.Color(255, 0, 0));
        btnStartSimu.setText("Start Simulation");

        jLabel6.setFont(new java.awt.Font("微软雅黑", 1, 16)); // NOI18N
        jLabel6.setText("Single Pathogen Simulation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jplCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnGoToChooseReportPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPopulationDensity)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbtnMaskYes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rbtnMaskNo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbtnTestYes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rbtnTestNo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbtnQuarantineYes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rbtnQuarantineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxPathogen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnStartSimu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnGoToChooseReportPage)
                                        .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jplCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbxPathogen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(8, 8, 8)
                                                .addComponent(txtPopulationDensity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(rbtnMaskYes)
                                                        .addComponent(rbtnMaskNo))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(rbtnQuarantineYes)
                                                        .addComponent(rbtnQuarantineNo))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(rbtnTestYes)
                                                        .addComponent(rbtnTestNo))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBack)
                                        .addComponent(btnStartSimu))
                                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void btnGoToChooseReportPageActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ChooseSimuJPanel csjp = new ChooseSimuJPanel(jplContainer);
        CardLayout cardLayout = (CardLayout) jplContainer.getLayout();
        jplContainer.add("ChooseSimuJPanel",csjp);
        cardLayout.next(jplContainer);
    }

    private void rbtnMaskNoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void rbtnTestNoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void rbtnQuarantineNoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jplContainer.remove(this);
        CardLayout layout = (CardLayout) jplContainer.getLayout();
        layout.previous(jplContainer);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGoToChooseReportPage;
    private javax.swing.JButton btnStartSimu;
    private javax.swing.JComboBox<String> cbxPathogen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jplCanvas;
    private javax.swing.JRadioButton rbtnMaskNo;
    private javax.swing.JRadioButton rbtnMaskYes;
    private javax.swing.JRadioButton rbtnQuarantineNo;
    private javax.swing.JRadioButton rbtnQuarantineYes;
    private javax.swing.JRadioButton rbtnTestNo;
    private javax.swing.JRadioButton rbtnTestYes;
    private javax.swing.JTextField txtPopulationDensity;
    // End of variables declaration
}