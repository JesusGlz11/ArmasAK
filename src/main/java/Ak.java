/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Ak {
    
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double velocidadDisparo;
    double precio;
    int danio;
    
    //a las funciones o acciones les llamamos//Metodos son las acciones e interaciones del obejto
    public void disparar(){
        System.out.println("Te estoy disparando con un daño de: "+danio);
    }
    public void apuntar(){}
    public void cargar(){}

    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidadCarga=" + velocidadCarga + ", velocidadDisparo=" + velocidadDisparo + ", precio=" + precio + ", danio=" + danio + '}';
    }
    
    
    
}
    

