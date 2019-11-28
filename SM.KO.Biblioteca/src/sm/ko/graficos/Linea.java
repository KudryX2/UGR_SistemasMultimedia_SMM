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
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
/**
 *
 * @author Kudry
 */
public class Linea extends MiShape{
    
    public Linea(Point position, Color color, BasicStroke grosor, Composite transparencia, RenderingHints alisado) {
        super(TipoForma.LINEA, position, color, grosor, transparencia, alisado);
    }
    
    @Override
    public void draw(Graphics2D g2d){
        setGraphicsParams(g2d);

        if(getPosition()!= null && getSize() != null){
            g2d.drawLine(getPosition().x, getPosition().y, getPosition().x+getSize().x, getPosition().y+getSize().y);
        }   
        
    }
    
    @Override
    public boolean contains(Point2D p){
        if(getSize() != null){
            Line2D line = new Line2D.Float(getPosition(),new Point(getPosition().x+getSize().x, getPosition().y+getSize().y));
            return line.ptLineDist(p)<=2.0;
        }
        return false;
    }
    
    @Override
    public void setSize(Point p){
        if(getPosition() != null)
            super.setSize(new Point((int)(p.getX()-getPosition().x), (int)(p.getY()-getPosition().y)));
    }
    
    @Override
    public void moveTo(Point2D p){
        int x = (int) p.getX();
        int y = (int) p.getY();
        
        if(x < x + getSize().x){
            x -= getOffsetX();
        }else{
            x += getOffsetX();
        }
        
        if(y < y + getSize().y){
            y -= getOffsetY();
        }else{
            y += getOffsetY();
        }
        
        setPosition(new Point(x,y));
    }
        
 
}
