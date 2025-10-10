package view_pesquisar;

import bean.JmjVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ControllerJmjVendas extends AbstractTableModel {

    private List<JmjVendas> lista;

    public void setList(List<JmjVendas> lista) {
        this.lista = lista;
    }

    public JmjVendas getBean(int rowIndex) {
        return lista.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        if (lista == null) {
            return 0;
        }
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjVendas jmjVendas = lista.get(rowIndex);

        if (columnIndex == 0) {
            return jmjVendas.getJmjIdVendas();
        }
        if (columnIndex == 1) {
            return jmjVendas.getJmjClientesByJmjFkClientes();
        }
        if (columnIndex == 2) {
            return jmjVendas.getJmjDataVenda();
        }
        if (columnIndex == 3) {
            return jmjVendas.getJmjClientesByJmjFkVendedor();
        }

        return "";
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        }
        if (column == 1) {
            return "Cliente";
        }
        if (column == 2) {
            return "Data da Venda";
        }
        if (column == 3) {
            return "Vendedor";
        }
        return "";
    }
}
