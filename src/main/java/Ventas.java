
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Este metodo define el proceso de venta, facturacion y demas.
 * Consistiendo tambien para la alerta de cantidad en el stock
 *
 * @author Jhonny Rojas
 */
public class Ventas {
    
    private String nombreCliente;
    private long cedulaCliente;
    private String direccion;
    private int cantCompra;
    private String tituloLibroVendido;
    /**
     * Las variables:
     * @param nombreCliente que se recibe del vendedor
     * @param cedulaCliente
     * @param direccion
     * @param cantCompra Igualmente se recibe del vendedor
     */
    

    public Ventas(String nombreCliente, long cedulaCliente, String direccion, int cantCompra, String tituloLibroVendido) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.direccion = direccion;
        this.cantCompra = cantCompra;
        this.tituloLibroVendido = tituloLibroVendido;
    }
    
    public void Comprar(){
        
       /**
        * En este metodo se hará el proceso de venta, trayendo de base de datos la informacion
        * para la futura facturacion, disminutendo la cantidad en stock y amuentando la cantidad vendida.
        */
    
    }
    
    
    public void alertaCantidad(){
    /**
     * Aqui se hara el proceso de envio de la alerta cuando la cantidad disminuya, segun acordado o requerido
     * para la solicitud de nuevos ejemplares.
     */
    
    
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public long getCedulaCliente() {
        return cedulaCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantCompra() {
        return cantCompra;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setCedulaCliente(long cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCantCompra(int cantCompra) {
        this.cantCompra = cantCompra;
    }
    
    
    
    
    
    
    
    
    
    
    
            
  
}
