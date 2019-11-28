/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ko.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

/**
 *
 * @author Kudry
 */
public class ComboBoxRenderer implements ListCellRenderer<Color> {
    
    /**
     * Metodo que modifica los atributos de las celdas del combo box colores 
     * segun el valor seleccionado para su correcto dibujado y funcionamiento
     * @param list lista de colores del combo box
     * @param value valor acutal del combo box
     * @param index el index del valor actual del combo box
     * @param isSelected seleccionada o no la celda
     * @param cellHasFocus el raton esta encima o no d ela celda
     * @return 
     */
    @Override
    public Component getListCellRendererComponent(JList<? extends Color> list, Color value, int index, boolean isSelected, boolean cellHasFocus) {    
        JButton b = new JButton();        
        b.setPreferredSize(new Dimension(33,33));
        
        b.setBackground(value);
        
        if(isSelected){
            b.setBorder(new LineBorder(Color.gray, 3));
        }
               
        return b;
    }   
}
