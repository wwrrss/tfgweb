/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.vista;

import java.util.Date;

/**
 *
 * @author Willian
 */
public class SesionProduccion {
    private static int idProducto=0;
    private static Date hora_inicio;
    private static int cantidad=0;

    public static int getIdProducto() {
        return idProducto;
    }

    public static void setIdProducto(int idProducto) {
        SesionProduccion.idProducto = idProducto;
    }

    public static Date getHora_inicio() {
        return hora_inicio;
    }

    public static void setHora_inicio(Date hora_inicio) {
        SesionProduccion.hora_inicio = hora_inicio;
    }

    public static synchronized int getCantidad() {
        return cantidad;
    }

    public static synchronized void  setCantidad(int cantidad) {
        SesionProduccion.cantidad = cantidad;
    }
    
    
    
}
