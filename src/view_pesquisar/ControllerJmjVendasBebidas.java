/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_pesquisar;

import bean.JmjVendasBebidas;
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
        PedidosProdutos pedidosProdutos = (PedidosProdutos) lstPedidosProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return pedidosProdutos.getProdutos().getIdprodutos();
        } else if (columnIndex ==1) {
            return pedidosProdutos.getProdutos().getNome();        
        } else if (columnIndex ==2) {
            return pedidosProdutos.getQuantidade();
        } else if (columnIndex ==3) {
            return pedidosProdutos.getValorUnitario();
        } else if (columnIndex ==4) {
            return pedidosProdutos.getQuantidade() * pedidosProdutos.getValorUnitario();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Produto";         
        } else if ( columnIndex == 2) {
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Valor Unitário";
        } else if ( columnIndex == 4) {
            return "Total";
        } 
        return "";
    }
    
}
