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
public interface Bestia {
    //METODOS MILICIA:
    ArrayList<Tribu> M_entrenar();
    void M_atacar(ArrayList<Tribu> Tribu);
    void M_defender(ArrayList<Tribu> Tribu);
    
    ArrayList<BestiaMayor> M_entrenarE();
    void M_atacarE(ArrayList<BestiaMayor> BestiaMayor);
    void M_defenderE(ArrayList<BestiaMayor> BestiaMayor);
    //METODOS EDIFICACION:
    int E_generar();
    ArrayList<Integer> E_recolectar(int a,ArrayList<Integer> Centro);
    //METODOS VEHICULO:
    ArrayList<VLigero_B> V_construccion();
    void V_atacar(ArrayList<VLigero_B> VLigero_B);
    
    ArrayList<VPesado_B> V_construccionP();
    void V_atacarP(ArrayList<VPesado_B> VPesado_B);
    //CENTRO DE MANDO
    ArrayList<Integer> generarCB();
    ArrayList<Integer> mejorarCB(int num,ArrayList<Integer> Centro);
    void mostrarCB(ArrayList<Integer> Centro);
}
