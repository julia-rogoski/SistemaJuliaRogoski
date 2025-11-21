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
 * @author u09208193110
 */
public class ControllerJmjBebidas extends AbstractTableModel {
    
    private static boolean Novo(String valor) {
        if (valor == null) {
            return false;
        }
        valor = valor.trim().toLowerCase();
        return valor.equals("1") || valor.equals("true") || valor.equals("Sim") || valor.equals("S");
    }

    
    private List<JmjBebidas> lstBebidas;
    
    public void setList(List lista) {
        this.lstBebidas = lista;
    }
    
    public Object getBean(int rowIndex) {
        return lstBebidas.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lstBebidas != null ? lstBebidas.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjBebidas jmj_bebidas = (JmjBebidas) lstBebidas.get(rowIndex);
        if (columnIndex == 0) {
            return jmj_bebidas.getJmjIdBebidas();
        } 
        
        if (columnIndex == 1) {
            return jmj_bebidas.getJmjNome();
        } 
        
        if (columnIndex == 2) {
            return jmj_bebidas.getJmjTipo();
        } 
        
        if (columnIndex == 3) {
            return jmj_bebidas.getJmjPreco();
        }
        
        if (columnIndex == 4) {
            return jmj_bebidas.getJmjFabricante();
        }
        
        if (columnIndex == 5) {
            return jmj_bebidas.getJmjTeorAlcoolico();
        }
        
        if (columnIndex == 6) {
            return jmj_bebidas.getJmjVolumeMl();
        }
        
        if (columnIndex == 7) {
            return jmj_bebidas.getJmjAtivo();
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
            return "Tipo";
        }
        if (column == 3){
            return "Preco";
        }
        if (column == 4){
            return "Fabricante";
        }
        if (column == 5){
            return "Teor de Alcool";
        }
        if (column == 6){
            return "Volume em ml";
        }
        if (column == 7){
            return "Ativo";
        }
        return "";
    }
}
