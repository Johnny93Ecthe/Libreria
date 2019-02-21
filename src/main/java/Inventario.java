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
    private String[] vendidos;
    private int idLibro;
    /**
     * En estas variables dos de tipo array de string y un entero:
     * @param invetarioLibros muestra la cantidad de libros que hay en el inventario, de forma general.
     * @param vendidos filtra en la cantidad que se han vendido, el que mas se ha vendido 
     * y el que menos lo ha hecho.
     * @param idLibro variable que sera de mucha ayuda a la hora de la consultar o llamar el libro deseado
     * por nomenclatura deseada.
     */

    public Inventario(String[] invetarioLibros, String[] vendidos, int idLibro) {
        this.invetarioLibros = invetarioLibros;
        this.vendidos = vendidos;
        this.idLibro = idLibro;
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
    
    public void ventas(){
        /**
         * Este metodo ayuda en la facturacion del libro a la hora de la venta.
         * Teniendo en cuenta que una facturacion puede contener n cantidad de libros.
         * Tambien tomando como proceso la modificacion "automarica" del stock de los articulos vendidos.
         */
    
    
    }

    public String[] getInvetarioLibros() {
        return invetarioLibros;
    }

    public String[] getVendidos() {
        return vendidos;
    }

    public int getIdLibro() {
        return idLibro;
    }
    
    
    
}
