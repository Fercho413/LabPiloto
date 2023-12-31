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
public class ViajeIncentivo extends Viaje {
    /**
    * Empresa que patrocina el viaje al empleado
    */
    private String empresa;
    //Constructor, getters and setters

    public ViajeIncentivo( String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada,String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }
    
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa empresa";
    }
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
       
    
    public String cualquierMetodo2() {
        return"Método implementado en la clase hija viaje de incentivo";
    }
}