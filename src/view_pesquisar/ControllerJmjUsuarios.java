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
 * @author u09208193110
 */
public class ControllerJmjUsuarios extends AbstractTableModel {
    
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
        JmjUsuarios jmj_usuarios = (JmjUsuarios) lista.get(rowIndex);
        if (columnIndex == 0) {
            return jmj_usuarios.getJmjIdUsuarios();
        } 
        
        if (columnIndex == 1) {
            return jmj_usuarios.getJmjNome();
        } 
        
        if (columnIndex == 2) {
            return jmj_usuarios.getJmjApelido();
        } 
        
        if (columnIndex == 3) {
            return jmj_usuarios.getJmjCpf();
        }
        
        if (columnIndex == 4) {
            return jmj_usuarios.getJmjDataNascimento();
        }
        
        if (columnIndex == 5) {
            return jmj_usuarios.getJmjSenha();
        }
        
        if (columnIndex == 6) {
            return jmj_usuarios.getJmjNivel();
        }
        
        if (columnIndex == 7) {
            return jmj_usuarios.getJmjAtivo();
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
            return "Apelido";
        }
        if (column == 3){
            return "Cpf";
        }
        if (column == 4){
            return "Data Nascimento";
        }
        if (column == 5){
            return "Senha";
        }
        if (column == 6){
            return "Nivel";
        }
        if (column == 7){ 
            return "Ativo";
        }
        return "";
    }
}
