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
public class Recolector_Cristal implements Bestia{

    @Override
    public int E_generar() {
        int cristal=100;
        return cristal;
    }

    @Override
    public ArrayList<Integer> E_recolectar(int a, ArrayList<Integer> Centro) {
        Centro.set(1, +a);
        return Centro;
    }

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
    public void mostrarCB(ArrayList<Integer> Centro) {
        
    }

    @Override
    public ArrayList<Tribu> M_entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacar(ArrayList<Tribu> Tribu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defender(ArrayList<Tribu> Tribu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BestiaMayor> M_entrenarE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacarE(ArrayList<BestiaMayor> BestiaMayor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defenderE(ArrayList<BestiaMayor> BestiaMayor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Integer> mejorarCB(int num, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
