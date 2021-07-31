/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.text.DecimalFormat;

/**
 *
 * @author Mario
 */
public class Funcion {
   
    DecimalFormat formatear = new DecimalFormat("#.00000");
    
    //(π(1-e^-x)/x)-0.5
    
    
    
    public double fxa (double xa)
    {
        double vpi = Math.PI;
        double dTemp = Math.pow(Math.E, -xa);
        
        return Double.parseDouble(formatear.format((vpi*(1-dTemp)/xa)-0.5));
    }
    
    public double fxb (double xb)
    {
        double vpi = Math.PI;
        double dTemp = Math.pow(Math.E, -xb);
        return Double.parseDouble(formatear.format((vpi*(1-dTemp)/xb)-0.5));
    }
    
    public double xr(double xa, double xb, double fxa, double fxb)
    {
//        double nom = fxb*(xb-xa);
//        double dem = fxb-fxa;
        return Double.parseDouble(formatear.format(xb-(fxb*(xb-xa))/(fxb-fxa)));
    }
    public double fxr (double xr)
    {
        double vpi = Math.PI;
        double dTemp = Math.pow(Math.E, -xr);
        
        return Double.parseDouble(formatear.format((vpi*(1-dTemp)/xr)-0.5));
    }
}
