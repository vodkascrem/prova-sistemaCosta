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
 * @author vodka
 */
public class Util {
    public static void habilitar(boolean ver, JComponent...comp) {
        for(int i = 0; i < comp.length;i++){
        comp[i].setEnabled(ver);
        }
    }
    public static void limpar(JComponent ... comp) {
        for(int i = 0; i < comp.length; i++){
         if(comp[i] instanceof JTextField){
        ((JTextField) comp[i]).setText("");
         }
         if(comp[i] instanceof JComboBox){
        ((JComboBox)comp[i]).setSelectedIndex(-1);}
         
         if(comp[i] instanceof JCheckBox){
        ((JCheckBox)comp[i]).setSelected(false);}
        }
       
    }
    
   public static int strToInt(String cad) {
        return Integer.valueOf(cad);
   }
    
   public static String intToString(int num) {
        return String.valueOf(num);
    }
   
   public static double strtoDouble(String cad){
        return Double.valueOf(cad);
   }
   
   public static String doubleToString(double num){
       return String.valueOf(num);
   }
   
   public static String dateTostring (Date date) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        return formato.format(date);
   }
   
   public static Date stringTodate (String cad) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date resp = null;
        try  {
            resp = formato.parse(cad);
        } catch (ParseException ex) {
            return null;
        }
        return resp;
   }
   
   public static boolean perguntar (String pergunta){
       return JOptionPane.showConfirmDialog(null, pergunta, "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
   }
   
   public static void mensagem(String msg){
       JOptionPane.showMessageDialog(null, msg);
   }
   
   
}