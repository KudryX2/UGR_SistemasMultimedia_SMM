/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ko.imagen;

import java.awt.Color;
import java.awt.image.BufferedImage;
import sm.image.BufferedImageOpAdapter;

/**
 *
 * @author Kudry
 */
public class SepiaOp extends BufferedImageOpAdapter{

    /**
     * Crea un objeto de la clase sepia
     */
    public SepiaOp(){
        
    }
    
    /**
     * Aplica la operacion sepia a una imagen recibida en el atributo src y 
     * devuelve el resultado de la operacion sea en la imagen del atributo dest 
     * o como devolucion de la funcion
     * @param src imagen fuente
     * @param dest imagen destino
     * @return resultado
     */
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if(src == null){
            throw new NullPointerException("src image is null");
        }
        if(dest == null){
            dest = createCompatibleDestImage(src,null);
        }  
       
        Color colorSrc,colorDest;
        int sepiaR,sepiaG,sepiaB,r,g,b;
        for(int x = 0 ; x < src.getWidth() ; ++x){
            for(int y = 0 ; y < src.getHeight() ; ++y){
                colorSrc = new Color(src.getRGB(x, y));
                
                r = colorSrc.getRed();
                g = colorSrc.getGreen();
                b = colorSrc.getBlue();
                
                sepiaR = (int)Math.min(255, 0.393*r + 0.769*g + 0.189*b);
                sepiaG = (int)Math.min(255, 0.349*r + 0.686*g + 0.168*b);
                sepiaB = (int)Math.min(255, 0.272*r + 0.534*g + 0.131*b);
                
                colorDest = new Color(sepiaR,sepiaG,sepiaB);
                dest.setRGB(x, y, colorDest.getRGB());
            }
        }
        
        return dest;
    }
    
}
