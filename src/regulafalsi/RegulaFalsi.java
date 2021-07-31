/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regulafalsi;

import Entidades.Funcion;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class RegulaFalsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Práctica04");
        
        
        DecimalFormat format = new DecimalFormat("#.00000");
        ArrayList<Double> error = new ArrayList<>();
        
        Funcion func = new Funcion();
        
        double xa, xb, xr, xaxr;
        xa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese xa: "));
        xb = Double.parseDouble(JOptionPane.showInputDialog("Ingrese xb: "));
        
         for (int i = 0; i < 4; i++) 
        {
     
        xr = func.xr(xa, xb, func.fxa(xa), func.fxb(xb));
        error.add(i, xr);
        JOptionPane.showMessageDialog(null, xr);
        JOptionPane.showMessageDialog(null, func.fxr(xr));
        xaxr = Double.parseDouble(format.format(func.fxa(xa)*func.fxr(xr)));
        JOptionPane.showMessageDialog(null, xaxr);   
          if (xaxr<0)
        {
          xb = xr;
        }
        else
        {
          xa = xr;
        }
        if (i>0)
        {
          JOptionPane.showMessageDialog(null, format.format(((error.get(i)-error.get(i-1))/error.get(i))*100));
        }
          
        }
         
      
//        JOptionPane.showMessageDialog(null, xa);
//        if (xaxr>0)
//        {
//          xb = xb;  
//        }
//        else
//        {
//          xb = xr;
//        }
//        JOptionPane.showMessageDialog(null, xb);
        
//        xr = func.xr(xa, xb, func.fxa(xa), func.fxb(xb));
//        
//        JOptionPane.showMessageDialog(null, xr);
//        JOptionPane.showMessageDialog(null, func.fxr(xr));
//        xaxr = Double.parseDouble(format.format(func.fxa(xa)*func.fxr(xr)));
//        JOptionPane.showMessageDialog(null, xaxr);  
        
      
        
     
    }
    
}
