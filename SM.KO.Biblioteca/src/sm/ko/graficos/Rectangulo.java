/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ko.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
/**
 *
 * @author Kudry
 */
public class Rectangulo extends MiShape{
    
    private boolean relleno;
       
    /**
     * Constructor para un objeto de clase Rectangulo que recibe los atributos 
     * de la figura y la posicion donde se quiera ubicar
     * @param position posicion
     * @param color color
     * @param grosor grosor
     * @param transparencia transparencia
     * @param alisado alisado
     * @param relleno relleno
     */
    public Rectangulo(Point position, Color color, BasicStroke grosor, Composite transparencia, RenderingHints alisado, Boolean relleno) {
        super(TipoForma.RECTANGULO, position, color, grosor, transparencia, alisado);
        this.relleno = relleno;
    }
    
    /**
     * Metodo que dibuja la digura
     * @param g2d renderer
     */
    @Override
    public void draw(Graphics2D g2d){
        
        setGraphicsParams(g2d);
        
        if(!getFixedPosition()){
            if((getSize() != null) && (getPosition() != null)){
        
                int x = Math.min(getSize().x, getPosition().x);
                int y = Math.min(getSize().y, getPosition().y);
                
                int w = Math.abs(getPosition().x - getSize().x);
                int h = Math.abs(getPosition().y - getSize().y);       

                if(relleno){
                    g2d.fillRect(x,y,w,h);
                }else{
                    g2d.drawRect(x,y,w,h);
                }
            }
                
        }else{
            
            if(relleno){
                g2d.fillRect(getPosition().x, getPosition().y, getSize().x, getSize().y);
            }else{
                g2d.drawRect(getPosition().x, getPosition().y, getSize().x, getSize().y);
            }

        }

    }
    
    /**
     * Corrige la posicion de la figura para su correcta visualizacion
     */
    @Override
    public void fixPosition(){
        
        if(getSize() != null){
            int x = Math.min(getSize().x, getPosition().x);
            int y = Math.min(getSize().y, getPosition().y);

            int w = Math.abs(getPosition().x - getSize().x);
            int h = Math.abs(getPosition().y - getSize().y);       

            setPosition(new Point(x,y));
            setSize(new Point(w,h));

            setFixedTrue();
        }
    }
    
    /**
     * Actualiza el relleno de la figura
     * @param relleno relleno nuevo
     */
    @Override
    public void setRelleno(boolean relleno){
        this.relleno = relleno;
    }
    
    
}
