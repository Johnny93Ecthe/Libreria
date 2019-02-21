/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny Rojas
 */
public class Libro {
    /**
     * La clase libro, es aqui donde se inicializa la caracteristicas principales
     * del abjeto el cual se va a manejar, en este caso libros.
     */
    protected int precio;
    private String nombreLibro;
    private String nombreAutor;
    private String editorial;
    private int cantidad;
    /**
     * Estos son los parametros definidos al inicio de la clase Libro.
     * @param precio 
     * @param nombreLibro
     * @param nombreAutor
     * @param editorial
     * @param cantidad para identificar la cantidad de libros ingresados y/o existentes
     */

    public Libro(int precio, String nombreLibro, String nombreAutor, String editorial, int cantidad) {
        this.precio = precio;
        this.nombreLibro = nombreLibro;
        this.nombreAutor = nombreAutor;
        this.editorial = editorial;
        this.cantidad = cantidad;
    }

    
    public void insertarLibro(){
        /**
         * Este metodo sera utlizado para registrar los libros con
         * su respectiva caracteristica en la base de datos.
         */
        
        
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
    
    
  
    
