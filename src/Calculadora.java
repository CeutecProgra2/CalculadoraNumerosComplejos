/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cvare
 */
public class Calculadora {
    public NumeroComplejo sumar(NumeroComplejo n1, NumeroComplejo n2){
        int reales = n1.real + n2.real;
        int imaginarios = n1.imaginario + n2.imaginario;
        return new NumeroComplejo(reales,imaginarios);
    }
    
     public NumeroComplejo restar(NumeroComplejo n1, NumeroComplejo n2){
        int reales = n1.real - n2.real;
        int imaginarios = n1.imaginario - n2.imaginario;
        return new NumeroComplejo(reales,imaginarios);
    }
   
}
