/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_pesquisar;

import bean.JmjVendasBebidas;
import bean.JmjBebidas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerJmjVendasBebidas extends AbstractTableModel {

    private List<JmjVendasBebidas> lstVendaBebidas;

    public void setList(List lstPedidos) {
        this.lstVendaBebidas = lstVendaBebidas;
        fireTableDataChanged();
    }
    public List<JmjVendasBebidas> getVendas() {
        return lstVendaBebidas;
    }
    
    public JmjVendasBebidas getBean(int rowIndex) {
        return (JmjVendasBebidas) lstVendaBebidas.get(rowIndex);
    }
    
    public void addBean(JmjVendasBebidas vendasBebidas) {
        this.lstVendaBebidas.add(vendasBebidas);
        this.fireTableDataChanged();
    }
    
    public void removeBean(int rowIndex){
        this.lstVendaBebidas.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstVendaBebidas != null ? lstVendaBebidas.size() : 0;
                
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjVendasBebidas vendasBebidas = (JmjVendasBebidas) lstVendaBebidas.get( rowIndex);
        if ( columnIndex == 0 ){
            return vendasBebidas.getJmjBebidas().getJmjIdBebidas();
        } else if (columnIndex ==1) {
            return vendasBebidas.getJmjBebidas().getJmjNome();        
        } else if (columnIndex ==2) {
            return vendasBebidas.getJmjVendas();
        } else if (columnIndex ==3) {
            return vendasBebidas.getJmjQuantidade();
        } else if (columnIndex ==4) {
            return vendasBebidas.getJmjTotalBebidas() * vendasBebidas.getJmjPreco();
        } else if (columnIndex ==4) {
            return vendasBebidas.getJmjPreco() * vendasBebidas.getJmjPreco();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Bebidas:";         
        } else if ( columnIndex == 2) {
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Preço";
        } else if ( columnIndex == 4) {
            return "Total";
        } 
        return "";
    }
    
}
