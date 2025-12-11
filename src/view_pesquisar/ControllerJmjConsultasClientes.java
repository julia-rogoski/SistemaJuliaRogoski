/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_pesquisar;

import bean.JmjBebidas;
import bean.JmjClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerJmjConsultasClientes extends AbstractTableModel {

    private List lstClientes;

    public void setList(List lstClientes) {
        this.lstClientes = lstClientes;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstClientes.size();
                
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjClientes jmjClientes = (JmjClientes) lstClientes.get( rowIndex);
        if ( columnIndex == 0 ){
            return jmjClientes.getJmjIdClientes();
        } else if (columnIndex ==1) {
            return jmjClientes.getJmjNome();        
        } else if (columnIndex ==2) {
            return jmjClientes.getJmjDataNascimento();
        } else if (columnIndex ==3) {
            return jmjClientes.getJmjCidade();
        } else if (columnIndex ==4) {
            return jmjClientes.getJmjAtivo();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Data de Nascimento";
        } else if ( columnIndex == 3) {
            return "Cidade";
        } else if ( columnIndex == 4) {
            return "Ativo";
        }
        return "";
    }
}
