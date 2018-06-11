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
    ArrayList<Horda> M_entrenar();
    void M_atacar(ArrayList<Horda> Horda);
    void M_defender(ArrayList<Horda> Horda);
    
    ArrayList<EsqueletoColosal> M_entrenarE();
    void M_atacarE(ArrayList<EsqueletoColosal> EsqueletoColosal);
    void M_defenderE(ArrayList<EsqueletoColosal> EsqueletoColosal);
    //METODOS EDIFICACION:
    int E_generar();
    ArrayList<Integer> E_recolectar(int a,ArrayList<Integer> Centro);
    //METODOS VEHICULO:
    ArrayList<VLigero_E> V_construccion();
    void V_atacar(ArrayList<VLigero_E> VLigero_E);
    
    ArrayList<VPesado_E> V_construccionP();
    void V_atacarP(ArrayList<VPesado_E> VPesado_E);
    //CENTRO DE MANDO
    ArrayList<Integer> generarCE();
    ArrayList<Integer> mejorarCE(int num,ArrayList<Integer> Centro);
    void mostrarCE(ArrayList<Integer> Centro);
}
