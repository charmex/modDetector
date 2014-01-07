/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Carlos
 */
public class TMMods extends AbstractTableModel {

    private ArrayList<String> titulos;
    private ArrayList<String> datos;

    public TMMods(){
        titulos = new ArrayList();
        titulos.add("Type");
        titulos.add("Name");
        titulos.add("Rank");
        titulos.add("iLvl");
        
    }
    
    public TMMods(Connection con, String selectedItem, String selectedItemSpec, String selectedItemType){
        this();
        //Get id of combination of base
        StringBuilder qry = new StringBuilder("");
        qry.append("SELECT id FROM base WHERE item_type = ");
        qry.append("\"");
        qry.append(selectedItemType);
        qry.append("\"");
        qry.append("AND item = ");
        qry.append("\"");
        qry.append(selectedItem);
        qry.append("\"");
        if(!selectedItemSpec.equals("")){
            //get id of spec
            qry.append("AND item_spec_id = ");
            qry.append("(");
            qry.append("SELECT id FROM item_spec WHERE name = ");
            qry.append("\"");
            qry.append(selectedItemSpec);
            qry.append("\"");
            qry.append(")");
        }
        String sql = qry.toString();
        
        
        //Get id of every mods_id from the base
        qry = new StringBuilder("");
        qry.append("SELECT mods_id FROM base_has_mods WHERE base_id = ");
        qry.append("\"");
        qry.append(sql);
        qry.append("\"");
        sql = qry.toString();
        
        //Get all the info from that id
        qry = new StringBuilder("");
        qry.append("SELECT * FROM mods WHERE id = ");
        qry.append("\"");
        qry.append(sql);
        qry.append("\"");
        
        //Get all the info 
        
    }
    
    @Override
    public int getRowCount() {
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
        return this.titulos.size();
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            
        }
        return null;
    }

}
