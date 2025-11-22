/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Jmj_Util {

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

    public static int strToInt(String str) {
        return Integer.valueOf(str);
    }

    public static double strToDouble(String str) {
        return Double.valueOf(str);
    }

    public static Date strToDate(String str) {
        SimpleDateFormat dateNascFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateNascFormat.parse(str);
        } catch (ParseException ex) {
            Logger.getLogger(Jmj_Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static String doubleToStr(double num) {
        return String.valueOf(num);
    }

    public static String dateToStr(Date num) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(num);
    }
}
