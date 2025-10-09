/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_pesquisar;

import bean.JmjVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09208193110
 */
public class ControllerJmjVendas extends AbstractTableModel {
    
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
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjVendas jmj_vendas = (JmjVendas) lista.get(rowIndex);
        if (columnIndex == 0) {
            return jmj_vendas.getJmjIdVendas();
        } 
        
        if (columnIndex == 1) {
            return jmj_vendas.getJmjIdClientes();
        } 

        if (columnIndex == 2) {
            return jmj_vendas.getJmjDataVenda();
        }
        
        if (columnIndex == 3) {
            return jmj_vendas.getJmjSituacao();
        }
        
        if (columnIndex == 4) {
            return jmj_vendas.getJmjTotal();
        }
        
        if (columnIndex == 5) {
            return jmj_vendas.getJmjFormaPagamento();
        }
        
        if (columnIndex == 6) {
            return jmj_vendas.getJmjObservacao();
        }
        
        return "";
    }
    
    @Override
    public String getColumnName (int column) {
        if (column == 0){
            return "Código";
        }
        if (column == 1){
            return "Clientes";
        }
        if (column == 3){
            return "Data da Venda";
        }
        if (column == 4){
            return "Situação";
        }
        if (column == 5){
            return "Total";
        }
        if (column == 6){
            return "Forma de Pagamento";
        }
        if (column == 7){
            return "Observação";
        }
        return "";
    }
}
