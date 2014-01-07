/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author charmex
 */
public class Utility {

    public static boolean isNumber(String text) {
        if (text.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")) {
            System.out.println("Is a number");
            return true;
        } else {
            System.out.println("Is not a number");
            return false;
        }
    }

    public static void initCombo(JComboBox cmb, Connection con, String qry, String column, boolean select) {
        try {
            ResultSet rs;
            Statement st = con.createStatement();
            cmb.removeAllItems();
            rs = (ResultSet) st.executeQuery(qry);
            while (rs.next()) {
                cmb.addItem(rs.getString(column));
            }
            if (select) {
                cmb.setSelectedIndex(-1);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getErrorCode());
        }
    }

    public static void initLists(JList lst, Connection con, String qry, String column) {
        try {
            Statement st = con.createStatement();
            ResultSet rs;
            rs = (ResultSet) st.executeQuery(qry);
            final ArrayList<String> nombres = new ArrayList<String>();
            while (rs.next()) {
                nombres.add(rs.getString(column));
            }

            lst.setModel(new javax.swing.AbstractListModel() {

                ArrayList<String> strings = nombres;

                public int getSize() {
                    return strings.size();
                }

                public Object getElementAt(int i) {
                    return strings.get(i);
                }
            });
            lst.setSelectedIndex(-1);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getErrorCode());
            System.out.println(ex.getMessage());
        }
    }
}
