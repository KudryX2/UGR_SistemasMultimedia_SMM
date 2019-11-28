/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerEventAdapter;

/**
 *
 * @author Kudry
 */
class VideoListener extends MediaPlayerEventAdapter {
    
    @Override
    public void finished(MediaPlayer mediaPlayer) {
        System.out.println("finished");
    }
    
}
