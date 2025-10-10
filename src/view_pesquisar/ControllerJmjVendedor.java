/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_pesquisar;

import bean.JmjVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09208193110
 */
public class ControllerJmjVendedor extends AbstractTableModel {
    
    List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public Object getBean(int rowIndex) {
        return lista.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 13;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjVendedor jmj_vendedor = (JmjVendedor) lista.get(rowIndex);
        if (columnIndex == 0) {
            return jmj_vendedor.getJmjIdVendedor();
        } 
        
        if (columnIndex == 1) {
            return jmj_vendedor.getJmjNome();
        } 
        
        if (columnIndex == 2) {
            return jmj_vendedor.getJmjCpf();
        } 
        
        if (columnIndex == 3) {
            return jmj_vendedor.getJmjEmail();
        }
        
        if (columnIndex == 4) {
            return jmj_vendedor.getJmjTelefone();
        }
        
        if (columnIndex == 5) {
            return jmj_vendedor.getJmjCelular();
        }       

        if (columnIndex == 6) {
            return jmj_vendedor.getJmjAtivo();
        }
        
        return "";
    }
    
    @Override
    public String getColumnName (int column) {
        if (column == 0){
            return "Código";
        }
        if (column == 1){ 
            return "Nome";
        }
        if (column == 2){
            return "Cpf";
        }
        if (column == 3){
            return "Email";
        }
        if (column == 4){
            return "Telefone";
        }
        if (column == 5){
            return "Celular";
        }
        if (column == 6){
            return "Ativo";
        }
        return "";
    }
}
