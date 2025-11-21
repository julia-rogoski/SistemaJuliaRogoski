package view_pesquisar;

import bean.JmjVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ControllerJmjVendas extends AbstractTableModel {

    private List<JmjVendas> lstVendas;

    public void setList(List lstUsuarios) {
        this.lstVendas = lstUsuarios;
    }

    public JmjVendas getBean(int rowIndex) {
        return (JmjVendas) lstVendas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendas != null ? lstVendas.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjVendas usuarios = (JmjVendas) lstVendas.get(rowIndex);
        if (columnIndex == 0) {
            return usuarios.getJmjIdVendas();
        } else if (columnIndex == 1) {
            return usuarios.getJmjClientes();
        } else if (columnIndex == 2) {
            return usuarios.getJmjVendedor();
        } else if (columnIndex == 3) {
            return usuarios.getJmjDataVenda();
        }
        if (columnIndex == 4) {
            return usuarios.getJmjTotalVenda();
        }
        
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Vendas";
        } else if (columnIndex == 2) {
            return "Clientes";
        } else if (columnIndex == 3) {
            return "Vendedor";
        }
        if (columnIndex == 3) {
            return "Data da Venda";
        }
        return "";
    }
}
