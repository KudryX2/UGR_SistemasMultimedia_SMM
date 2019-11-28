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
public class Curva extends MiShape{
    
    private Linea linea1,linea2;
    int step;
    
    /**
     * Contructor de la clase Curva, recibe los atributos de la forma y
     * la posicion donde empieza la forma.
     * @param position posición del comienzo
     * @param color color de la forma
     * @param grosor grosor de la forma
     * @param transparencia transparencia de la forma
     * @param alisado alisado de la forma
     */
    public Curva(Point position, Color color, BasicStroke grosor, Composite transparencia, RenderingHints alisado) {
        super(TipoForma.CURVA, position, color, grosor, transparencia, alisado);
        
        step = 0;
        
        linea1 = new Linea(position, color, grosor, transparencia, alisado);
        linea2 = new Linea(null, color, grosor, transparencia, alisado);
    }
    
    /**
     * Metodo para dibujar la forma
     * @param g2d renderer
     */
    @Override
    public void draw(Graphics2D g2d){
        setGraphicsParams(g2d);

        linea1.draw(g2d);
        linea2.draw(g2d);
        
    }
    
    /**
     * Metodo para actualizar la posición de la forma usando la posicion dada
     * @param p nueva posicion
     */
    @Override
    public void setSize(Point p){
        if(p != null){
            if(step == 0){
                linea1.setSize(p);
                linea2.setPosition(p);
            }else if(step == 1){
                linea2.setSize(p);
            }
        }
    }
    
    /**
     * Incrementa paso de dibujado de la forma, necesario para saber si hemos 
     * seleccionado o no el punto de control.
     */
    @Override
    public void increaseStep(){
        step++;
    }
    
    /**
     * Devuelve el paso actual de dibujado de la forma
     * @return paso de dibujado
     */
    @Override 
    public int getStep(){
        return step;
    }
    
    /**
     * Calcula y devuelve el resultado dependiendo si el punto proporcionado 
     * colisiona o no con la forma
     * @param p punto a comprobar
     * @return colisiona o no con el punto
     */
    @Override
    public boolean contains(Point2D p){
        return linea1.contains(p) || linea2.contains(p);
    }
    
    /**
     * Establece la posicion de la figura de la forma que al crear
     * un bounding box pueda coger estos datos correctamente. 
     */
    @Override
    public void fixPosition(){
        
        if(linea1.getPosition() != null && linea1.getSize() != null &&
           linea2.getPosition() != null && linea2.getSize() != null ){

            linea1.fixPosition();
            
            linea2.fixPosition();
            
            int x,y,w,h,
                xp,yp,xs,ys;

            xp = Math.min(linea1.getPosition().x, linea2.getPosition().x);
            yp = Math.min(linea1.getPosition().y, linea2.getPosition().y);

            xs = Math.min(linea1.getPosition().x+linea1.getSize().x, linea2.getPosition().x+linea2.getSize().x);
            ys = Math.min(linea1.getPosition().y+linea1.getSize().y, linea2.getPosition().y+linea2.getSize().y);

            x = Math.min(xp, xs);
            y = Math.min(yp, ys);

            super.setPosition(new Point(x,y));
            
            int wp = Math.max(linea1.getPosition().x, linea2.getPosition().x);
            int hp = Math.max(linea1.getPosition().y, linea2.getPosition().y);

            int ws = Math.max(linea1.getPosition().x+linea1.getSize().x, linea2.getPosition().x+linea2.getSize().x);
            int hs = Math.max(linea1.getPosition().y+linea1.getSize().y, linea2.getPosition().y+linea2.getSize().y);
            
            
            w = Math.max(wp, ws);
            h = Math.max(hp, hs);
            
            w = w - getPosition().x;
            h = h - getPosition().y;
            
            super.setSize(new Point(w,h));
        }
        
        
        
    }
    
    /**
     * Mueve la figura a la posicion proporcionada
     * @param p posicion nueva
     */
    @Override
    public void moveTo(Point2D p){
  
        linea1.setPosition(new Point((int)p.getX(), (int)p.getY()));
        linea2.setPosition(new Point((int)p.getX()+linea1.getSize().x, (int)p.getY()+linea1.getSize().y));
        
        fixPosition();
    }
    
    
    /**
     * Actualiza el color de la figura
     * @param color color nuevo
     */
    @Override
    public void setColor(Color color){
        linea1.setColor(color);
        linea2.setColor(color);
    }
    
    /**
     * Actualiza el grosor de la figura
     * @param grosor grosor nuevo
     */
    @Override
    public void setGrosor(BasicStroke grosor){
        linea1.setGrosor(grosor);
        linea2.setGrosor(grosor);
    }
    
    /**
     * Actualiza el alizado de la figura
     * @param alisado alisado nuevo
     */
    @Override
    public void setAlisado(RenderingHints alisado){
        linea1.setAlisado(alisado);
        linea2.setAlisado(alisado);
    }

}


