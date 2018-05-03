/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cvare
 */
public class NumeroComplejo {
    public int real;
    public int imaginario;

    public NumeroComplejo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
   
    public String format(){
        return this.real + " + " + this.imaginario + "i";
    }
}
