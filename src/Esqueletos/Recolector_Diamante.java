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
public class Recolector_Diamante implements Esqueleto{

    @Override
    public int E_generar() {
        int diamante=100;
        return diamante;
    }

    @Override
    public ArrayList<Integer> E_recolectar(int a, ArrayList<Integer> Centro) {
        Centro.set(2, +a);
        return Centro;
    }

    @Override
    public ArrayList<Integer> generarCE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarCE(ArrayList<Integer> Centro) {
        
    }

    @Override
    public ArrayList<Horda> M_entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacar(ArrayList<Horda> Horda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defender(ArrayList<Horda> Horda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EsqueletoColosal> M_entrenarE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacarE(ArrayList<EsqueletoColosal> EsqueletoColosal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defenderE(ArrayList<EsqueletoColosal> EsqueletoColosal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VLigero_E> V_construccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacar(ArrayList<VLigero_E> VLigero_E) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VPesado_E> V_construccionP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacarP(ArrayList<VPesado_E> VPesado_B) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Integer> mejorarCE(int num, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
