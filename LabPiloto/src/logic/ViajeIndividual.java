/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Date;

/**
 *
 * @author INGESIS
 */
public class ViajeIndividual extends Viaje {
    // Constructor    
    
    public ViajeIndividual() {
        
    }

    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    //No se sobreescribe cualquierMetodo2()
}
