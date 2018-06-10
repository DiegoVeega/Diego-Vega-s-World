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
public class EsqueletoColosal implements Esqueleto{
    
    
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
    public int E_generar() {
        return 0;
    }

    @Override
    public ArrayList<Integer> E_recolectar(int a, ArrayList<Integer> Centro) {
        return null;
    }
    //METODOS VEHICULO.
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
