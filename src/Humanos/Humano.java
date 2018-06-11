/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Humanos;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface Humano {
    //METODOS MILICIA:
    ArrayList<Soldados> M_entrenar();
    void M_atacar(ArrayList<Soldados> Tribu);
    void M_defender(ArrayList<Soldados> Tribu);
    
    ArrayList<Especialista> M_entrenarE();
    void M_atacarE(ArrayList<Especialista> Especialista);
    void M_defenderE(ArrayList<Especialista> Especialista);
    //METODOS EDIFICACION:
    int E_generar();
    ArrayList<Integer> E_recolectar(int a,ArrayList<Integer> Centro);
    //METODOS VEHICULO:
    ArrayList<VLigero_H> V_construccion();
    void V_atacar(ArrayList<VLigero_H> VLigero_H);
    
    ArrayList<VPesado_H> V_construccionP();
    void V_atacarP(ArrayList<VPesado_H> VPesado_H);
    //CENTRO DE MANDO
    ArrayList<Integer> generarCH();
    ArrayList<Integer> mejorarCH(int num,ArrayList<Integer> Centro);
    void mostrarCH(ArrayList<Integer> Centro);
}
