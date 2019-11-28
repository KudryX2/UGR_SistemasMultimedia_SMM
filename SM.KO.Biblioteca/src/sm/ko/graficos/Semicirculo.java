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
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Kudry
 */
public class Semicirculo extends MiShape{
    
    private Shape elipse,rectangulo;
    private Area areaElipse = null,
                 areaRectangulo = null;
    
    private float elipseX, elipseY, elipseW, elipseH, 
          rectanguloX, rectanguloY;
    private boolean posRelativa;
      
    private boolean relleno;
    
    /**
     * Contructor de la clase Semicirculo, recibe los atributos asigandos a la 
     * figura y la posicion donde se quiera ubicar
     * @param position posicion
     * @param color color
     * @param grosor grosor
     * @param transparencia transparencia
     * @param alisado alisado
     * @param relleno relleno
     */
    public Semicirculo(Point position, Color color, BasicStroke grosor, Composite transparencia, RenderingHints alisado, boolean relleno) {
        super(TipoForma.SEMICIRCULO, position, color, grosor, transparencia, alisado);
        
        this.relleno = relleno;
    }
    
    /**
     * Metodo para dibujar la figura
     * @param g2d renderer
     */
    @Override
    public void draw(Graphics2D g2d){
        
        if(areaElipse != null){
            
            setGraphicsParams(g2d);
            
            System.out.println(relleno);
            
            if(relleno){
                g2d.fill(areaElipse);
            }else{
                g2d.draw(areaElipse);
            }

        }
        
    }
    
    /**
     * Metodo para actualizar el tamaño de la figura, calcula la posicion y el
     * tamaño de los dos componentes de la figura y llama al metodo que genera
     * el area que se visualiza para el usuario
     * @param point posicion a convertir en tamaño
     */
    @Override
    public void setSize(Point point){
        super.setSize(new Point(point.x - getPosition().x, point.y - getPosition().y));
        
        elipseX = getPosition().x;
        elipseY = getPosition().y;
        elipseW = point.x - elipseX;
        elipseH = 2*(point.y - elipseY);
            
        rectanguloX = elipseX;
        rectanguloY = elipseY+getSize().y; 
        
        if(point.x <= getPosition().x){
            elipseX = point.x;
            elipseW = getPosition().x - point.x;
            rectanguloX = elipseX;
        }
        
        if(point.y <= getPosition().y){
            elipseY = point.y+getSize().y;
            elipseH = 2*(getPosition().y - point.y);
            rectanguloY = getPosition().y+getSize().y*3;
        }      
              
        generarShape();
    }
    
    /**
     * Comprueba si un punto etsa dentro de la figura o no
     * @param p punto a comprobar
     * @return resultado de la comprobacion
     */
    @Override
    public boolean contains(Point2D p){
        return (elipse.contains(p) && !rectangulo.contains(p));
    }
    
    /**
     * Corrige la posicion de los componentes de la digura y llama al metodo
     * que vuelve a generar el area buscada
     */
    @Override
    public void fixPosition(){  
        
        int boundingY = (int) elipseY;
        
        if(elipseY > rectanguloY){
            posRelativa = true;
            boundingY += getSize().y;
        }else{
            posRelativa = false;
        }   
        
        super.setPosition(new Point((int)elipseX,(int)boundingY));
        super.setSize(new Point((int)elipseW,(int)elipseH/2));       
        
        generarShape();
    }
    
    /**
     * Mueve la figura a la posicion indicada, actualizando las posiciones
     * de las figuras que la forman
     * @param p posicion nueva
     */
    @Override
    public void moveTo(Point2D p){
        this.setPosition((Point) p);        
        
        elipseX = (float) p.getX()-getOffsetX();
        elipseY = (float) p.getY()-getOffsetY();
        
        rectanguloX = elipseX;
    
        if(posRelativa){
            elipseY = (float) p.getY()-getOffsetY()-getSize().y;
            
            rectanguloY = elipseY-elipseH/2;
        }else{
            rectanguloY = elipseY+elipseH/2; 
        }     
        
        fixPosition();
    }
    
    /**
     * Genera el area de la figura semicirculo substrayendo el area de un
     * rectangulo del area de una elipse
     */
    private void generarShape(){
        elipse = new Ellipse2D.Float(elipseX, elipseY, elipseW, elipseH);
        rectangulo = new Rectangle2D.Float(rectanguloX, rectanguloY, elipseW, elipseH);
        
        areaElipse = new Area(elipse);
        areaRectangulo = new Area(rectangulo);
    
        areaElipse.subtract(areaRectangulo);   
    }
    
    
    /**
     * Actualiza el relleno de la figura
     * @param relleno 
     */
    @Override
    public void setRelleno(boolean relleno){
        this.relleno = relleno;
    }
    
}
