/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 *
 * @author u06716483144
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);

        }
    }

    public static void limpar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            if ((componentes[i]) instanceof JTextField) {
                ((JTextField) componentes[i]).setText("");
            } else if ((componentes[i]) instanceof JComboBox) {
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            } else if ((componentes[i]) instanceof JCheckBox) {
                ((JCheckBox) componentes[i]).setSelected(false);
            }

        }
    }

    public static boolean confirmar(String msg) {
        return JOptionPane.showConfirmDialog(null, msg, "confirmar", JOptionPane.YES_NO_OPTION) == 0;
    }

    public static boolean perguntar(String mes) {
        int resp = JOptionPane.showConfirmDialog(null, mes,
                "Perguntar", JOptionPane.YES_NO_OPTION);
        return resp == JOptionPane.YES_NO_OPTION;
    }
}
