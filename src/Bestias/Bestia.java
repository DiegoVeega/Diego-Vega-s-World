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
    void V_construccion();
    String V_atacar();
    //CENTRO DE MANDO
    ArrayList<Integer> generarCB();
    ArrayList<Integer> mejorarCB(int num,ArrayList<Integer> Centro);
    void mostrarCB(ArrayList<Integer> Centro);
}
