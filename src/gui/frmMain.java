/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.TMMods;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import support.Utility;

/**
 *
 * @author Carlos
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        connectToDb();
        initComponents();
        initFields();
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        pnlBase = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstItemSpec = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstItem = new javax.swing.JList();
        lblBase = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox();
        btnAddMods = new javax.swing.JButton();
        pnlMods = new javax.swing.JPanel();
        lblModsType = new javax.swing.JLabel();
        lblModsName = new javax.swing.JLabel();
        lblModsRank = new javax.swing.JLabel();
        lblModsLevel = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtRank = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        btnAddMod = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMods = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblValues = new javax.swing.JTable();
        lblMinFirst = new javax.swing.JLabel();
        lblMaxFirst = new javax.swing.JLabel();
        lblMinSecond = new javax.swing.JLabel();
        lblMaxSecond = new javax.swing.JLabel();
        txtMinFirst = new javax.swing.JTextField();
        txtMaxFirst = new javax.swing.JTextField();
        txtMinSecond = new javax.swing.JTextField();
        txtMaxSecond = new javax.swing.JTextField();
        btnSelectMod = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBase.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lstItemSpec.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstItemSpec);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        lstItem.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstItem);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(64, 64, 64))
        );

        lblBase.setText("Bases");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTypeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblBase, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAddMods.setText("Load mods...");
        btnAddMods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddModsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddMods)))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddMods)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMods.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblModsType.setText("Type");

        lblModsName.setText("Name");

        lblModsRank.setText("Rank");

        lblModsLevel.setText("iLevel");

        btnAddMod.setText("Add");

        tblMods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblMods);

        tblValues.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblValues);

        lblMinFirst.setText("Min First");

        lblMaxFirst.setText("Max First");

        lblMinSecond.setText("Min Second");

        lblMaxSecond.setText("Max Second");

        btnSelectMod.setText("Select mod");

        javax.swing.GroupLayout pnlModsLayout = new javax.swing.GroupLayout(pnlMods);
        pnlMods.setLayout(pnlModsLayout);
        pnlModsLayout.setHorizontalGroup(
            pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModsLayout.createSequentialGroup()
                .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddMod)
                    .addGroup(pnlModsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlModsLayout.createSequentialGroup()
                                    .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblModsName)
                                        .addComponent(lblModsType)
                                        .addComponent(lblModsRank))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtType, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(txtName)
                                        .addComponent(txtRank)))
                                .addGroup(pnlModsLayout.createSequentialGroup()
                                    .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMinFirst)
                                        .addComponent(lblMaxFirst)
                                        .addComponent(lblMinSecond)
                                        .addComponent(lblMaxSecond))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMinFirst, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                        .addComponent(txtMaxFirst)
                                        .addComponent(txtMinSecond)
                                        .addComponent(txtMaxSecond)))
                                .addGroup(pnlModsLayout.createSequentialGroup()
                                    .addComponent(lblModsLevel)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtLevel)))
                            .addGroup(pnlModsLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnSelectMod)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        pnlModsLayout.setVerticalGroup(
            pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModsLayout.createSequentialGroup()
                .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlModsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlModsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModsType)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModsName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModsRank)
                            .addComponent(txtRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModsLevel)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddMod)
                            .addComponent(btnSelectMod))))
                .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlModsLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinFirst)
                            .addComponent(txtMinFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaxFirst)
                            .addComponent(txtMaxFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinSecond)
                            .addComponent(txtMinSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlModsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaxSecond)
                            .addComponent(txtMaxSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTypeItemStateChanged
        if (evt.getStateChange() == 1) {
            String selection = (String) cmbType.getSelectedItem();
            if (_DEBUG) {
                System.out.println(selection);
            }
            if (!"Armor".equals(selection)) {
                lstItemSpec.setVisible(false);
            } else {
                lstItemSpec.setVisible(true);
            }
            this.selectedItemType = selection;
            loadItems(selection);
        }
    }//GEN-LAST:event_cmbTypeItemStateChanged

    private void btnAddModsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddModsActionPerformed
        tmMods = new TMMods(this.con, selectedItem, selectedItemSpec, selectedItemType);
        this.tblMods.setModel(tmMods);
        this.tblMods.updateUI();
    }//GEN-LAST:event_btnAddModsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMod;
    private javax.swing.JButton btnAddMods;
    private javax.swing.JButton btnSelectMod;
    private javax.swing.JComboBox cmbType;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblMaxFirst;
    private javax.swing.JLabel lblMaxSecond;
    private javax.swing.JLabel lblMinFirst;
    private javax.swing.JLabel lblMinSecond;
    private javax.swing.JLabel lblModsLevel;
    private javax.swing.JLabel lblModsName;
    private javax.swing.JLabel lblModsRank;
    private javax.swing.JLabel lblModsType;
    private javax.swing.JList lstItem;
    private javax.swing.JList lstItemSpec;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlMods;
    private javax.swing.JTable tblMods;
    private javax.swing.JTable tblValues;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtMaxFirst;
    private javax.swing.JTextField txtMaxSecond;
    private javax.swing.JTextField txtMinFirst;
    private javax.swing.JTextField txtMinSecond;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRank;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
    Connection con;
    String selectedItem;
    String selectedItemSpec;
    String selectedItemType;
    TMMods tmMods;

    private boolean _DEBUG = true;

    private void connectToDb() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String url = "jdbc:mysql://localhost/mods";
            String user = "root";
            String password = "";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Succesfull connection to DB");
        } catch (SQLException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.con = con;
    }

    private void initFields() {
        String qry = "SELECT DISTINCT item_type FROM base";
        Utility.initCombo(cmbType, con, qry, "item_type", true);
        //Clear everyhting else
        qry = "SELECT DISTINCT item FROM base WHERE item_type = \"\"";
        Utility.initLists(lstItem, con, qry, "item");
        qry = "SELECT name FROM item_spec";
        Utility.initLists(lstItemSpec, con, qry, "name");

        lstItem.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList source = (JList) e.getSource();
                String selected = source.getSelectedValue().toString();
            }
        });
        lstItemSpec.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList source = (JList) e.getSource();
                String selected = source.getSelectedValue().toString();
            }
        });

    }

    private void loadItems(String selection) {
        String qry = "SELECT DISTINCT item FROM base WHERE item_type = \"" + selection + "\"";
        Utility.initLists(lstItem, con, qry, "item");
    }
}
