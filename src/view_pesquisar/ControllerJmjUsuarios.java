package view_pesquisar;

import bean.JmjUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ControllerJmjUsuarios extends AbstractTableModel {

    private List<JmjUsuarios> lstUsuarios;

    public void setList(List lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }

    public JmjUsuarios getBean(int rowIndex) {
        return (JmjUsuarios) lstUsuarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstUsuarios != null ? lstUsuarios.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjUsuarios usuarios = (JmjUsuarios) lstUsuarios.get(rowIndex);
        if (columnIndex == 0) {
            return usuarios.getJmjIdUsuarios();
        } else if (columnIndex == 1) {
            return usuarios.getJmjNome();
        } else if (columnIndex == 2) {
            return usuarios.getJmjApelido();
        } else if (columnIndex == 3) {
            return usuarios.getJmjCpf();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Nome";
        } else if (columnIndex == 2) {
            return "Apelido";
        } else if (columnIndex == 3) {
            return "Cpf";
        }
        return "";
    }
}
