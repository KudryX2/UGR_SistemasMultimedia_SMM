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
import java.util.ArrayList;

/**
 *
 * @author Kudry
 */
public class Libre extends MiShape{
    
    private ArrayList<Punto> vPuntos;
    
    /**
     * Contructor de la figura de trazo libre, recibe como parametros las 
     * carateristicas del trazo 
     * @param color color
     * @param grosor grosor
     * @param transparencia transparencia
     * @param alisado alisado
     */
    public Libre(Color color, BasicStroke grosor, Composite transparencia, RenderingHints alisado) {
        super(TipoForma.LIBRE, null, color, grosor, transparencia, alisado);
    
        vPuntos = new ArrayList();
    }
    
    /**
     * Dibuja el vector de puntos que forma el trazo 
     * @param g2d renerer
     */
    @Override
    public void draw(Graphics2D g2d){
        setGraphicsParams(g2d);
        
        for(Punto p : vPuntos){
            p.draw(g2d);
        }
        
    }
    
    /**
     * Actualiza el tamaño de la figura, pero en el caso de esta figura, añade
     * un punto nuevo al vector de puntos en la posicion recibida
     * @param p posicion del punto
     */
    @Override
    public void setSize(Point p){
        vPuntos.add(new Punto(p));
    }
    
    /**
     * Recorre el vector de puntos y comprueba si el punto proporcinado 
     * colsiona con elguno de ellos
     * @param p posicion a comprobar
     * @return resultado de la comprobacion
     */
    @Override
    public boolean contains(Point2D p){
        boolean result = false;
        
        for(Punto point : vPuntos){
            if(point.contains(p)){
                result = true;
            }
        }
        
        return result;
    }
    
    /**
     * Corrige la posicion de la figura
     */
    @Override
    public void fixPosition(){
        int x = vPuntos.get(0).getPosition().x,
            y = vPuntos.get(0).getPosition().y,
            w = vPuntos.get(0).getSize().x,
            h = vPuntos.get(0).getSize().y;
        
        for(Punto p : vPuntos){
            if(p.getPosition().x < x){
                x = p.getPosition().x;
            }
            
            if(p.getPosition().y < y){
                y = p.getPosition().y;
            }
            
            if(p.getPosition().x + p.getSize().x  > w){
                w = p.getPosition().x + p.getSize().x;
            }
            
            if(p.getPosition().y + p.getSize().y  > h){
                h = p.getPosition().y + p.getSize().y;
            }
        }
        
        super.setPosition(new Point(x,y));
        super.setSize(new Point(w-x,h-y));
    }

    /**
     * Mueve la figura a la posicion proporcionada
     * @param p posicion nueva
     */
    @Override
    public void moveTo(Point2D p){

        for(Punto point : vPuntos){
            point.setPosition(new Point((int)(point.getPosition().x+(p.getX()-this.getPosition().x)-getOffsetX()),
                                        (int)(point.getPosition().y+(p.getY()-this.getPosition().y)-getOffsetY()) ));
        }
        fixPosition();
    }
    
    
    
}
