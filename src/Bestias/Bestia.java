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
    String M_entrenar();
    String M_atacar();
    String M_defender();
    //METODOS EDIFICACION:
    String E_generar();
    String E_recolectar();
    //METODOS VEHICULO:
    void V_construccion();
    String V_atacar();
    //CENTRO DE MANDO
    ArrayList<Integer> generarCB();
    void mejorarCB(int num,ArrayList<Integer> Centro);
    void mostrarCB(ArrayList<Integer> Centro);
}
