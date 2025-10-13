/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_pesquisar;

import bean.JmjClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09208193110
 */
public class ControllerJmjClientes extends AbstractTableModel {
    
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
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmjClientes jmj_clientes = (JmjClientes) lista.get(rowIndex);
        if (columnIndex == 0) {
            return jmj_clientes.getJmjIdClientes();
        } 
        
        if (columnIndex == 1) {
            return jmj_clientes.getJmjNome();
        } 
        
        if (columnIndex == 2) {
            return jmj_clientes.getJmjCpf();
        } 
        
        if (columnIndex == 3) {
            return jmj_clientes.getJmjRg();
        }
        
        if (columnIndex == 4) {
            return jmj_clientes.getJmjSexo();
        }
        
        if (columnIndex == 5) {
            return jmj_clientes.getJmjDataNascimento();
        }
        
        if (columnIndex == 6) {
            return jmj_clientes.getJmjEmail();
        }
        
        if (columnIndex == 7) {
            return jmj_clientes.getJmjTelefone();
        }
        
        if (columnIndex == 8) {
            return jmj_clientes.getJmjCelular();
        }
        
        if (columnIndex == 9) {
            return jmj_clientes.getJmjCep();
        }
        
        if (columnIndex == 10) {
            return jmj_clientes.getJmjBairro();
        }
        
        if (columnIndex == 11) {
            return jmj_clientes.getJmjEndereco();
        }
        
        if (columnIndex == 12) {
            return jmj_clientes.getJmjCidade();
        }
        
        if (columnIndex == 13) {
            return jmj_clientes.getJmjUf();
        }
        
        if (columnIndex == 14) {
            return jmj_clientes.getJmjDataCadastro();
        }
        
        if (columnIndex == 15) {
            return jmj_clientes.getJmjAtivo();
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
            return "Sexo";
        }
        if (column == 3){
            return "Cpf";
        }
        if (column == 4){
            return "Data Nascimento";
        }
        if (column == 5){
            return "Rg";
        }
        if (column == 6){
            return "Senha";
        }
        if (column == 7){
            return "Email";
        }
        if (column == 8){
            return "Telefone";
        }
        if (column == 9){
            return "Celular";
        }
        if (column == 10){
            return "Cep";
        }
        if (column == 11){
            return "Endereco";
        }
        if (column == 12){
            return "Bairro";
        }
        if (column == 13){
            return "Cidade";
        }
        if (column == 14){
            return "Uf";
        }
        if (column == 15){
            return "Data de Cadastro";
        }
        if (column == 16){
            return "Ativo";
        }
        return "";
    }
}

