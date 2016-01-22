/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cherlanda.app;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author user
 */
public class ARIMA extends javax.swing.JFrame {
  private String fileUploadName;

  /**
   * Creates new form ARIMA
   */
  private void jButton2ActionPerformed(ActionEvent e) {
    FileInputStream fileInputStream = null;
    try {
      DefaultTableModel model = new DefaultTableModel(new String[] {"Date", "Withdrawals"}, 0);
      fileInputStream = new FileInputStream(fileUploadName);
      XSSFWorkbook book = new XSSFWorkbook(fileInputStream);
      XSSFSheet sheet = book.getSheet("Sheet1");
      int rowNum = sheet.getLastRowNum() + 1;
      int colNum = sheet.getRow(0).getLastCellNum();
      for (int i = 1; i < rowNum; i++) {
        XSSFRow row = sheet.getRow(i);
        row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
        model.addRow(new Object[] {row.getCell(0).toString(), row.getCell(1).toString()});
      }
      fileInputStream.close();
      Table_Forecast.setModel(model);
    } catch (Exception err) {
      err.printStackTrace();
    }
  }

  public ARIMA() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  // Generated using JFormDesigner Evaluation license - Willy Willy
  private void initComponents() {
    jPanel1 = new JPanel();
    jPanel6 = new JPanel();
    jLabel7 = new JLabel();
    jLabel8 = new JLabel();
    diffText = new JTextField();
    forrText = new JTextField();
    jButton8 = new JButton();
    jPanel2 = new JPanel();
    jLabel1 = new JLabel();
    jTextField1 = new JTextField();
    jButton1 = new JButton();
    jButton2 = new JButton();
    jPanel3 = new JPanel();
    jScrollPane1 = new JScrollPane();
    Table_Forecast = new JTable();
    jPanel4 = new JPanel();
    jLabel2 = new JLabel();
    jButton3 = new JButton();
    jButton4 = new JButton();
    jButton5 = new JButton();
    jButton6 = new JButton();
    jPanel5 = new JPanel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    jLabel5 = new JLabel();
    jLabel6 = new JLabel();
    jTextField2 = new JTextField();
    jTextField3 = new JTextField();
    jTextField4 = new JTextField();
    jButton7 = new JButton();
    jPanel7 = new JPanel();
    jButton9 = new JButton();

    //======== this ========
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridBagLayout());
    ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0};
    ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0};
    ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
    ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

    //======== jPanel1 ========
    {

      // JFormDesigner evaluation mark
      jPanel1.setBorder(new javax.swing.border.CompoundBorder(
        new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
          "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
          javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
          java.awt.Color.red), jPanel1.getBorder())); jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

      jPanel1.setLayout(new GridBagLayout());
      ((GridBagLayout)jPanel1.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
      ((GridBagLayout)jPanel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
      ((GridBagLayout)jPanel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
      ((GridBagLayout)jPanel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

      //======== jPanel6 ========
      {
        jPanel6.setLayout(new GridLayout(3, 3, 10, 0));

        //---- jLabel7 ----
        jLabel7.setText("Differencing");
        jPanel6.add(jLabel7);

        //---- jLabel8 ----
        jLabel8.setText("Forecast Decision");
        jPanel6.add(jLabel8);
        jPanel6.add(diffText);
        jPanel6.add(forrText);

        //---- jButton8 ----
        jButton8.setText("APPLY");
        jPanel6.add(jButton8);
      }
      jPanel1.add(jPanel6, new GridBagConstraints(0, 2, 2, 1, 0.0, 0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
        new Insets(0, 0, 5, 5), 0, 0));

      //======== jPanel2 ========
      {
        jPanel2.setLayout(new GridLayout(1, 4));

        //---- jLabel1 ----
        jLabel1.setText("Upload");
        jPanel2.add(jLabel1);

        //---- jTextField1 ----
        jTextField1.setText("File Search dir here");
        jTextField1.addActionListener(e -> jTextField1ActionPerformed(e));
        jPanel2.add(jTextField1);

        //---- jButton1 ----
        jButton1.setText("Search");
        jButton1.addActionListener(e -> jButton1ActionPerformed(e));
        jPanel2.add(jButton1);

        //---- jButton2 ----
        jButton2.setText("Upload");
        jButton2.addActionListener(e -> jButton2ActionPerformed(e));
        jPanel2.add(jButton2);
      }
      jPanel1.add(jPanel2, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
        new Insets(0, 0, 5, 0), 0, 0));

      //======== jPanel3 ========
      {

        //======== jScrollPane1 ========
        {

          //---- Table_Forecast ----
          Table_Forecast.setModel(new DefaultTableModel(
            new Object[][] {
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
              {null, null},
            },
            new String[] {
              "Date", "Withdrawals"
            }
          ));
          jScrollPane1.setViewportView(Table_Forecast);
        }

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
          jPanel3Layout.createParallelGroup()
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)
              .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
          jPanel3Layout.createParallelGroup()
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 586, GroupLayout.PREFERRED_SIZE)
              .addContainerGap())
        );
      }
      jPanel1.add(jPanel3, new GridBagConstraints(2, 1, 1, 4, 0.0, 0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
        new Insets(0, 0, 0, 0), 0, 0));

      //======== jPanel4 ========
      {

        //---- jLabel2 ----
        jLabel2.setText("ACTION");

        //---- jButton3 ----
        jButton3.setText("PLOT TS");
        jButton3.addActionListener(e -> jButton3ActionPerformed(e));

        //---- jButton4 ----
        jButton4.setText("CHECK STATIONARY");

        //---- jButton5 ----
        jButton5.setText("ACF");

        //---- jButton6 ----
        jButton6.setText("PACF");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
          jPanel4Layout.createParallelGroup()
            .addGroup(jPanel4Layout.createSequentialGroup()
              .addContainerGap()
              .addGroup(jPanel4Layout.createParallelGroup()
                .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createSequentialGroup()
                  .addComponent(jLabel2)
                  .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
          jPanel4Layout.createParallelGroup()
            .addGroup(jPanel4Layout.createSequentialGroup()
              .addContainerGap()
              .addComponent(jLabel2)
              .addGap(18, 18, 18)
              .addComponent(jButton3)
              .addGap(18, 18, 18)
              .addComponent(jButton4)
              .addGap(18, 18, 18)
              .addComponent(jButton5)
              .addGap(18, 18, 18)
              .addComponent(jButton6)
              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
      }
      jPanel1.add(jPanel4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
        new Insets(0, 0, 5, 5), 0, 0));

      //======== jPanel5 ========
      {

        //---- jLabel3 ----
        jLabel3.setText("MODEL");

        //---- jLabel4 ----
        jLabel4.setText("AR");

        //---- jLabel5 ----
        jLabel5.setText("I");

        //---- jLabel6 ----
        jLabel6.setText("MA");

        //---- jButton7 ----
        jButton7.setText("FORECAST");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
          jPanel5Layout.createParallelGroup()
            .addGroup(jPanel5Layout.createSequentialGroup()
              .addContainerGap()
              .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel3)
                .addGroup(jPanel5Layout.createSequentialGroup()
                  .addComponent(jLabel6)
                  .addGap(18, 18, 18)
                  .addComponent(jTextField4, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createSequentialGroup()
                  .addGroup(jPanel5Layout.createParallelGroup()
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jTextField3))))
              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
              .addGap(0, 0, Short.MAX_VALUE)
              .addComponent(jButton7))
        );
        jPanel5Layout.setVerticalGroup(
          jPanel5Layout.createParallelGroup()
            .addGroup(jPanel5Layout.createSequentialGroup()
              .addContainerGap()
              .addComponent(jLabel3)
              .addGap(18, 18, 18)
              .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addGap(18, 18, 18)
              .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addGap(18, 18, 18)
              .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jButton7))
        );
      }
      jPanel1.add(jPanel5, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
        new Insets(0, 0, 5, 5), 0, 0));

      //======== jPanel7 ========
      {
        jPanel7.setLayout(new GridBagLayout());
        ((GridBagLayout)jPanel7.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)jPanel7.getLayout()).rowHeights = new int[] {0, 0};
        ((GridBagLayout)jPanel7.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
        ((GridBagLayout)jPanel7.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

        //---- jButton9 ----
        jButton9.setText("BACK TO MAIN MENU");
        jButton9.addActionListener(e -> jButton9ActionPerformed(e));
        jPanel7.add(jButton9, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
          GridBagConstraints.CENTER, GridBagConstraints.BOTH,
          new Insets(0, 0, 0, 0), 0, 0));
      }
      jPanel1.add(jPanel7, new GridBagConstraints(0, 3, 2, 1, 0.0, 0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
        new Insets(0, 0, 5, 5), 0, 0));
    }
    contentPane.add(jPanel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
      GridBagConstraints.CENTER, GridBagConstraints.BOTH,
      new Insets(0, 0, 5, 5), 0, 0));
    pack();
    setLocationRelativeTo(getOwner());
  }// </editor-fold>//GEN-END:initComponents

  private void jTextField1ActionPerformed(
      java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextField1ActionPerformed

  private void jButton1ActionPerformed(
      java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);
    File f = chooser.getSelectedFile();
    String filename = f.getAbsolutePath();
    fileUploadName = filename;
    jTextField1.setText(filename);
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton9ActionPerformed(
      java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    // TODO add your handling code here:
    dispose();
    MainMenu mm = new MainMenu();
    mm.setVisible(true);

  }//GEN-LAST:event_jButton9ActionPerformed

  private void jButton3ActionPerformed(
      java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:


  }//GEN-LAST:event_jButton3ActionPerformed

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
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
          .getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(ARIMA.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ARIMA.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ARIMA.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ARIMA.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ARIMA().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  // Generated using JFormDesigner Evaluation license - Willy Willy
  private JPanel jPanel1;
  private JPanel jPanel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JTextField diffText;
  private JTextField forrText;
  private JButton jButton8;
  private JPanel jPanel2;
  private JLabel jLabel1;
  private JTextField jTextField1;
  private JButton jButton1;
  private JButton jButton2;
  private JPanel jPanel3;
  private JScrollPane jScrollPane1;
  private JTable Table_Forecast;
  private JPanel jPanel4;
  private JLabel jLabel2;
  private JButton jButton3;
  private JButton jButton4;
  private JButton jButton5;
  private JButton jButton6;
  private JPanel jPanel5;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JTextField jTextField2;
  private JTextField jTextField3;
  private JTextField jTextField4;
  private JButton jButton7;
  private JPanel jPanel7;
  private JButton jButton9;
  // End of variables declaration//GEN-END:variables
}
