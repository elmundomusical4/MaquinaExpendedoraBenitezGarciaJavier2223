/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaexpendedora;

/**
 * Clase MaquinaExpendedoraBenitezGarciaJavier2223, que tiene los métodos usados por la clase Main
 *
 * @author Javier Benítez García
 */

/**
* Método MaquinaExpendedoraBenitezGarciaJavier2223.
* Es el método principal de la clase
*/
public class MaquinaExpendedoraBenitezGarciaJavier2223 {// Consideramos máquina snack precio único
    private int unidades;//número de snacks disponbles en la máquina expendora 
    private double precio;//precio actual de un snack
    private double precioMaximoBenitezGarciaJavier2223;//precio máximo que puede tener un snack

    /**
     * Constructor por defecto
     */
    public MaquinaExpendedoraBenitezGarciaJavier2223() {
    
    }
    
    
     /**
      * Constructor por parámetros del método principal de esta clase
      * 
      * @param unidades numero de snacks disponibles en la máquina
      * @param precio precio actual de un snack
      * @param precio_max precio máximo que puede tener un snack
      */
    public MaquinaExpendedoraBenitezGarciaJavier2223(int unidades, double precio, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.precioMaximoBenitezGarciaJavier2223 = precio_max;
    }
    
    /**
     * Método obtenerUnidades.
     * 
     * Método que devuelve el número de snack que tiene la máquina
     */
    public int obtenerUnidades() {
        return this.unidades;
    }

    /**
     * Método obtenerPrecio.
     * 
     * Método que devuelve el precio que tiene cada snack
     */
    public double obtenerPrecio() {
        return this.getPrecio();
    }
    
     /**
      * Método modificarUnidades.
      * 
      * Método que permite modificar el número de snack dsiponbles de la máquina
      * 
      * @param unidades número de unidades a modificar
      */
    public void modificarUnidades(int unidades) {
        this.unidades = unidades;
    }
    
     /**
      * Método aumentarPrecio.
      * 
      * Método que permite aumentar el precio de venta, suma al precio actual 
      * el aumento que se indica siempre que no se sobrepase el precio máximo de venta
      * 
      * @param aumento cuantos euros debe aumentar el precio
      * @throws Exception el aumento debe ser positivo o no se puede superar el precio máximo
      */
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecioMaximoBenitezGarciaJavier2223() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }
    
       
    
    /**
     * Método sacarsnack.
     * 
     * Método que permite obtener un snack si se tiene suficiente dinero y hay 
     * suficientes unidades en la máquina
     *
     * @param unidades cuantos snacks se quiere sacar de la máquina expendedora
     * @param dinero cuanto dinero hay disponible
     * @param regaloBenitezGarciaJavier2223 por defecto tiene el valor "pegatina"
     * @throws Exception No puede introducirse un valor negativo para el dinero, no tiene suficiente dinero
     * la cantidad de snacks no puede ser negativa o no hay suficientes snack en la máquina
     */
    public void sacarsnack(int unidades, double dinero, String regaloBenitezGarciaJavier2223) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No puede introducirse un valor negativo para el dinero");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("La cantidad de snacks no puede ser negativa");
        }
        if (this.unidades <= unidades) {
            throw new Exception("No hay suficientes snack en la máquina");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }

    /**
     * Método getPrecio.
     * 
     * Devuelve el precio actual de los snacks
     * 
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método setPrecio.
     * 
     * Establece un nuevo precio a los snacks
     * 
     * @param precio nuevo precio a establecer
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método getPrecioMaximoBenitezGarciaJavier2223.
     * 
     * Devuelve el precio máximo actual
     * 
     * @return the precioMaximoBenitezGarciaJavier2223
     */
    public double getPrecioMaximoBenitezGarciaJavier2223() {
        return precioMaximoBenitezGarciaJavier2223;
    }

    /**
     * Método setPrecioMaximoBenitezGarciaJavier2223.
     * 
     * Establece un nuevo precio máximo a los snacks
     * 
     * @param precioMaximoBenitezGarciaJavier2223 nuevo precio máximo a establecer
     */
    public void setPrecioMaximoBenitezGarciaJavier2223(double precioMaximoBenitezGarciaJavier2223) {
        this.precioMaximoBenitezGarciaJavier2223 = precioMaximoBenitezGarciaJavier2223;
    }

}
