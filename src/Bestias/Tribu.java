/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestias;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Tribu implements Bestia{
    //METODOS MILICIA.
    @Override
    public String M_entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String M_atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String M_defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //METODOS EDIFICACION.
    @Override
    public String E_generar() {
        return null;
    }

    @Override
    public String E_recolectar() {
        return null;
    }
    //METODOS VEHICULO.
    @Override
    public void V_construccion() {
        
    }

    @Override
    public String V_atacar() {
        return null;
    }

    @Override
    public ArrayList<Integer> generarCB() {
        return null;
    }

    @Override
    public void mejorarCB(int num, ArrayList<Integer> Centro) {
        
    }

    @Override
    public void mostrarCB(ArrayList<Integer> Centro) {
        
    }

    
    
}
