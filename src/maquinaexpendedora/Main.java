/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinaexpendedora;

/**
 * Clase main del programa, que define un objeto "Máquina Expendedora" con unos parámetros y realiza
 * acciones de subir el precio y de sacar snacks de ella.
 * 
 * @author Javier Benítez García
 * @version Trabajo final
 */
public class Main {

    /**
     * Método main.
     * Es el método principal de ejecución del programa
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MaquinaExpendedoraBenitezGarciaJavier2223 snack;
       
        
        snack=new MaquinaExpendedoraBenitezGarciaJavier2223(13,2,5);
        sube1_PrecioBenitezGarciaJavier2223(snack);
        
        sube2_PrecioBenitezGarciaJavier2223(snack);
        
        obtener1_UnidadesBenitezGarciaJavier2223(snack);
        
        obtener2_UnidadesBenitezGarcia2223(snack);
        
        obtener3_UnidadesBenitezGarciaJavier2223(snack);
        
    }

    /** Método  obtener3_UnidadesBenitezGarciaJavier2223.
    * 
    * Vamos a intentar sacar 12 snack, y tengo 50 euros.
    * Como no hay unidades suficientes en la máquina saltará
    * una excepción y no se modificará el nº de unidades de la tienda
    * 
    * @param snack hace referencia a la clase MaquinaExpendedoraBenitezGarciaJavier2223
    * @throws Exception si no hay suficientes unidades para obtener
    */
    private static void obtener3_UnidadesBenitezGarciaJavier2223(MaquinaExpendedoraBenitezGarciaJavier2223 snack) {
        try {
            System.out.println("3º.- Vamos a sacar snacks (queremos 12 y tenemos 50 €)");
            snack.sacarsnack(12, 50, "pegatina");
            System.out.println("Operación realizada, ahora tiene "+snack.obtenerUnidades()+" unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes unidades");
            System.out.println("El nº de unidades sigue siendo: "+snack.obtenerUnidades());
            
        }
    }

    /** Método  obtener2_UnidadesBenitezGarciaJavier2223.
    * 
    * Vamos a intentar sacar 2 snack, y tengo 9 euros.
    * Ahora se actualizará el número de snack que tenemos en
    * la máquina
    * 
    * @param snack hace referencia a la clase MaquinaExpendedoraBenitezGarciaJavier2223
    * @throws Exception si no hay suficiente dinero
    */
    private static void obtener2_UnidadesBenitezGarcia2223(MaquinaExpendedoraBenitezGarciaJavier2223 snack) {
        try {
            System.out.println("2º.- Vamos a sacar snacks (queremos 2 y tenemos 9 €)");
            snack.sacarsnack(2, 9, "pegatina");
            System.out.println("Operación realizada, ahora tiene "+snack.obtenerUnidades()+" unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes dinero");
            System.out.println("El nº de unidades sigue siendo: "+snack.obtenerUnidades());
            
        }
    }

    /** Método  obtener1_UnidadesBenitezGarciaJavier2223.
    * 
    * Vamos a intentar sacar 2 snack, y tengo 5 euros.
    * Como no hay dinero suficiente saltará
    * una excepción y no se modificará el nº de unidades de la tienda
    * 
    * @param snack hace referencia a la clase MaquinaExpendedoraBenitezGarciaJavier2223
    * @throws Exception si no hay suficiente dinero
    */
    private static void obtener1_UnidadesBenitezGarciaJavier2223(MaquinaExpendedoraBenitezGarciaJavier2223 snack) {
        try {
            System.out.println("1º.- Vamos a sacar snacks (queremos 2 y tenemos 5 €)");
            snack.sacarsnack(2, 5, "pegatina");
            System.out.println("Operación realizada, ahora tiene "+snack.obtenerUnidades()+" unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes dinero");
            System.out.println("El nº de unidades sigue siendo: "+snack.obtenerUnidades());
            
        }
    }

    /** Método  sube2_PrecioBenitezGarciaJavier2223.
    * 
    * Vamos a aumentar el precio 3€, como supera el precio máximo establecido la operación
    * no tendrá éxito y se mantendrá el precio anterior
    * 
    * @param snack hace referencia a la clase MaquinaExpendedoraBenitezGarciaJavier2223
    * @throws Exception si se supera el precio máximo de 5€
    */
    private static void sube2_PrecioBenitezGarciaJavier2223(MaquinaExpendedoraBenitezGarciaJavier2223 snack) {
        try {
            System.out.println("Vamos a aumentar el precio de venta de un snack por encima del precio máximo");
            snack.aumentarPrecio(3);
            System.out.println("El precio actual es "+snack.obtenerPrecio()+" €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio porque se supera el precio máximo de 5 €");
        }
    }

    /** Método  sube1_PrecioBenitezGarciaJavier2223.
    * 
    * Vamos a aumentar el precio 1€, como no supera el precio máximo establecido la operación
    * tendrá éxito y el nuevo precio será de 3€
    * 
    * @param snack hace referencia a la clase MaquinaExpendedoraBenitezGarciaJavier2223
    * @throws Exception si ocurre un error al aumentar el precio
    */
    private static void sube1_PrecioBenitezGarciaJavier2223(MaquinaExpendedoraBenitezGarciaJavier2223 snack) {
        try {
            System.out.println("Vamos a aumentar el precio de venta de un snack por debajos del precio máximo");
            snack.aumentarPrecio(1);
            System.out.println("El precio actual es "+snack.obtenerPrecio()+" €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio");
        }
    }
    
}
