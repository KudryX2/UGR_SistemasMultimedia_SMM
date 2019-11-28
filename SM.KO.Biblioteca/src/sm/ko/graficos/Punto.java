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
public class Punto extends MiShape{
    
    /**
     * Contructor para un objeto punto que recibe las caracteristicas de la
     * figura
     * @param position posicion
     * @param color color
     * @param grosor grosor
     * @param transparencia transparencia
     * @param alisado alisado
     */
    public Punto(Point position, Color color, BasicStroke grosor, Composite transparencia, RenderingHints alisado) {
        super(TipoForma.PUNTO, new Point(position.x-2, position.y-2), color, grosor, transparencia, alisado);
        setSize(new Point(4,4));
    }
    
    /**
     * Contructor para un objeto punto sin caracteristicas, se usa para contruir
     * el objeto "Libre" necesario para el trazo libre en el lienzo
     * @param position posicion del punto
     */
    public Punto(Point position){
        super(TipoForma.PUNTO, new Point(position.x-2, position.y-2), null, null, null, null);
        setSize(new Point(4,4));
    }
    
    /**
     * Metodo para dibujar la figura
     * @param g2d renderer
     */
    @Override
    public void draw(Graphics2D g2d){
        setGraphicsParams(g2d);
        g2d.fillOval(super.getPosition().x, super.getPosition().y, getSize().x, getSize().y);
    }
    
    /**
     * Metodo que devuelve si la figura contiene o no el punto proporcionado
     * @param p punto a comprobar
     * @return resultado de la comprobacion
     */
    @Override
    public boolean contains(Point2D p){
        return Math.sqrt(Math.pow(getPosition().x + getSize().x/2 - p.getX(), 2)+ Math.pow(getPosition().y + getSize().y/2 - p.getY(), 2)) < 3;
    }
    
    /**
     * Mueve la figura a la posicion dada
     * @param p posicion nueva
     */
    @Override
    public void moveTo(Point2D p){
        setPosition((Point) p);
    }
}
