/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esqueletos;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Recolector_Oro implements Esqueleto{

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
        int oro=100;
        return oro;
    }

    @Override
    public ArrayList<Integer> E_recolectar(int a, ArrayList<Integer> Centro) {
        Centro.set(1, +a);
        return Centro;
    }

    @Override
    public String V_construccion() {
        return null;
    }

    @Override
    public String V_atacar() {
        return null;
    }

    @Override
    public ArrayList<Integer> generarCE() {
        return null;
    }

    @Override
    public void mejorarCE(int num, ArrayList<Integer> Centro) {
        
    }

    @Override
    public void mostrarCE(ArrayList<Integer> Centro) {
        
    }

    
}
