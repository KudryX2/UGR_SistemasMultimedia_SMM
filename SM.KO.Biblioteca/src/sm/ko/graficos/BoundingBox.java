/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ko.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
/**
 *
 * @author Kudry
 */
public class BoundingBox extends MiShape{
    
    /**
     * Contructor de la bounding box, forma especifica para señalizar las formas
     * seleccionadas por el usuario 
     */
    public BoundingBox(){
        super(TipoForma.RECTANGULO, null, Color.black, null, null, null);
        
        float dash1[] = {5.0f};
        setGrosor(new BasicStroke(1.0f,
                        BasicStroke.CAP_BUTT,
                        BasicStroke.JOIN_MITER,
                        5.0f, dash1, 0.0f));
        
    }
    
    /**
     * Se actualiza la posicion de la bounding box en funcion de la posicion de 
     * la forma seleccionada por el usuario al editar las formas
     * @param forma forma seleccionada
     */
    public void setPosition(MiShape forma) {
        
        int x = forma.getPosition().x;
        int y = forma.getPosition().y;
        
        int sx = Math.abs(forma.getSize().x);
        int sy = Math.abs(forma.getSize().y);
        
        if(forma.getSize().x < 0){
            x += forma.getSize().x;
        }
        
        if(forma.getSize().y < 0){
            y += forma.getSize().y;
        }
        
        setPosition(new Point(x,y)); 
        setSize(new Point(sx,sy));
    }
    
    /**
     * Funcion que dibuja la bounding box
     * @param g2d renderer
     */
    @Override
    public void draw(Graphics2D g2d){
        
        if((super.getSize() != null) && (super.getPosition() != null)){
            setGraphicsParams(g2d);
            g2d.setStroke(getStroke());
            g2d.drawRect(getPosition().x-5, getPosition().y-5, getSize().x+10, getSize().y+10);
        }
    }
    
}
