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

    private List lstVendasBebidas;

    public void setList(List lstPedidos) {
        this.lstVendasBebidas = lstPedidos;
    }
    
    public JmjVendasBebidas getBean(int rowIndex) {
        return (JmjVendasBebidas) lstVendasBebidas.get(rowIndex);
    }
    
    public void addBean(JmjVendasBebidas vendasBebidas) {
        this.lstVendasBebidas.add(vendasBebidas);
        this.fireTableDataChanged();
    }
    
    public void removeBean(int rowIndex){
        this.lstVendasBebidas.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstVendasBebidas.size();
                
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjVendasBebidas vendasBebidas = (JmjVendasBebidas) lstVendasBebidas.get( rowIndex);
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
