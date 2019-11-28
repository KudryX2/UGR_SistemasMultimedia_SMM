/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ko.sonido;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Kudry
 */
public class ManejadorGrabador implements LineListener{
    JButton botonGrabar;
    ImageIcon record,stopRecord;
    
    /**
     * Contructor para el gestor de eventos del grabador de audio
     * @param botonGrabar boton grabar
     */
    public ManejadorGrabador(JButton botonGrabar){
        this.botonGrabar = botonGrabar;
        record = new ImageIcon("./botones/record24x24.png");
        stopRecord = new ImageIcon("./botones/stopRecord24x24.png");
    }
    
    /**
     * Llamado en caso de actualizarse el estado de la grabacion
     * @param event evento de cambio de estado de la grabacion
     */
    @Override
    public void update(LineEvent event) {
        if(event.getType() == LineEvent.Type.START){
        //    botonGrabar.setIcon(record);
        }
        if(event.getType() == LineEvent.Type.STOP){
        //    botonGrabar.setIcon(stopRecord);
        }
    }
}
