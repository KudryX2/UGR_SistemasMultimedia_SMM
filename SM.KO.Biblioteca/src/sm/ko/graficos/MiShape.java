/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ko.graficos;

import java.awt.AlphaComposite;
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
public class MiShape{

    private TipoForma tipoForma;
    
    private Point position,size;
    private boolean fixed;
    
    private int offsetX,offsetY;
    
    private Color color;
    private BasicStroke grosor;
    private Composite transparencia;
    private RenderingHints alisado;
    
    /**
     * Constructor de la clase MiShape, crea un objeto con los parametros dados
     * @param tipoForma
     * @param position
     * @param color
     * @param grosor
     * @param transparencia
     * @param alisado 
     */
    public MiShape(TipoForma tipoForma, Point position ,Color color, BasicStroke grosor, Composite transparencia, RenderingHints alisado){
        this.tipoForma = tipoForma;
        this.position = position;
        this.size = null;
        fixed = false;
        
        offsetX = 0;
        offsetY = 0;
        
        this.color = color;
        this.grosor = grosor;
        this.transparencia = transparencia;
        this.alisado = alisado;
    } 
    
    /*
        Aplicar atributos
    */
    /**
     * Aplica los atributos de la figura a dbujar al renderizador de esta
     * forma al dubujarse una figura lo hace con las caracteristicas que
     * tiene especificadas
     * @param g2d renderizador
     */
    public void setGraphicsParams(Graphics2D g2d){
        g2d.setColor(color);
        
        if(grosor != null)
            g2d.setStroke(grosor);
        
        if(transparencia != null)
            g2d.setComposite(transparencia);
        else
            g2d.setComposite(AlphaComposite.SrcOver);
        
        if(alisado != null)
            g2d.setRenderingHints(alisado);
        else
            g2d.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF));
    
    }
    
    /**
     * Metodo llamado para dibujar una figura
     * @param g2d 
     */
    public void draw(Graphics2D g2d) {}

    /**
     * Función que modifica la posición de la figura, la nueva posición
     * se actualiza con el parametro position
     * @param position posición nueva
     */
    public void setPosition(Point position){
        if(!fixed)
            this.position = position;
    }
    
    /**
     * Función que modifica el tamaño de una figura, el tamaño nuevo se 
     * modifica con el parametro size
     * @param size tamaño nuevo
     */
    public void setSize(Point size){
        if(!fixed)
            this.size = size;
    }
    
    /**
     * Metodo cuya funcion es corregir la posicion de la figura, se utiliza 
     * cuando la figura tiene tamaño negativo es decir se dibuja al revez y 
     * no se renderiza, este metodo modifica la posicion y el tamaño de la 
     * figura de forma que esta se visualizara correctamente sin variar su
     * posicion y tamaño aparentes
     */
    public void fixPosition(){}

    /**
     * Funcion para establecer el atributo fixed a true, de esta forma ya no
     * se podra corregir mas su posicion
     */
    public void setFixedTrue(){
        fixed = true;
    }
    
    /**
     * Funcion para establecer el atributo fixed a false, de esta forma 
     * se podra volver a corregir su posicion, se usa cuando se quiere 
     * mover la figura.
    **/
    public void setFixedFalse(){
        fixed = false;
    }
    
    /**
     * Funcion que devuelve verdadero o falso dependiendo de que si el punto 
     * dado se encuentra dentro de la figura o no.
     * @param p punto a comprobar si esta dentro o no
     * @return 
     */
    public boolean contains(Point2D p) {
        if(p.getX() < position.x  || position.y > p.getY() || p.getX() > position.x+size.x ||  p.getY() > position.y+size.y){
            return false;
        }
        return true;
    }
    
    /**
     * Funcion que calcula la diferencia entre la posicion de la figura y 
     * la posicion del raton en el momento de ser seleccionada.
     * Los valores obtenidos permiten seleccionar una figura y moverla sin 
     * que la posicion relativa de esta y el raton cambien.
     * @param p posicion del raton
     */
    public void setOffset(Point2D p){
        offsetX = (int) Math.abs(getPosition().x-p.getX());
        offsetY = (int) Math.abs(getPosition().y-p.getY());
    }
    
    /**
     * Mueve la figura a una posición dada
     * @param p posicion nueva
     */
    public void moveTo(Point2D p){
        position.x = (int) (p.getX() - offsetX);
        position.y = (int) (p.getY() - offsetY); 
    }
     
    /**
     * Incrementa los pasos realizados en el dibujado de la digura, util para 
     * la digura "Curva" ya que se necesitan varios pasos para dibujarla
     */
    public void increaseStep(){}
    
    /**
     * Devuelve el paso de dibujado de la figura, necesario para la figura
     * "Curva"
     * @return pasos 
     */
    public int getStep(){
        return 0;
    }
    
    /*
        Setters
    */
    
    /**
     * Cambia el color de la figura al color indicado
     * @param color color nuevo
     */
    public void setColor(Color color){
        this.color = color;
    }
    
    /**
     * Cambia el relleno de una figura a verdadero o falso
     * @param relleno relleno 
     */
    public void setRelleno(boolean relleno){}
    
    /**
     * Cambia el grosor de la figura por el grosor proporcionado
     * @param grosor grosor nuevo
     */
    public void setGrosor(BasicStroke grosor){
        this.grosor = grosor;
    }
    
    /**
     * Actualiza la transparencia de la figura
     * @param transparencia transparencia nueva
     */
    public void setTransparencia(Composite transparencia){
        this.transparencia = transparencia;
    }
    
    /**
     * Actualiza el alisado de una digura
     * @param alisado alisado nuevo
     */
    public void setAlisado(RenderingHints alisado){
        this.alisado = alisado;
    }
    
    /*
        Getters
    */
    
    /**
     * Revuelvo el tipo de forma de la figura
     * @return tipo de figura
     */
    public TipoForma getTipoForma(){
        return tipoForma;
    }
    
    /**
     * Devuelve la posición de la figura
     * @return posicion
     */
    public Point getPosition(){
        return position;
    }
    
    /**
     * Devuelve el tamaño de la figura
     * @return tamaño
     */
    public Point getSize(){
        return size;    
    } 
    
    /**
     * Devuelve el grosor de la figura
     * @return grosor
     */
    public BasicStroke getStroke(){
        return grosor;
    }
    
    /**
     * Devuelve la posicion relativa de la figura y el raton en el eje X
     * @return posicion relativa x
     */
    public int getOffsetX(){
        return offsetX;
    }

    /**
     * Devuelve la posicion relativa de la figura y el raton en el eje T
     * @return posicion relativa y
     */    
    public int getOffsetY(){
        return offsetY;
    }
    
    /**
     * Devuelve si la posicion ha sido arreglada o no
     * @return posicion arreglada
     */
    public boolean getFixedPosition(){
        return fixed;
    }
    
}
