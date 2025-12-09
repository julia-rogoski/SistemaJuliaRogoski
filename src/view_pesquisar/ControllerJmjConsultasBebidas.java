/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_pesquisar;

import bean.JmjBebidas;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerJmjConsultasBebidas extends AbstractTableModel {

    private List lstProdutos;

    public void setList(List lstProdutos) {
        this.lstProdutos = lstProdutos;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstProdutos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjBebidas jmjBebidas = (JmjBebidas) lstProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return jmjBebidas.getJmjIdBebidas();
        } else if (columnIndex ==1) {
            return jmjBebidas.getJmjNome();        
        } else if (columnIndex ==2) {
            return jmjBebidas.getJmjPreco();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "nome";         
        } else if ( columnIndex == 2) {
            return "Valor Unitário";
        }
        return "";
    }
}
