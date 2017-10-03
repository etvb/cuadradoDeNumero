/*
 * Ejercicio 1: leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 */
package pats.pkg30.pkg1.cuadradodenumero;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS301CuadradoDeNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));
        
        while(numero >=0){
            cuadrado = (int)Math.pow(numero,2);
            JOptionPane.showMessageDialog(null, "El cuadrado de "+numero+" es igual a: "+cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro valor"));

        }
    }
    
}
