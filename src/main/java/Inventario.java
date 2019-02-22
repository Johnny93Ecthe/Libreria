/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *En esta clase se manejara todo el stock de la tienda desde la cantidad de libros en almacen,
 * el mas y menos vendido, facturas, su posterior modificacion o borrado del inventario.
 * @author Jhonny Rojas
 */
public class Inventario {
    private String[] invetarioLibros;
    private int vendidos;
    
    
    /**
     * En estas variables dos de tipo array de string y un entero:
     * @param invetarioLibros muestra la cantidad de libros que hay en el inventario, de forma general.
     * @param vendidos filtra en la cantidad que se han vendido, el que mas se ha vendido 
     * y el que menos lo ha hecho.
     * 
     */

    public Inventario(String[] invetarioLibros, int vendidos) {
        this.invetarioLibros = invetarioLibros;
        this.vendidos = vendidos;
        
    }
    
    
    public void insertarLibro() {
        /**
         * Este metodo sera utlizado para registrar los libros con
         * su respectiva caracteristica en la base de datos.
         */
    }

  
    public void verInventario(){
    /**
     * En este metodo se solicitara el stock en general o especifico de los libros que se hayan registrados 
     * en la libreria. Unicamente para ver la cabtidad existente de los mismos.
     */   
     
    }
    
    public void inventarioVentas(){
    /**
     * Este metodo solicita el stock de ventas para filtar la cantidad que mas se vendido, la que menos
     * se ha vendido igual.     
     */
        
    }
   
    
    public void modificarLibro(){
    /**
     * Este metodo, modifica las caracteristicas del libro ya especificadas cuando sea necesario o deseado.
     */
    
    
    }
    
    public void eliminarLibro(){
    /**
     * Este metodo, elimina el libro del stock.
     */
    }
    
  
    public String[] getInvetarioLibros() {
        return invetarioLibros;
    }

    public int getVendidos() {
        return vendidos;
    }

   
    
}
