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
public class Recolector_Luz implements Bestia{

    @Override
    public String M_entrenar() {
        return null;
    }

    @Override
    public String M_atacar() {
        return null;
    }

    @Override
    public String M_defender() {
        return null;
    }

    @Override
    public int E_generar() {
        int luz=100;
        return luz;
    }

    @Override
    public ArrayList<Integer> E_recolectar(int a, ArrayList<Integer> Centro) {
        Centro.set(2, +a);
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
    public void mejorarCB(int num, ArrayList<Integer> Centro) {
        
    }

    @Override
    public void mostrarCB(ArrayList<Integer> Centro) {
        
    }

    
    
}
