/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.awt.image.BufferedImage;
import sm.ko.ui.Lienzo2DImagen;

/**
 *
 * @author Kudry
 */
public class VentanaInterna extends javax.swing.JInternalFrame {

    
    private final Frame FRAME;
    /**
     * Creates new form VentanaInternai
     */
    public VentanaInterna(int x, int y, String title, Frame FRAME) {
        super(title,true,true,true,true);
        initComponents();
        
        setLocation(x, y);
        this.FRAME = FRAME;
        
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Devuelve una captura del video reproducido o video recibido de la webcam
     * @return 
     */
    public BufferedImage getScreenShot(){
        return null;
    }
    
    /**
     * Devuelve el lienzo de la ventana interna imagen
     * @return 
     */
    public Lienzo2DImagen getLienzo() {
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
