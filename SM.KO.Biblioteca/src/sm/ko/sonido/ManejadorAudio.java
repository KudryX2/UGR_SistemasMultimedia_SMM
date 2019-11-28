/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ko.sonido;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.JButton;

/**
 *
 * @author Kudry
 */
public class ManejadorAudio implements LineListener{

    JButton botonPlay,botonPause;
    
    /**
     * Contructor del gestor de eventos de audio
     * @param botonPlay boton play
     * @param botonPause boton pause
     */
    public ManejadorAudio(JButton botonPlay, JButton botonPause){
        this.botonPlay = botonPlay;
        this.botonPause = botonPause;
    }
    
    /**
     * Activa o desactiva los botones play y stop según el evento recibido
     * @param event evento gestor de la reproduccion
     */
    @Override
    public void update(LineEvent event) {
        if(event.getType() == LineEvent.Type.START){
            botonPlay.setEnabled(false);
            botonPause.setEnabled(true);
        }
        if(event.getType() == LineEvent.Type.STOP){
            botonPlay.setEnabled(true);
            botonPause.setEnabled(false);
        }
    }
    
}
