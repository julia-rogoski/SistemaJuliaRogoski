/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_pesquisar;

import bean.JmjUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerJmjConsultasUsuarios extends AbstractTableModel {

    private List lstUsuarios;

    public void setList(List lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstUsuarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjUsuarios jmjUsuarios = (JmjUsuarios) lstUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return jmjUsuarios.getJmjIdUsuarios();
        } else if (columnIndex ==1) {
            return jmjUsuarios.getJmjNome();        
        } else if (columnIndex ==2) {
            return jmjUsuarios.getJmjCpf();
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
            return "Cpf";
        }
        return "";
    }
}
