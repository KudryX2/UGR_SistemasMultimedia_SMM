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
import java.awt.geom.Point2D;
/**
 *
 * @author Kudry
 */
public class Elipse extends MiShape{

    public boolean relleno;
    
    /**
     * Contructor de la figura elipse, recibe como parametros las 
     * caracteristicas de la figura y la posicion donde se se encuentra.
     * @param position1 posicion
     * @param color color
     * @param grosor grosor
     * @param transparencia transparencia
     * @param alisado alisado
     * @param relleno relleno
     */
    public Elipse(Point position1, Color color, BasicStroke grosor, Composite transparencia, RenderingHints alisado, Boolean relleno) {
        super(TipoForma.ELIPSE, position1, color, grosor, transparencia, alisado);
        this.relleno = relleno;
    }
    
    /**
     * Metodo para dibujar la figura
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
                    g2d.fillOval(x,y,w,h);
                }else{
                    g2d.drawOval(x,y,w,h);
                }
            }
                
        }else{
            
            if(relleno){
                g2d.fillOval(getPosition().x, getPosition().y, getSize().x, getSize().y);
            }else{
                g2d.drawOval(getPosition().x, getPosition().y, getSize().x, getSize().y);
            }

        }
 
    }
  
    /**
     * Metodo para corregir la posición de la digura para su correcto dibujado
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
     * Metodo que calcula si un punto esta dentro o no de la digura
     * @param p posicion a comprobar
     * @return resultado de la comprobacion
     */
    @Override
    public boolean contains(Point2D p){        
        return (Math.pow(p.getX() - getPosition().x - getSize().x/2, 2) / Math.pow(getSize().x/2, 2) +
                Math.pow(p.getY() - getPosition().y - getSize().y/2, 2) / Math.pow(getSize().y/2, 2)) < 1;
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
