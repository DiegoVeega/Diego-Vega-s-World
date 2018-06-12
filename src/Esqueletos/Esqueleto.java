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
public interface Esqueleto {
    //METODOS MILICIA:
    ArrayList<Horda> M_entrenar(ArrayList<Integer> Centro);
    void M_atacar(ArrayList<Horda> Horda,ArrayList<Integer> Centro);
    void M_defender(ArrayList<Horda> Horda,ArrayList<Integer> Centro);
    
    ArrayList<EsqueletoColosal> M_entrenarE(ArrayList<Integer> Centro);
    void M_atacarE(ArrayList<EsqueletoColosal> EsqueletoColosal, ArrayList<Integer> Centro);
    void M_defenderE(ArrayList<EsqueletoColosal> EsqueletoColosal, ArrayList<Integer> Centro);
    //METODOS EDIFICACION:
    int E_generar();
    ArrayList<Integer> E_recolectar(int a,ArrayList<Integer> Centro);
    //METODOS VEHICULO:
    ArrayList<VLigero_E> V_construccion(ArrayList<Integer> Centro);
    void V_atacar(ArrayList<VLigero_E> VLigero_E,ArrayList<Integer> Centro);
    
    ArrayList<VPesado_E> V_construccionP(ArrayList<Integer> Centro);
    void V_atacarP(ArrayList<VPesado_E> VPesado_E, ArrayList<Integer> Centro);
    //CENTRO DE MANDO
    ArrayList<Integer> generarCE();
    ArrayList<Integer> mejorarCE(int num,ArrayList<Integer> Centro);
    void mostrarCE(ArrayList<Integer> Centro);
}
